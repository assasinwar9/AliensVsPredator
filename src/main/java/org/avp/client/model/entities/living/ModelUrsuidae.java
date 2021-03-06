package org.avp.client.model.entities.living;

import com.asx.mdx.lib.client.util.models.Model;

import net.minecraft.client.model.ModelRenderer;

public class ModelUrsuidae extends Model
{
    public ModelRenderer chest;
    public ModelRenderer stomach;
    public ModelRenderer neck;
    public ModelRenderer head1;
    public ModelRenderer lArm1;
    public ModelRenderer rArm1;
    public ModelRenderer lLeg1;
    public ModelRenderer rLeg1;
    public ModelRenderer lLeg2;
    public ModelRenderer lLeg3;
    public ModelRenderer lHoof;
    public ModelRenderer lBHoofB;
    public ModelRenderer rLeg2;
    public ModelRenderer rLeg3;
    public ModelRenderer rHoof;
    public ModelRenderer rBHoofB;
    public ModelRenderer muzzle;
    public ModelRenderer eyes;
    public ModelRenderer lWhiskers;
    public ModelRenderer rWhiskers;
    public ModelRenderer teethUpper;
    public ModelRenderer quills1;
    public ModelRenderer quills2;
    public ModelRenderer lLowerJaw2;
    public ModelRenderer rlowerJaw2;
    public ModelRenderer lowerJaw;
    public ModelRenderer lJawTendons;
    public ModelRenderer rJawTendons;
    public ModelRenderer teethLower;
    public ModelRenderer lTusk;
    public ModelRenderer rTusk;
    public ModelRenderer lArm2;
    public ModelRenderer lFoot;
    public ModelRenderer lHoofF;
    public ModelRenderer lHoofFB;
    public ModelRenderer rArm2;
    public ModelRenderer rFoot;
    public ModelRenderer rHoofF;
    public ModelRenderer rHoofFB;

    public ModelUrsuidae()
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rArm1 = new ModelRenderer(this, 58, 0);
        this.rArm1.setRotationPoint(-2.5F, -0.4F, -3.0F);
        this.rArm1.addBox(-2.0F, 0.0F, -1.0F, 3, 6, 3, 0.0F);
        this.setRotation(rArm1, 0.2617993877991494F, -0.0F, 0.05235987755982988F);
        this.lLeg2 = new ModelRenderer(this, 106, 13);
        this.lLeg2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.lLeg2.addBox(-1.4F, 0.3F, 0.8F, 3, 3, 5, 0.0F);
        this.setRotation(lLeg2, 0.5009094953223726F, -0.0F, -0.045553093477052F);
        this.lWhiskers = new ModelRenderer(this, 0, 50);
        this.lWhiskers.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWhiskers.addBox(2.2F, -4.4F, 0.2F, 0, 7, 5, 0.0F);
        this.setRotation(lWhiskers, 0.0F, 0.7330382858376184F, 0.0F);
        this.rLeg2 = new ModelRenderer(this, 88, 13);
        this.rLeg2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.rLeg2.addBox(-1.8F, 0.3F, 0.8F, 3, 3, 5, 0.0F);
        this.setRotation(rLeg2, 0.5009094953223726F, -0.0F, 0.045553093477052F);
        this.teethLower = new ModelRenderer(this, 7, 18);
        this.teethLower.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.teethLower.addBox(-0.8F, -0.6F, -2.6F, 3, 1, 0, 0.0F);
        this.lHoofFB = new ModelRenderer(this, 72, 26);
        this.lHoofFB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHoofFB.addBox(-0.5F, 1.4F, -0.2F, 1, 2, 1, 0.0F);
        this.setRotation(lHoofFB, 0.18203784098300857F, 0.0F, 0.0F);
        this.lLeg1 = new ModelRenderer(this, 106, 0);
        this.lLeg1.setRotationPoint(2.0F, 0.3F, 5.9F);
        this.lLeg1.addBox(-1.0F, -1.5F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotation(lLeg1, -0.3665191429188092F, -0.0F, -0.12217304763960307F);
        this.neck = new ModelRenderer(this, 26, 31);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addBox(-2.0F, -1.4F, -7.0F, 4, 3, 3, 0.0F);
        this.setRotation(neck, -0.15707963267948966F, -0.0F, 0.0F);
        this.lLeg3 = new ModelRenderer(this, 106, 22);
        this.lLeg3.setRotationPoint(0.2F, 1.9F, 4.8F);
        this.lLeg3.addBox(-1.0F, 0.3F, -0.9F, 2, 5, 2, 0.0F);
        this.setRotation(lLeg3, -0.31869712141416456F, -0.0F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 6, 39);
        this.lowerJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerJaw.addBox(-0.8F, 0.2F, -2.6F, 3, 1, 1, 0.0F);
        this.rHoofF = new ModelRenderer(this, 58, 21);
        this.rHoofF.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHoofF.addBox(-1.1F, 0.3F, -1.1F, 2, 3, 1, 0.0F);
        this.quills2 = new ModelRenderer(this, 12, 57);
        this.quills2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.quills2.addBox(-1.5F, -2.0F, -0.1F, 4, 0, 5, 0.0F);
        this.setRotation(quills2, 0.15707963267948966F, -0.0F, 0.0F);
        this.lBHoofB = new ModelRenderer(this, 72, 26);
        this.lBHoofB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lBHoofB.addBox(0.1F, 4.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotation(lBHoofB, 0.18203784098300857F, -0.091106186954104F, 0.091106186954104F);
        this.rlowerJaw2 = new ModelRenderer(this, 2, 33);
        this.rlowerJaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rlowerJaw2.addBox(-1.1F, 0.2F, -1.7F, 2, 1, 2, 0.0F);
        this.lJawTendons = new ModelRenderer(this, 13, 24);
        this.lJawTendons.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lJawTendons.addBox(2.2F, -1.5F, -1.6F, 0, 2, 3, 0.0F);
        this.setRotation(lJawTendons, -0.091106186954104F, -0.0F, -0.136659280431156F);
        this.lFoot = new ModelRenderer(this, 72, 16);
        this.lFoot.setRotationPoint(1.0F, 3.0F, 0.4F);
        this.lFoot.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotation(lFoot, 0.045553093477052F, 0.0F, 0.0F);
        this.rTusk = new ModelRenderer(this, 3, 16);
        this.rTusk.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.rTusk.addBox(-1.1F, -0.7F, -2.6F, 0, 2, 1, 0.0F);
        this.setRotation(rTusk, 0.05235987755982988F, -0.0F, -0.20943951023931953F);
        this.quills1 = new ModelRenderer(this, 12, 57);
        this.quills1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.quills1.addBox(-2.0F, -3.0F, -0.5F, 4, 0, 5, 0.0F);
        this.setRotation(quills1, 0.15707963267948966F, -0.0F, 0.0F);
        this.lHoof = new ModelRenderer(this, 72, 21);
        this.lHoof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHoof.addBox(-0.5F, 4.1F, -1.9F, 2, 2, 1, 0.0F);
        this.setRotation(lHoof, 0.18203784098300857F, 0.0F, 0.091106186954104F);
        this.rFoot = new ModelRenderer(this, 58, 16);
        this.rFoot.setRotationPoint(-0.5F, 3.0F, 0.4F);
        this.rFoot.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotation(rFoot, 0.045553093477052F, 0.0F, 0.0F);
        this.rLeg3 = new ModelRenderer(this, 88, 22);
        this.rLeg3.setRotationPoint(0.0F, 1.9F, 4.8F);
        this.rLeg3.addBox(-1.3F, 0.3F, -0.9F, 2, 5, 2, 0.0F);
        this.setRotation(rLeg3, -0.31869712141416456F, -0.0F, 0.0F);
        this.lHoofF = new ModelRenderer(this, 72, 21);
        this.lHoofF.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHoofF.addBox(-0.9F, 0.3F, -1.1F, 2, 3, 1, 0.0F);
        this.lLowerJaw2 = new ModelRenderer(this, 12, 33);
        this.lLowerJaw2.setRotationPoint(-0.6F, -0.1F, -1.1F);
        this.lLowerJaw2.addBox(0.4F, 0.2F, -1.7F, 2, 1, 2, 0.0F);
        this.setRotation(lLowerJaw2, 0.31869712141416456F, -0.0F, 0.0F);
        this.rLeg1 = new ModelRenderer(this, 88, 0);
        this.rLeg1.setRotationPoint(-2.0F, 0.3F, 5.9F);
        this.rLeg1.addBox(-2.0F, -1.5F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotation(rLeg1, -0.3665191429188092F, -0.0F, 0.12217304763960307F);
        this.lTusk = new ModelRenderer(this, 3, 16);
        this.lTusk.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.lTusk.addBox(2.4F, -0.7F, -2.6F, 0, 2, 1, 0.0F);
        this.setRotation(lTusk, 0.05235987755982988F, -0.0F, 0.20943951023931953F);
        this.rWhiskers = new ModelRenderer(this, 0, 50);
        this.rWhiskers.mirror = true;
        this.rWhiskers.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWhiskers.addBox(-2.2F, -4.4F, -0.4F, 0, 7, 5, 0.0F);
        this.setRotation(rWhiskers, 0.0F, -0.7330382858376184F, 0.0F);
        this.stomach = new ModelRenderer(this, 31, 14);
        this.stomach.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.stomach.addBox(-3.0F, -1.5F, 1.8F, 6, 5, 6, 0.0F);
        this.muzzle = new ModelRenderer(this, 0, 8);
        this.muzzle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.muzzle.addBox(-1.5F, -2.5F, -3.5F, 3, 2, 2, 0.0F);
        this.setRotation(muzzle, 0.2792526803190927F, -0.0F, 0.0F);
        this.head1 = new ModelRenderer(this, 15, 43);
        this.head1.setRotationPoint(0.0F, -0.5F, -5.7F);
        this.head1.addBox(-2.0F, -3.1F, -3.3F, 4, 2, 3, 0.0F);
        this.lArm2 = new ModelRenderer(this, 72, 10);
        this.lArm2.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.lArm2.addBox(0.0F, 0.1F, -0.6F, 2, 3, 2, 0.0F);
        this.setRotation(lArm2, -0.36425021489121656F, -0.0F, -0.0F);
        this.eyes = new ModelRenderer(this, 1, 1);
        this.eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyes.addBox(-2.0F, -2.6F, -3.9F, 4, 2, 2, 0.0F);
        this.setRotation(eyes, -0.12217304763960307F, -0.0F, 0.0F);
        this.rBHoofB = new ModelRenderer(this, 58, 26);
        this.rBHoofB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rBHoofB.addBox(-1.4F, 4.1F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotation(rBHoofB, 0.18203784098300857F, 0.091106186954104F, -0.091106186954104F);
        this.lArm1 = new ModelRenderer(this, 72, 0);
        this.lArm1.setRotationPoint(2.0F, -0.4F, -3.0F);
        this.lArm1.addBox(-0.5F, 0.0F, -1.0F, 3, 6, 3, 0.0F);
        this.setRotation(lArm1, 0.2617993877991494F, -0.0F, -0.05235987755982988F);
        this.teethUpper = new ModelRenderer(this, 7, 14);
        this.teethUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.teethUpper.addBox(-1.5F, -0.7F, -3.4F, 3, 1, 0, 0.0F);
        this.setRotation(teethUpper, 0.2792526803190927F, -0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 29, 0);
        this.chest.setRotationPoint(0.0F, 13.5F, -4.0F);
        this.chest.addBox(-3.5F, -2.0F, -5.0F, 7, 6, 7, 0.0F);
        this.setRotation(chest, -0.03490658503988659F, -0.0F, 0.0F);
        this.rArm2 = new ModelRenderer(this, 58, 10);
        this.rArm2.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rArm2.addBox(-1.5F, 0.1F, -0.6F, 2, 3, 2, 0.0F);
        this.setRotation(rArm2, -0.36425021489121656F, -0.0F, 0.0F);
        this.rJawTendons = new ModelRenderer(this, 5, 24);
        this.rJawTendons.mirror = true;
        this.rJawTendons.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rJawTendons.addBox(-1.2F, -1.5F, -1.6F, 0, 2, 3, 0.0F);
        this.setRotation(rJawTendons, -0.091106186954104F, -0.0F, 0.136659280431156F);
        this.rHoofFB = new ModelRenderer(this, 58, 26);
        this.rHoofFB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHoofFB.addBox(-0.5F, 1.4F, -0.2F, 1, 2, 1, 0.0F);
        this.setRotation(rHoofFB, 0.18203784098300857F, 0.0F, 0.0F);
        this.rHoof = new ModelRenderer(this, 58, 22);
        this.rHoof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHoof.addBox(-1.8F, 4.2F, -1.9F, 2, 2, 1, 0.0F);
        this.setRotation(rHoof, 0.18203784098300857F, 0.0F, -0.091106186954104F);
        this.chest.addChild(this.rArm1);
        this.lLeg1.addChild(this.lLeg2);
        this.head1.addChild(this.lWhiskers);
        this.rLeg1.addChild(this.rLeg2);
        this.lowerJaw.addChild(this.teethLower);
        this.lFoot.addChild(this.lHoofFB);
        this.stomach.addChild(this.lLeg1);
        this.chest.addChild(this.neck);
        this.lLeg2.addChild(this.lLeg3);
        this.lLowerJaw2.addChild(this.lowerJaw);
        this.rFoot.addChild(this.rHoofF);
        this.head1.addChild(this.quills2);
        this.lLeg3.addChild(this.lBHoofB);
        this.lLowerJaw2.addChild(this.rlowerJaw2);
        this.lLowerJaw2.addChild(this.lJawTendons);
        this.lArm2.addChild(this.lFoot);
        this.lowerJaw.addChild(this.rTusk);
        this.head1.addChild(this.quills1);
        this.lLeg3.addChild(this.lHoof);
        this.rArm2.addChild(this.rFoot);
        this.rLeg2.addChild(this.rLeg3);
        this.lFoot.addChild(this.lHoofF);
        this.head1.addChild(this.lLowerJaw2);
        this.stomach.addChild(this.rLeg1);
        this.lowerJaw.addChild(this.lTusk);
        this.head1.addChild(this.rWhiskers);
        this.chest.addChild(this.stomach);
        this.head1.addChild(this.muzzle);
        this.chest.addChild(this.head1);
        this.lArm1.addChild(this.lArm2);
        this.head1.addChild(this.eyes);
        this.rLeg3.addChild(this.rBHoofB);
        this.chest.addChild(this.lArm1);
        this.head1.addChild(this.teethUpper);
        this.rArm1.addChild(this.rArm2);
        this.lLowerJaw2.addChild(this.rJawTendons);
        this.rFoot.addChild(this.rHoofFB);
        this.rLeg3.addChild(this.rHoof);
    }

    @Override
    public void render(Object obj)
    {
        draw(chest);
    }
}
