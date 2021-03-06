package org.avp.client.render.entities.living;

import org.avp.entities.living.species.SpeciesYautja;

import com.asx.mdx.lib.client.util.OpenGL;
import com.asx.mdx.lib.client.util.entity.RenderLivingWrapper;
import com.asx.mdx.lib.client.util.models.MapModelTexture;
import com.asx.mdx.lib.client.util.models.Model;

import net.minecraft.client.renderer.entity.RenderManager;

public class RenderYautja<T extends SpeciesYautja, MODEL extends Model> extends RenderLivingWrapper<T, MODEL>
{
    public RenderYautja(RenderManager m, MapModelTexture<MODEL> texturedModel)
    {
        super(m, texturedModel);
    }

    @Override
    protected void preRenderCallback(SpeciesYautja yautja, float renderPartialTicks)
    {
        OpenGL.scale(1F, 1F, 1F);
    }
}
