package org.avp.tile;

import org.avp.api.power.IVoltageReceiver;

import net.minecraft.util.EnumFacing;



public class TileEntitySatelliteDish extends TileEntityElectrical implements IVoltageReceiver
{
    public TileEntitySatelliteDish()
    {
        super(false);
    }

    @Override
    public boolean canConnectPower(EnumFacing from)
    {
        return true;
    }

    @Override
    public double receiveVoltage(EnumFacing from, double maxReceive, boolean simulate)
    {
        return maxReceive;
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
