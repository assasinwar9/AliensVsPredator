package org.avp.block.materials;

import org.avp.api.blocks.material.IMaterialPhysics;
import org.avp.api.blocks.material.IMaterialRenderer;
import org.avp.client.render.materials.RenderMaterialBlackGoo;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MaterialBlackGoo extends MaterialLiquid implements IMaterialPhysics
{
    private static final IMaterialRenderer renderer = new RenderMaterialBlackGoo();
    
    public MaterialBlackGoo()
    {
        super(MapColor.BLACK);
        this.setNoPushMobility();
    }
    
    public boolean blocksMovement()
    {
        return true;
    }
    
    @Override
    public double getForceVelocity()
    {
        return 0.01D;
    }
    
    @Override
    public double getVelocity()
    {
        return 0.275D;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IMaterialRenderer getMaterialRenderer()
    {
        return renderer;
    }
}