package org.avp.client.render.entities.living;

import org.avp.AliensVsPredator;
import org.avp.entities.living.EntityBelugaburster;

import com.arisux.mdxlib.lib.client.RenderLivingWrapper;
import com.arisux.mdxlib.lib.client.render.OpenGL;

public class RenderBelugaburster extends RenderLivingWrapper<EntityBelugaburster>
{
    public RenderBelugaburster()
    {
        super(AliensVsPredator.resources().models().BELUGABURSTER);
    }

    @Override
    protected void preRenderCallback(EntityBelugaburster entitylivingBase, float partialTicks)
    {
        super.preRenderCallback(entitylivingBase, shadowSize);
        OpenGL.scale(0.55F, 0.55F, 0.55F);
    }
}