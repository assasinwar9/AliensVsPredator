package org.avp.entities;

import org.avp.tile.TileEntityTurret;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTurret extends EntityLiving
{
    private TileEntityTurret tile;

    public EntityTurret(TileEntityTurret tile, World worldObj)
    {
        super(worldObj);
        this.setSize(1.0F, 1.0F);
        this.tile = tile;

        tile.applyUpgrades();
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
    }

    @Override
    public boolean isAIDisabled()
    {
        return false;
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
    }

    public TileEntityTurret getTileEntity()
    {
        return tile;
    }
}
