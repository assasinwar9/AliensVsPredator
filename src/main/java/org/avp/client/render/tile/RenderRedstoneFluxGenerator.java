package org.avp.client.render.tile;

import org.avp.AliensVsPredator;
import org.avp.tile.TileEntityRedstoneFluxGenerator;

import com.arisux.mdxlib.lib.client.render.OpenGL;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderRedstoneFluxGenerator extends TileEntitySpecialRenderer<TileEntityRedstoneFluxGenerator>
{
    @Override
    public void renderTileEntityAt(TileEntityRedstoneFluxGenerator tile, double x, double y, double z, float partialTicks, int destroyStage)
    {
        OpenGL.pushMatrix();
        OpenGL.disableCullFace();
        OpenGL.translate(x, y, z);
        OpenGL.scale(1F, -1F, 1F);
        OpenGL.translate(0.5F, -1.5F, 0.5F);
        OpenGL.rotate(tile);
        AliensVsPredator.resources().models().RFGENERATOR.draw();
        OpenGL.enableCullFace();
        OpenGL.popMatrix();
    }
}
