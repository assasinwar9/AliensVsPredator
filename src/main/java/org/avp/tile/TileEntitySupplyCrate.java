package org.avp.tile;

import org.avp.AliensVsPredator;
import org.avp.api.machines.IOpenable;
import org.avp.inventory.ContainerSupplyCrate;
import org.avp.item.ItemSupplyChute.SupplyChuteType;
import org.avp.packets.client.PacketOpenable;

import com.arisux.mdxlib.lib.world.tile.IRotatable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;


public class TileEntitySupplyCrate extends TileEntity implements IOpenable, IRotatable
{
	public InventoryBasic inventory;
	private EnumFacing direction;
	public Container container;
	private boolean isOpen;
	private SupplyChuteType type;

	public TileEntitySupplyCrate()
	{
		super();
		this.isOpen = false;
		this.inventory = new InventoryBasic("container.supplycrate.slots", true, 64);
	}

    @Override
    public SPacketUpdateTileEntity getUpdatePacket()
    {
        return new SPacketUpdateTileEntity(this.getPos(), 1, this.getUpdateTag());
    }

    @Override
    public NBTTagCompound getUpdateTag()
    {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity packet)
    {
        this.readFromNBT(packet.getNbtCompound());
    }

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);

		if (this.direction != null)
		{
			nbt.setInteger("Direction", this.direction.ordinal());
		}

		if (this.inventory != null)
		{
			this.saveInventoryToNBT(nbt, inventory);
		}
		
		if (this.type != null)
		{
		    nbt.setInteger("Type", this.type.id());
		}
		
		return nbt;
	}

	private void saveInventoryToNBT(NBTTagCompound nbt, IInventory inventory)
	{
		NBTTagList items = new NBTTagList();

		for (byte x = 0; x < inventory.getSizeInventory(); x++)
		{
			ItemStack stack = inventory.getStackInSlot(x);

			if (stack != null)
			{
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", x);
				stack.writeToNBT(item);
				items.appendTag(item);
			}
		}

		nbt.setTag(inventory.getName(), items);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);

		if (EnumFacing.getFront(nbt.getInteger("Direction")) != null)
		{
			this.direction = EnumFacing.getFront(nbt.getInteger("Direction"));
		}

		this.readInventoryFromNBT(nbt, this.inventory);
		this.type = SupplyChuteType.get(nbt.getInteger("Type"));
	}

	private void readInventoryFromNBT(NBTTagCompound nbt, IInventory inventory)
	{
		NBTTagList items = nbt.getTagList(inventory.getName(), Constants.NBT.TAG_COMPOUND);

		for (byte x = 0; x < items.tagCount(); x++)
		{
			NBTTagCompound item = items.getCompoundTagAt(x);

			byte slot = item.getByte("Slot");

			if (slot >= 0 && slot <= inventory.getSizeInventory())
			{
				inventory.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(item));
			}
		}
	}

	public void openGui(EntityPlayer player)
	{
		if (!player.worldObj.isRemote)
		{
			FMLNetworkHandler.openGui(player, AliensVsPredator.instance(), AliensVsPredator.interfaces().GUI_SUPPLYCRATE, player.worldObj, this.getPos().getX(), this.getPos().getY(), this.getPos().getZ());
		}
	}

	public Container getNewContainer(EntityPlayer player)
	{
		return (container = new ContainerSupplyCrate(player, this));
	}

	@Override
	public EnumFacing getDirection()
	{
		return direction;
	}

	@Override
	public void setDirection(EnumFacing direction)
	{
		this.direction = direction;
	}

	@Override
	public void setOpen(boolean isOpen)
	{
		this.isOpen = isOpen;

		if (!this.worldObj.isRemote)
		{
			AliensVsPredator.network().sendToAll(new PacketOpenable(isOpen, this.getPos().getX(), this.getPos().getY(), this.getPos().getZ()));
		}
	}

	@Override
	public boolean isOpen()
	{
		return isOpen;
	}
	
	public SupplyChuteType getType()
    {
        return type;
    }
	
	public void setType(SupplyChuteType type)
    {
        this.type = type;
    }
}
