package org.avp.client.render.entities;

import org.avp.AliensVsPredator;
import org.avp.entities.EntitySporePod;
import org.lwjgl.opengl.GL11;

import com.asx.mdx.lib.client.util.OpenGL;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSporePod extends Render<EntitySporePod>
{
    public RenderSporePod(RenderManager m)
    {
        super(m);
    }

    @Override
    public void doRender(EntitySporePod pod, double posX, double posY, double posZ, float yaw, float renderPartialTicks)
    {
        OpenGL.pushMatrix();
        OpenGL.translate((float) posX, (float) posY + 0.4F, (float) posZ);
        OpenGL.rotate(pod.rotationYaw, 0.0F, 1.0F, 0.0F);
        OpenGL.rotate(pod.rotationPitch, 0.0F, 0.0F, 1.0F);
        OpenGL.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.translate(0F, 0F, 0F);
        float s = 0.25F;
        OpenGL.scale(s, s, s);
        AliensVsPredator.resources().models().SPOREPOD.bindTexture();
        AliensVsPredator.resources().models().SPOREPOD.getModel().render(pod);
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.popMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySporePod entity)
    {
        return null;
    }
}
