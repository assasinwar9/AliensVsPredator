package org.avp.client.render.items;

import org.avp.AliensVsPredator;
import org.avp.client.model.tile.ModelLightPanel;
import org.lwjgl.opengl.GL11;

import com.arisux.mdxlib.lib.client.render.ItemRenderer;
import com.arisux.mdxlib.lib.client.render.OpenGL;
import com.arisux.mdxlib.lib.game.Game;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class RenderItemLightPanel extends ItemRenderer<ModelLightPanel>
{
    public RenderItemLightPanel()
    {
        super(AliensVsPredator.resources().models().LIGHT_PANEL);
    }

    @Override
    public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 1F;

        OpenGL.rotate(10F, 0F, 0F, 1F);
        OpenGL.rotate(12F, 0F, 1F, 0F);
        OpenGL.translate(0.4F, 1F, 0.5F);
        OpenGL.disable(GL11.GL_CULL_FACE);
        OpenGL.scale(glScale, -glScale, glScale);
        this.getModel().draw();
    }

    @Override
    public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.8F;

        if (firstPersonRenderCheck(entity))
        {
            OpenGL.translate(0.1F, 1.0F, 0.2F);
            OpenGL.rotate(95.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.rotate(120.0F, 0.0F, 1.0F, 0.0F);
            OpenGL.rotate(79.0F, 0.0F, 0.0F, 1.0F);
            OpenGL.disable(GL11.GL_CULL_FACE);
            OpenGL.scale(glScale, glScale, glScale);
            this.getModel().draw();
        }
    }

    @Override
    public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 10F;
        OpenGL.blendClear();
        OpenGL.translate(8F, 6F, 0F);
        OpenGL.rotate(-10, 1.0F, 0.0F, 0.0F);
        OpenGL.rotate(-45, 0.0F, 1.0F, 0.0F);
        OpenGL.translate(0F, -6F, 0F);
        OpenGL.disable(GL11.GL_CULL_FACE);
        OpenGL.scale(glScale, glScale, glScale);
        this.getModel().draw();
    }
    
    @Override
    public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        
        OpenGL.pushMatrix();
        {
            OpenGL.rotate((Game.minecraft().theWorld.getWorldTime() + Game.partialTicks() % 360) * 10, 0.0F, 1.0F, 0.0F);
            OpenGL.disable(GL11.GL_CULL_FACE);
            this.getModel().draw();
        }
        OpenGL.popMatrix();
    }

    @Override
    public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        // TODO Auto-generated method stub
        
    }
}
