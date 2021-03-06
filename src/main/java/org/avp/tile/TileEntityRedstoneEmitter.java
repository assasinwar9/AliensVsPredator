package org.avp.tile;

import org.avp.api.power.IVoltageReceiver;

import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TileEntityRedstoneEmitter extends TileEntityElectrical implements IVoltageReceiver
{
    public TileEntityRedstoneEmitter()
    {
        super(false);
    }

    @Override
    public void update()
    {
        super.update();
        this.updateEnergyAsReceiver();

        World world = this.getWorld();
//        int x = this.xCoord;
//        int y = this.yCoord;
//        int z = this.zCoord;

        if (this.voltagePrev != this.voltage)
        {
            //TODO: Functionaility disabled until new redstone functionality is analyzed properly.
//            if (world.getBlockMetadata(x, y, z) == 0 && this.voltage >= 1)
//            {
//                world.setBlockMetadataWithNotify(x, y, z, 15, 3);
//            }
//            if (world.getBlockMetadata(x, y, z) == 15 && this.voltage == 0)
//            {
//                world.setBlockMetadataWithNotify(x, y, z, 0, 3);
//            }
        }
    }

    @Override
    public boolean canConnectPower(EnumFacing from)
    {
        return false;
    }

    @Override
    public double getCurrentVoltage(EnumFacing from)
    {
        return this.voltage;
    }

    @Override
    public double getMaxVoltage(EnumFacing from)
    {
        return 10000;
    }
}
