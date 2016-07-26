package org.avp.items.render;

import org.avp.AliensVsPredator;
import org.lwjgl.opengl.GL11;

import com.arisux.airi.lib.GlStateManager;
import com.arisux.airi.lib.client.ItemRenderer;

import net.minecraft.item.ItemStack;

public class RenderItemBlastDoor extends ItemRenderer
{
    public RenderItemBlastDoor()
    {
        super(AliensVsPredator.resources().models().BLASTDOOR);
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        super.renderItem(type, item, data);
    }

    @Override
    public void renderThirdPerson(ItemStack item, Object... data)
    {
        float glScale = 1F;

        GlStateManager.rotate(10F, 0F, 0F, 1F);
        GlStateManager.rotate(120F, 0F, 1F, 0F);
        GlStateManager.translate(-0.6F, 1.4F, 0F);
        GlStateManager.disable(GL11.GL_CULL_FACE);
        GlStateManager.scale(glScale, -glScale, glScale);
        this.getModelTexMap().draw();

    }

    @Override
    public void renderFirstPerson(ItemStack item, Object... data)
    {
        float glScale = 0.8F;

        if (firstPersonRenderCheck(data[1]))
        {
            GlStateManager.translate(0.1F, 1.0F, 0.2F);
            GlStateManager.rotate(95.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(120.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(79.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.disable(GL11.GL_CULL_FACE);
            GlStateManager.scale(glScale, glScale, glScale);
            this.getModelTexMap().draw();
        }
    }

    @Override
    public void renderInInventory(ItemStack item, Object... data)
    {
        GlStateManager.pushMatrix();
        {
            float glScale = 5F;
            GlStateManager.translate(8F, 7.5F, 0F);
            GlStateManager.translate(7.5F, 0F, 0F);
            GlStateManager.rotate(-180F, 0.0F, 1.0F, 0.0F);
            GlStateManager.disable(GL11.GL_CULL_FACE);
            GlStateManager.scale(glScale, glScale, glScale);
            GlStateManager.enable(GL11.GL_BLEND);
            GlStateManager.blendClear();
            GlStateManager.enableLight();
            this.getModelTexMap().draw();
            GlStateManager.disableLight();
        }
        GlStateManager.popMatrix();
    }
}
