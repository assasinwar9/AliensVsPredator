package org.avp.world.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBlackGoo extends Fluid
{
    //TODO: Flowing, Still texture locations
    public static final ResourceLocation flowing = new ResourceLocation("avp:blackgooflowing");
    public static final ResourceLocation still = new ResourceLocation("avp:blackgoostill");
    
    public FluidBlackGoo()
    {
        super("blackGoo", still, flowing);
        this.setDensity(3000);
        this.setViscosity(6000);
        this.setGaseous(false);
    }
}
