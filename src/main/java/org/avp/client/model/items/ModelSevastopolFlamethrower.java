package org.avp.client.model.items;

import org.avp.item.ItemFlamethrower;

import com.asx.mdx.lib.client.util.models.Model;
import com.asx.mdx.lib.util.Game;
import com.asx.mdx.lib.world.entity.player.inventory.Inventories;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModelSevastopolFlamethrower extends Model
{
    public ModelRenderer nozzle01;
    public ModelRenderer nozzle02;
    public ModelRenderer nozzle03;
    public ModelRenderer nozzlePipe;
    public ModelRenderer body01;
    public ModelRenderer body01_1;
    public ModelRenderer body03;
    public ModelRenderer body04L;
    public ModelRenderer body04R;
    public ModelRenderer body04B;
    public ModelRenderer body05;
    public ModelRenderer hoseConnector;
    public ModelRenderer hoseValve;
    public ModelRenderer hose01;
    public ModelRenderer lowerRidge01;
    public ModelRenderer lowerRidge02;
    public ModelRenderer lowerRidge03;
    public ModelRenderer gauge;
    public ModelRenderer toggleBank01;
    public ModelRenderer topBump;
    public ModelRenderer triggerGuard;
    public ModelRenderer foregrip;
    public ModelRenderer triggerLever;
    public ModelRenderer backgrip;
    public ModelRenderer backgripGuard;
    public ModelRenderer laterialBump;
    public ModelRenderer propaneCanister;
    public ModelRenderer propellantCanister;
    public ModelRenderer canisterRack;
    public ModelRenderer lRod;
    public ModelRenderer rRod;
    public ModelRenderer cylinderN;
    public ModelRenderer hose02;
    public ModelRenderer hose03;
    public ModelRenderer hose04;
    public ModelRenderer hose05;
    public ModelRenderer hose06;
    public ModelRenderer hose07;
    public ModelRenderer hose08;
    public ModelRenderer hose09;
    public ModelRenderer hose10;
    public ModelRenderer hose11;
    public ModelRenderer hose12;
    public ModelRenderer toggleBank02;
    public ModelRenderer toggles;
    public ModelRenderer propaneCanisterTop;
    public ModelRenderer propaneCanisterValve;
    public ModelRenderer propellantCanisterTop;
    public ModelRenderer propellantCanisterPin;
    public ModelRenderer cylinderS;
    public ModelRenderer cylinderE;
    public ModelRenderer cylinderW;
    public ModelRenderer cylinderNE;
    public ModelRenderer cylinderSE;
    public ModelRenderer cylinderNW;
    public ModelRenderer cylinderSW;
    public ModelRenderer cylinderBack;

    public ModelSevastopolFlamethrower()
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.body04L = new ModelRenderer(this, 73, 3);
        this.body04L.setRotationPoint(1.2F, -0.3F, 3.4F);
        this.body04L.addBox(-0.5F, -0.4F, 0.0F, 1, 2, 26, 0.0F);
        this.setRotation(body04L, 0.0F, 0.0F, 0.22759093446006054F);
        this.laterialBump = new ModelRenderer(this, 71, 32);
        this.laterialBump.setRotationPoint(0.6F, 0.9F, 27.4F);
        this.laterialBump.addBox(0.0F, -1.0F, -2.0F, 1, 2, 4, 0.0F);
        this.cylinderSE = new ModelRenderer(this, 107, 39);
        this.cylinderSE.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderSE.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderSE, 0.0F, 2.356194490192345F, 0.0F);
        this.hose06 = new ModelRenderer(this, 25, 11);
        this.hose06.setRotationPoint(0.0F, -0.05F, -1.7F);
        this.hose06.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(hose06, 0.18203784098300857F, -0.136659280431156F, 0.0F);
        this.body05 = new ModelRenderer(this, 19, 0);
        this.body05.setRotationPoint(0.0F, -1.9F, 3.5F);
        this.body05.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 26, 0.0F);
        this.cylinderE = new ModelRenderer(this, 107, 39);
        this.cylinderE.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderE.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderE, 0.0F, 1.5707963267948966F, 0.0F);
        this.propaneCanisterTop = new ModelRenderer(this, 105, 1);
        this.propaneCanisterTop.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.propaneCanisterTop.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.propellantCanisterTop = new ModelRenderer(this, 117, 1);
        this.propellantCanisterTop.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.propellantCanisterTop.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.nozzlePipe = new ModelRenderer(this, 0, 21);
        this.nozzlePipe.setRotationPoint(0.0F, 0.0F, -6.3F);
        this.nozzlePipe.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.toggleBank02 = new ModelRenderer(this, 74, 2);
        this.toggleBank02.setRotationPoint(0.0F, -0.6F, 0.8F);
        this.toggleBank02.addBox(-1.0F, -1.0F, -1.5F, 2, 1, 3, 0.0F);
        this.body04R = new ModelRenderer(this, 73, 3);
        this.body04R.setRotationPoint(-1.2F, -0.3F, 3.4F);
        this.body04R.addBox(-0.5F, -0.4F, 0.0F, 1, 2, 26, 0.0F);
        this.setRotation(body04R, 0.0F, 0.0F, -0.22759093446006054F);
        this.gauge = new ModelRenderer(this, 53, 3);
        this.gauge.setRotationPoint(0.0F, -3.0F, 17.8F);
        this.gauge.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotation(gauge, 0.22759093446006054F, 0.0F, 0.0F);
        this.triggerGuard = new ModelRenderer(this, 24, 34);
        this.triggerGuard.setRotationPoint(0.0F, 2.4F, 11.5F);
        this.triggerGuard.addBox(-0.5F, 0.0F, -1.5F, 1, 2, 3, 0.0F);
        this.hoseValve = new ModelRenderer(this, 14, 9);
        this.hoseValve.setRotationPoint(-1.2F, -0.1F, -10.0F);
        this.hoseValve.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotation(hoseValve, 0.0F, 0.0F, 0.18203784098300857F);
        this.rRod = new ModelRenderer(this, 52, 7);
        this.rRod.mirror = true;
        this.rRod.setRotationPoint(-1.8F, -1.1F, 9.9F);
        this.rRod.addBox(-1.0F, -0.5F, -7.0F, 1, 1, 16, 0.0F);
        this.cylinderS = new ModelRenderer(this, 107, 39);
        this.cylinderS.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderS.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderS, 0.0F, 3.141592653589793F, 0.0F);
        this.body04B = new ModelRenderer(this, 69, 34);
        this.body04B.setRotationPoint(0.0F, 1.1F, 3.4F);
        this.body04B.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 26, 0.0F);
        this.hose02 = new ModelRenderer(this, 25, 11);
        this.hose02.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.hose02.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(hose02, 0.0F, 0.136659280431156F, 0.0F);
        this.hose07 = new ModelRenderer(this, 25, 11);
        this.hose07.setRotationPoint(0.0F, -0.05F, -1.7F);
        this.hose07.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(hose07, 0.27314402793711257F, -0.136659280431156F, 0.0F);
        this.lowerRidge02 = new ModelRenderer(this, 57, 45);
        this.lowerRidge02.setRotationPoint(-0.05F, 1.2F, 6.3F);
        this.lowerRidge02.addBox(-1.0F, -0.7F, -1.9F, 2, 2, 3, 0.0F);
        this.setRotation(lowerRidge02, -0.4553564018453205F, 0.0F, 0.0F);
        this.lRod = new ModelRenderer(this, 52, 7);
        this.lRod.setRotationPoint(1.8F, -1.1F, 9.9F);
        this.lRod.addBox(0.0F, -0.5F, -7.0F, 1, 1, 16, 0.0F);
        this.nozzle01 = new ModelRenderer(this, 0, 0);
        this.nozzle01.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.nozzle01.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
        this.propaneCanister = new ModelRenderer(this, 103, 0);
        this.propaneCanister.setRotationPoint(1.7F, 3.6F, 22.6F);
        this.propaneCanister.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotation(propaneCanister, 0.0F, -0.7853981633974483F, 0.0F);
        this.foregrip = new ModelRenderer(this, 24, 40);
        this.foregrip.setRotationPoint(0.0F, 2.5F, 13.6F);
        this.foregrip.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotation(foregrip, 0.22759093446006054F, 0.0F, 0.0F);
        this.canisterRack = new ModelRenderer(this, 102, 13);
        this.canisterRack.setRotationPoint(1.1F, 2.0F, 22.4F);
        this.canisterRack.addBox(0.0F, -1.0F, -2.8F, 2, 2, 5, 0.0F);
        this.hose12 = new ModelRenderer(this, 24, 10);
        this.hose12.setRotationPoint(-0.2F, -0.1F, -1.5F);
        this.hose12.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotation(hose12, 0.4553564018453205F, -0.8196066167365371F, 0.0F);
        this.toggles = new ModelRenderer(this, 87, 1);
        this.toggles.setRotationPoint(0.0F, -0.6F, 0.1F);
        this.toggles.addBox(0.0F, -1.3F, -1.0F, 0, 1, 2, 0.0F);
        this.setRotation(toggles, 0.0F, 0.0F, -0.136659280431156F);
        this.cylinderNE = new ModelRenderer(this, 107, 39);
        this.cylinderNE.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderNE.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderNE, 0.0F, 0.7853981633974483F, 0.0F);
        this.cylinderSW = new ModelRenderer(this, 107, 39);
        this.cylinderSW.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderSW.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderSW, 0.0F, -2.356194490192345F, 0.0F);
        this.backgrip = new ModelRenderer(this, 83, 48);
        this.backgrip.setRotationPoint(0.0F, 1.1F, 26.8F);
        this.backgrip.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotation(backgrip, 0.136659280431156F, 0.0F, 0.0F);
        this.hose11 = new ModelRenderer(this, 25, 11);
        this.hose11.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.hose11.addBox(-0.5F, -0.5F, -1.9F, 1, 1, 2, 0.0F);
        this.setRotation(hose11, 0.27314402793711257F, -0.31869712141416456F, 0.0F);
        this.hose10 = new ModelRenderer(this, 26, 12);
        this.hose10.setRotationPoint(-0.05F, 0.0F, -0.7F);
        this.hose10.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotation(hose10, 0.136659280431156F, -0.5009094953223726F, 0.0F);
        this.hose09 = new ModelRenderer(this, 26, 12);
        this.hose09.setRotationPoint(-0.05F, 0.0F, -0.7F);
        this.hose09.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotation(hose09, 0.136659280431156F, 0.22759093446006054F, 0.0F);
        this.propaneCanisterValve = new ModelRenderer(this, 103, 0);
        this.propaneCanisterValve.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.propaneCanisterValve.addBox(-1.5F, -3.0F, -1.5F, 3, 1, 3, 0.0F);
        this.hose05 = new ModelRenderer(this, 25, 11);
        this.hose05.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.hose05.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(hose05, 0.045553093477052F, 0.18203784098300857F, 0.0F);
        this.nozzle02 = new ModelRenderer(this, 0, 9);
        this.nozzle02.setRotationPoint(0.0F, 0.0F, -8.9F);
        this.nozzle02.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 2, 0.0F);
        this.body01_1 = new ModelRenderer(this, 0, 52);
        this.body01_1.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.body01_1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
        this.nozzle03 = new ModelRenderer(this, 0, 9);
        this.nozzle03.setRotationPoint(0.0F, 0.0F, -8.1F);
        this.nozzle03.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 2, 0.0F);
        this.hose01 = new ModelRenderer(this, 24, 10);
        this.hose01.setRotationPoint(0.0F, -3.1F, 4.3F);
        this.hose01.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.body03 = new ModelRenderer(this, 19, 31);
        this.body03.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.body03.addBox(-1.5F, -1.5F, 0.0F, 3, 1, 26, 0.0F);
        this.topBump = new ModelRenderer(this, 29, 0);
        this.topBump.setRotationPoint(0.0F, -2.2F, 26.4F);
        this.topBump.addBox(-1.0F, -1.0F, -2.5F, 2, 1, 5, 0.0F);
        this.hoseConnector = new ModelRenderer(this, 0, 34);
        this.hoseConnector.setRotationPoint(0.0F, -1.1F, 4.0F);
        this.hoseConnector.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotation(hoseConnector, 0.18203784098300857F, 0.0F, 0.0F);
        this.body01 = new ModelRenderer(this, 0, 47);
        this.body01.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.body01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
        this.propellantCanisterPin = new ModelRenderer(this, 120, 14);
        this.propellantCanisterPin.setRotationPoint(0.0F, 8.6F, 0.0F);
        this.propellantCanisterPin.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.cylinderNW = new ModelRenderer(this, 107, 39);
        this.cylinderNW.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderNW.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderNW, 0.0F, -0.7853981633974483F, 0.0F);
        this.cylinderW = new ModelRenderer(this, 107, 39);
        this.cylinderW.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cylinderW.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderW, 0.0F, -1.5707963267948966F, 0.0F);
        this.hose08 = new ModelRenderer(this, 26, 12);
        this.hose08.setRotationPoint(-0.05F, -0.05F, -1.7F);
        this.hose08.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotation(hose08, 0.18203784098300857F, 0.091106186954104F, 0.0F);
        this.triggerLever = new ModelRenderer(this, 34, 34);
        this.triggerLever.setRotationPoint(0.0F, 2.6F, 12.5F);
        this.triggerLever.addBox(-0.5F, 0.0F, -1.5F, 0, 2, 2, 0.0F);
        this.hose03 = new ModelRenderer(this, 25, 11);
        this.hose03.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.hose03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotation(hose03, -0.091106186954104F, 0.136659280431156F, 0.0F);
        this.hose04 = new ModelRenderer(this, 24, 10);
        this.hose04.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.hose04.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotation(hose04, -0.045553093477052F, 0.22759093446006054F, 0.0F);
        this.lowerRidge01 = new ModelRenderer(this, 51, 32);
        this.lowerRidge01.setRotationPoint(-0.05F, 1.6F, 8.6F);
        this.lowerRidge01.addBox(-1.0F, -0.7F, -1.9F, 2, 2, 9, 0.0F);
        this.backgripGuard = new ModelRenderer(this, 80, 38);
        this.backgripGuard.setRotationPoint(0.0F, 1.2F, 27.4F);
        this.backgripGuard.addBox(-1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.lowerRidge03 = new ModelRenderer(this, 57, 45);
        this.lowerRidge03.setRotationPoint(-0.05F, 0.9F, 16.7F);
        this.lowerRidge03.addBox(-1.0F, -0.7F, -1.9F, 2, 2, 3, 0.0F);
        this.setRotation(lowerRidge03, 0.4553564018453205F, 0.0F, 0.0F);
        this.cylinderBack = new ModelRenderer(this, 111, 39);
        this.cylinderBack.setRotationPoint(0.0F, 12.0F, -0.1F);
        this.cylinderBack.addBox(-2.5F, 0.01F, -2.6F, 5, 0, 5, 0.0F);
        this.setRotation(cylinderBack, 0.0F, 3.141592653589793F, 0.0F);
        this.toggleBank01 = new ModelRenderer(this, 72, 8);
        this.toggleBank01.setRotationPoint(0.0F, -2.1F, 21.8F);
        this.toggleBank01.addBox(-1.0F, -1.0F, -2.7F, 2, 1, 5, 0.0F);
        this.cylinderN = new ModelRenderer(this, 107, 39);
        this.cylinderN.setRotationPoint(0.0F, -0.5F, 29.4F);
        this.cylinderN.addBox(-1.0F, 0.0F, -2.45F, 2, 12, 2, 0.0F);
        this.setRotation(cylinderN, 1.5707963267948966F, 0.0F, 0.0F);
        this.propellantCanister = new ModelRenderer(this, 116, 0);
        this.propellantCanister.setRotationPoint(0.0F, 3.6F, 19.9F);
        this.propellantCanister.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotation(propellantCanister, 0.0F, 0.7853981633974483F, 0.0F);
        this.cylinderN.addChild(this.cylinderSE);
        this.hose05.addChild(this.hose06);
        this.cylinderN.addChild(this.cylinderE);
        this.propaneCanister.addChild(this.propaneCanisterTop);
        this.propellantCanister.addChild(this.propellantCanisterTop);
        this.toggleBank01.addChild(this.toggleBank02);
        this.cylinderN.addChild(this.cylinderS);
        this.hose01.addChild(this.hose02);
        this.hose06.addChild(this.hose07);
        this.hose11.addChild(this.hose12);
        this.toggleBank02.addChild(this.toggles);
        this.cylinderN.addChild(this.cylinderNE);
        this.cylinderN.addChild(this.cylinderSW);
        this.hose10.addChild(this.hose11);
        this.hose09.addChild(this.hose10);
        this.hose08.addChild(this.hose09);
        this.propaneCanister.addChild(this.propaneCanisterValve);
        this.hose04.addChild(this.hose05);
        this.propellantCanister.addChild(this.propellantCanisterPin);
        this.cylinderN.addChild(this.cylinderNW);
        this.cylinderN.addChild(this.cylinderW);
        this.hose07.addChild(this.hose08);
        this.hose02.addChild(this.hose03);
        this.hose03.addChild(this.hose04);
        this.cylinderN.addChild(this.cylinderBack);
    }

    @Override
    public void render(Object obj)
    {
        draw(this.body04L);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.laterialBump.offsetX, this.laterialBump.offsetY, this.laterialBump.offsetZ);
        GlStateManager.translate(this.laterialBump.rotationPointX * DEFAULT_SCALE, this.laterialBump.rotationPointY * DEFAULT_SCALE, this.laterialBump.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.3D, 1.0D, 0.8D);
        GlStateManager.translate(-this.laterialBump.offsetX, -this.laterialBump.offsetY, -this.laterialBump.offsetZ);
        GlStateManager.translate(-this.laterialBump.rotationPointX * DEFAULT_SCALE, -this.laterialBump.rotationPointY * DEFAULT_SCALE, -this.laterialBump.rotationPointZ * DEFAULT_SCALE);
        draw(this.laterialBump);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body05.offsetX, this.body05.offsetY, this.body05.offsetZ);
        GlStateManager.translate(this.body05.rotationPointX * DEFAULT_SCALE, this.body05.rotationPointY * DEFAULT_SCALE, this.body05.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.0D, 1.1D, 1.0D);
        GlStateManager.translate(-this.body05.offsetX, -this.body05.offsetY, -this.body05.offsetZ);
        GlStateManager.translate(-this.body05.rotationPointX * DEFAULT_SCALE, -this.body05.rotationPointY * DEFAULT_SCALE, -this.body05.rotationPointZ * DEFAULT_SCALE);
        draw(this.body05);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.nozzlePipe.offsetX, this.nozzlePipe.offsetY, this.nozzlePipe.offsetZ);
        GlStateManager.translate(this.nozzlePipe.rotationPointX * DEFAULT_SCALE, this.nozzlePipe.rotationPointY * DEFAULT_SCALE, this.nozzlePipe.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.7D, 0.7D, 1.0D);
        GlStateManager.translate(-this.nozzlePipe.offsetX, -this.nozzlePipe.offsetY, -this.nozzlePipe.offsetZ);
        GlStateManager.translate(-this.nozzlePipe.rotationPointX * DEFAULT_SCALE, -this.nozzlePipe.rotationPointY * DEFAULT_SCALE, -this.nozzlePipe.rotationPointZ * DEFAULT_SCALE);
        draw(this.nozzlePipe);
        GlStateManager.popMatrix();
        draw(this.body04R);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.gauge.offsetX, this.gauge.offsetY, this.gauge.offsetZ);
        GlStateManager.translate(this.gauge.rotationPointX * DEFAULT_SCALE, this.gauge.rotationPointY * DEFAULT_SCALE, this.gauge.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.99D, 1.0D, 1.0D);
        GlStateManager.translate(-this.gauge.offsetX, -this.gauge.offsetY, -this.gauge.offsetZ);
        GlStateManager.translate(-this.gauge.rotationPointX * DEFAULT_SCALE, -this.gauge.rotationPointY * DEFAULT_SCALE, -this.gauge.rotationPointZ * DEFAULT_SCALE);
        draw(this.gauge);
        GlStateManager.popMatrix();
        draw(this.triggerGuard);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.hoseValve.offsetX, this.hoseValve.offsetY, this.hoseValve.offsetZ);
        GlStateManager.translate(this.hoseValve.rotationPointX * DEFAULT_SCALE, this.hoseValve.rotationPointY * DEFAULT_SCALE, this.hoseValve.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.hoseValve.offsetX, -this.hoseValve.offsetY, -this.hoseValve.offsetZ);
        GlStateManager.translate(-this.hoseValve.rotationPointX * DEFAULT_SCALE, -this.hoseValve.rotationPointY * DEFAULT_SCALE, -this.hoseValve.rotationPointZ * DEFAULT_SCALE);
        draw(this.hoseValve);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rRod.offsetX, this.rRod.offsetY, this.rRod.offsetZ);
        GlStateManager.translate(this.rRod.rotationPointX * DEFAULT_SCALE, this.rRod.rotationPointY * DEFAULT_SCALE, this.rRod.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 1.0D);
        GlStateManager.translate(-this.rRod.offsetX, -this.rRod.offsetY, -this.rRod.offsetZ);
        GlStateManager.translate(-this.rRod.rotationPointX * DEFAULT_SCALE, -this.rRod.rotationPointY * DEFAULT_SCALE, -this.rRod.rotationPointZ * DEFAULT_SCALE);
        draw(this.rRod);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body04B.offsetX, this.body04B.offsetY, this.body04B.offsetZ);
        GlStateManager.translate(this.body04B.rotationPointX * DEFAULT_SCALE, this.body04B.rotationPointY * DEFAULT_SCALE, this.body04B.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.9D, 1.0D, 1.0D);
        GlStateManager.translate(-this.body04B.offsetX, -this.body04B.offsetY, -this.body04B.offsetZ);
        GlStateManager.translate(-this.body04B.rotationPointX * DEFAULT_SCALE, -this.body04B.rotationPointY * DEFAULT_SCALE, -this.body04B.rotationPointZ * DEFAULT_SCALE);
        draw(this.body04B);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.lowerRidge02.offsetX, this.lowerRidge02.offsetY, this.lowerRidge02.offsetZ);
        GlStateManager.translate(this.lowerRidge02.rotationPointX * DEFAULT_SCALE, this.lowerRidge02.rotationPointY * DEFAULT_SCALE, this.lowerRidge02.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.9D, 1.0D, 1.0D);
        GlStateManager.translate(-this.lowerRidge02.offsetX, -this.lowerRidge02.offsetY, -this.lowerRidge02.offsetZ);
        GlStateManager.translate(-this.lowerRidge02.rotationPointX * DEFAULT_SCALE, -this.lowerRidge02.rotationPointY * DEFAULT_SCALE, -this.lowerRidge02.rotationPointZ * DEFAULT_SCALE);
        draw(this.lowerRidge02);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.lRod.offsetX, this.lRod.offsetY, this.lRod.offsetZ);
        GlStateManager.translate(this.lRod.rotationPointX * DEFAULT_SCALE, this.lRod.rotationPointY * DEFAULT_SCALE, this.lRod.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 1.0D);
        GlStateManager.translate(-this.lRod.offsetX, -this.lRod.offsetY, -this.lRod.offsetZ);
        GlStateManager.translate(-this.lRod.rotationPointX * DEFAULT_SCALE, -this.lRod.rotationPointY * DEFAULT_SCALE, -this.lRod.rotationPointZ * DEFAULT_SCALE);
        draw(this.lRod);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.nozzle01.offsetX, this.nozzle01.offsetY, this.nozzle01.offsetZ);
        GlStateManager.translate(this.nozzle01.rotationPointX * DEFAULT_SCALE, this.nozzle01.rotationPointY * DEFAULT_SCALE, this.nozzle01.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 1.0D);
        GlStateManager.translate(-this.nozzle01.offsetX, -this.nozzle01.offsetY, -this.nozzle01.offsetZ);
        GlStateManager.translate(-this.nozzle01.rotationPointX * DEFAULT_SCALE, -this.nozzle01.rotationPointY * DEFAULT_SCALE, -this.nozzle01.rotationPointZ * DEFAULT_SCALE);
        draw(this.nozzle01);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.foregrip.offsetX, this.foregrip.offsetY, this.foregrip.offsetZ);
        GlStateManager.translate(this.foregrip.rotationPointX * DEFAULT_SCALE, this.foregrip.rotationPointY * DEFAULT_SCALE, this.foregrip.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.5D, 1.0D, 1.0D);
        GlStateManager.translate(-this.foregrip.offsetX, -this.foregrip.offsetY, -this.foregrip.offsetZ);
        GlStateManager.translate(-this.foregrip.rotationPointX * DEFAULT_SCALE, -this.foregrip.rotationPointY * DEFAULT_SCALE, -this.foregrip.rotationPointZ * DEFAULT_SCALE);
        draw(this.foregrip);
        GlStateManager.popMatrix();
        draw(this.canisterRack);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backgrip.offsetX, this.backgrip.offsetY, this.backgrip.offsetZ);
        GlStateManager.translate(this.backgrip.rotationPointX * DEFAULT_SCALE, this.backgrip.rotationPointY * DEFAULT_SCALE, this.backgrip.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.5D, 1.0D, 1.0D);
        GlStateManager.translate(-this.backgrip.offsetX, -this.backgrip.offsetY, -this.backgrip.offsetZ);
        GlStateManager.translate(-this.backgrip.rotationPointX * DEFAULT_SCALE, -this.backgrip.rotationPointY * DEFAULT_SCALE, -this.backgrip.rotationPointZ * DEFAULT_SCALE);
        draw(this.backgrip);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.nozzle02.offsetX, this.nozzle02.offsetY, this.nozzle02.offsetZ);
        GlStateManager.translate(this.nozzle02.rotationPointX * DEFAULT_SCALE, this.nozzle02.rotationPointY * DEFAULT_SCALE, this.nozzle02.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.7D, 0.7D, 1.0D);
        GlStateManager.translate(-this.nozzle02.offsetX, -this.nozzle02.offsetY, -this.nozzle02.offsetZ);
        GlStateManager.translate(-this.nozzle02.rotationPointX * DEFAULT_SCALE, -this.nozzle02.rotationPointY * DEFAULT_SCALE, -this.nozzle02.rotationPointZ * DEFAULT_SCALE);
        draw(this.nozzle02);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body01_1.offsetX, this.body01_1.offsetY, this.body01_1.offsetZ);
        GlStateManager.translate(this.body01_1.rotationPointX * DEFAULT_SCALE, this.body01_1.rotationPointY * DEFAULT_SCALE, this.body01_1.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.body01_1.offsetX, -this.body01_1.offsetY, -this.body01_1.offsetZ);
        GlStateManager.translate(-this.body01_1.rotationPointX * DEFAULT_SCALE, -this.body01_1.rotationPointY * DEFAULT_SCALE, -this.body01_1.rotationPointZ * DEFAULT_SCALE);
        draw(this.body01_1);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.nozzle03.offsetX, this.nozzle03.offsetY, this.nozzle03.offsetZ);
        GlStateManager.translate(this.nozzle03.rotationPointX * DEFAULT_SCALE, this.nozzle03.rotationPointY * DEFAULT_SCALE, this.nozzle03.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.6D, 0.6D, 1.0D);
        GlStateManager.translate(-this.nozzle03.offsetX, -this.nozzle03.offsetY, -this.nozzle03.offsetZ);
        GlStateManager.translate(-this.nozzle03.rotationPointX * DEFAULT_SCALE, -this.nozzle03.rotationPointY * DEFAULT_SCALE, -this.nozzle03.rotationPointZ * DEFAULT_SCALE);
        draw(this.nozzle03);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.hose01.offsetX, this.hose01.offsetY, this.hose01.offsetZ);
        GlStateManager.translate(this.hose01.rotationPointX * DEFAULT_SCALE, this.hose01.rotationPointY * DEFAULT_SCALE, this.hose01.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 0.9D);
        GlStateManager.translate(-this.hose01.offsetX, -this.hose01.offsetY, -this.hose01.offsetZ);
        GlStateManager.translate(-this.hose01.rotationPointX * DEFAULT_SCALE, -this.hose01.rotationPointY * DEFAULT_SCALE, -this.hose01.rotationPointZ * DEFAULT_SCALE);
        draw(this.hose01);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body03.offsetX, this.body03.offsetY, this.body03.offsetZ);
        GlStateManager.translate(this.body03.rotationPointX * DEFAULT_SCALE, this.body03.rotationPointY * DEFAULT_SCALE, this.body03.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.2D, 1.1D, 1.0D);
        GlStateManager.translate(-this.body03.offsetX, -this.body03.offsetY, -this.body03.offsetZ);
        GlStateManager.translate(-this.body03.rotationPointX * DEFAULT_SCALE, -this.body03.rotationPointY * DEFAULT_SCALE, -this.body03.rotationPointZ * DEFAULT_SCALE);
        draw(this.body03);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.topBump.offsetX, this.topBump.offsetY, this.topBump.offsetZ);
        GlStateManager.translate(this.topBump.rotationPointX * DEFAULT_SCALE, this.topBump.rotationPointY * DEFAULT_SCALE, this.topBump.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.0D, 0.8D, 1.0D);
        GlStateManager.translate(-this.topBump.offsetX, -this.topBump.offsetY, -this.topBump.offsetZ);
        GlStateManager.translate(-this.topBump.rotationPointX * DEFAULT_SCALE, -this.topBump.rotationPointY * DEFAULT_SCALE, -this.topBump.rotationPointZ * DEFAULT_SCALE);
        draw(this.topBump);
        GlStateManager.popMatrix();
        draw(this.hoseConnector);
        draw(this.body01);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.triggerLever.offsetX, this.triggerLever.offsetY, this.triggerLever.offsetZ);
        GlStateManager.translate(this.triggerLever.rotationPointX * DEFAULT_SCALE, this.triggerLever.rotationPointY * DEFAULT_SCALE, this.triggerLever.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.0D, 0.9D, 1.0D);
        GlStateManager.translate(-this.triggerLever.offsetX, -this.triggerLever.offsetY, -this.triggerLever.offsetZ);
        GlStateManager.translate(-this.triggerLever.rotationPointX * DEFAULT_SCALE, -this.triggerLever.rotationPointY * DEFAULT_SCALE, -this.triggerLever.rotationPointZ * DEFAULT_SCALE);
        draw(this.triggerLever);
        GlStateManager.popMatrix();
        draw(this.lowerRidge01);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.backgripGuard.offsetX, this.backgripGuard.offsetY, this.backgripGuard.offsetZ);
        GlStateManager.translate(this.backgripGuard.rotationPointX * DEFAULT_SCALE, this.backgripGuard.rotationPointY * DEFAULT_SCALE, this.backgripGuard.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.3D, 1.0D, 1.0D);
        GlStateManager.translate(-this.backgripGuard.offsetX, -this.backgripGuard.offsetY, -this.backgripGuard.offsetZ);
        GlStateManager.translate(-this.backgripGuard.rotationPointX * DEFAULT_SCALE, -this.backgripGuard.rotationPointY * DEFAULT_SCALE, -this.backgripGuard.rotationPointZ * DEFAULT_SCALE);
        draw(this.backgripGuard);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.lowerRidge03.offsetX, this.lowerRidge03.offsetY, this.lowerRidge03.offsetZ);
        GlStateManager.translate(this.lowerRidge03.rotationPointX * DEFAULT_SCALE, this.lowerRidge03.rotationPointY * DEFAULT_SCALE, this.lowerRidge03.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.9D, 1.0D, 1.0D);
        GlStateManager.translate(-this.lowerRidge03.offsetX, -this.lowerRidge03.offsetY, -this.lowerRidge03.offsetZ);
        GlStateManager.translate(-this.lowerRidge03.rotationPointX * DEFAULT_SCALE, -this.lowerRidge03.rotationPointY * DEFAULT_SCALE, -this.lowerRidge03.rotationPointZ * DEFAULT_SCALE);
        draw(this.lowerRidge03);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.toggleBank01.offsetX, this.toggleBank01.offsetY, this.toggleBank01.offsetZ);
        GlStateManager.translate(this.toggleBank01.rotationPointX * DEFAULT_SCALE, this.toggleBank01.rotationPointY * DEFAULT_SCALE, this.toggleBank01.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(1.0D, 0.7D, 0.8D);
        GlStateManager.translate(-this.toggleBank01.offsetX, -this.toggleBank01.offsetY, -this.toggleBank01.offsetZ);
        GlStateManager.translate(-this.toggleBank01.rotationPointX * DEFAULT_SCALE, -this.toggleBank01.rotationPointY * DEFAULT_SCALE, -this.toggleBank01.rotationPointZ * DEFAULT_SCALE);
        draw(this.toggleBank01);
        GlStateManager.popMatrix();
        draw(this.cylinderN);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.propellantCanister.offsetX, this.propellantCanister.offsetY, this.propellantCanister.offsetZ);
        GlStateManager.translate(this.propellantCanister.rotationPointX * DEFAULT_SCALE, this.propellantCanister.rotationPointY * DEFAULT_SCALE, this.propellantCanister.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.85D, 1.0D, 0.85D);
        GlStateManager.translate(-this.propellantCanister.offsetX, -this.propellantCanister.offsetY, -this.propellantCanister.offsetZ);
        GlStateManager.translate(-this.propellantCanister.rotationPointX * DEFAULT_SCALE, -this.propellantCanister.rotationPointY * DEFAULT_SCALE, -this.propellantCanister.rotationPointZ * DEFAULT_SCALE);
        draw(this.propellantCanister);
        GlStateManager.popMatrix();
        
        ItemStack currentItemStack = Game.minecraft().player.inventory.getCurrentItem();

        if (currentItemStack != null && currentItemStack.getItem() instanceof ItemFlamethrower)
        {
            ItemFlamethrower currentFlamethrower = (ItemFlamethrower) currentItemStack.getItem();
            Item fuel = currentFlamethrower.getAmmo();

            if (Inventories.getAmountOfItemPlayerHas(fuel, Game.minecraft().player) > 0)
            {
                GlStateManager.pushMatrix();
                GlStateManager.translate(this.propaneCanister.offsetX, this.propaneCanister.offsetY, this.propaneCanister.offsetZ);
                GlStateManager.translate(this.propaneCanister.rotationPointX * DEFAULT_SCALE, this.propaneCanister.rotationPointY * DEFAULT_SCALE, this.propaneCanister.rotationPointZ * DEFAULT_SCALE);
                GlStateManager.scale(0.85D, 1.0D, 0.85D);
                GlStateManager.translate(-this.propaneCanister.offsetX, -this.propaneCanister.offsetY, -this.propaneCanister.offsetZ);
                GlStateManager.translate(-this.propaneCanister.rotationPointX * DEFAULT_SCALE, -this.propaneCanister.rotationPointY * DEFAULT_SCALE, -this.propaneCanister.rotationPointZ * DEFAULT_SCALE);
                draw(this.propaneCanister);
                GlStateManager.popMatrix();
            }
        }
    }
}
