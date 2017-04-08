package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.models;

import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities.EntityAgaric;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class AgaricModel extends ModelBase {
	public ModelRenderer body;
	public ModelRenderer Neck;
	public ModelRenderer LegLeft;
	public ModelRenderer LegRight;
	public ModelRenderer BodyMushroom;
	public ModelRenderer BodyMushroom2;
	public ModelRenderer Neck2;
	public ModelRenderer Head;
	public ModelRenderer ArmLeft;
	public ModelRenderer ArmRight;
	public ModelRenderer LeftEar;
	public ModelRenderer RightEar;
	public ModelRenderer MushroomBaseLeftEar;
	public ModelRenderer MushroomBaseRightEar;
	public ModelRenderer MushroomTopRight;
	public ModelRenderer MushroomTopRight2;
	public ModelRenderer MushroomTop;
	public ModelRenderer MushroomTop1;
	public ModelRenderer HandArm;
	public ModelRenderer MushroomHand;
	public ModelRenderer MushroomTopRight_1;
	public ModelRenderer MushroomTopRight2_1;
	public ModelRenderer HandArm_1;
	public ModelRenderer Leg2;
	public ModelRenderer shoeleft;
	public ModelRenderer MushroomBaseRightEar_1;
	public ModelRenderer MushroomTopRight_2;
	public ModelRenderer MushroomTopRight2_2;
	public ModelRenderer LegRight2;
	public ModelRenderer shoeright;
	public ModelRenderer MushroomBaseRightEar_2;
	public ModelRenderer MushroomTopRight_3;
	public ModelRenderer MushroomTopRight2_3;
	public ModelRenderer MushroomTop_1;
	public ModelRenderer BodyMushTop;
	public ModelRenderer MushroomTop_2;
	public ModelRenderer BodyMushTop_1;

	public AgaricModel() {
		this.textureWidth = 72;
		this.textureHeight = 72;
		this.RightEar = new ModelRenderer(this, 32, 12);
		this.RightEar.setRotationPoint(-6.1F, 0.0F, 0.0F);
		this.RightEar.addBox(-1.3F, -2.8F, -0.9F, 3, 3, 2, 0.0F);
		this.MushroomTopRight2_2 = new ModelRenderer(this, 30, 22);
		this.MushroomTopRight2_2.setRotationPoint(0.0F, -2.3F, 0.0F);
		this.MushroomTopRight2_2.addBox(-0.7F, -0.2F, -1.1F, 2, 1, 2, 0.0F);
		this.LegLeft = new ModelRenderer(this, 0, 0);
		this.LegLeft.setRotationPoint(2.5F, 7.4F, -1.3F);
		this.LegLeft.addBox(-0.9F, 0.0F, -0.9F, 2, 4, 2, 0.0F);
		this.setRotateAngle(LegLeft, -0.045553093477052F, 0.045553093477052F, -0.31869712141416456F);
		this.Leg2 = new ModelRenderer(this, 66, 20);
		this.Leg2.setRotationPoint(-0.2F, 3.8F, -0.1F);
		this.Leg2.addBox(-0.2F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(Leg2, 0.0F, 0.045553093477052F, 0.36425021489121656F);
		this.LeftEar = new ModelRenderer(this, 60, 2);
		this.LeftEar.setRotationPoint(3.0F, -4.7F, 0.0F);
		this.LeftEar.addBox(-1.3F, -2.8F, -0.9F, 3, 3, 2, 0.0F);
		this.MushroomTopRight2 = new ModelRenderer(this, 42, 10);
		this.MushroomTopRight2.setRotationPoint(0.0F, -2.3F, 0.0F);
		this.MushroomTopRight2.addBox(-0.7F, -0.2F, -1.1F, 2, 1, 2, 0.0F);
		this.MushroomTopRight_2 = new ModelRenderer(this, 12, 21);
		this.MushroomTopRight_2.setRotationPoint(0.3F, -2.0F, 0.0F);
		this.MushroomTopRight_2.addBox(-1.2F, -2.0F, -1.6F, 3, 2, 3, 0.0F);
		this.shoeright = new ModelRenderer(this, 42, 22);
		this.shoeright.setRotationPoint(0.3F, 4.8F, 0.0F);
		this.shoeright.addBox(-1.4F, 0.0F, -2.4F, 3, 1, 3, 0.0F);
		this.BodyMushroom2 = new ModelRenderer(this, 47, 0);
		this.BodyMushroom2.setRotationPoint(-2.9F, 0.7F, -3.8F);
		this.BodyMushroom2.addBox(-0.6F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(BodyMushroom2, -0.4553564018453205F, -1.4570008595648662F, -0.045553093477052F);
		this.LegRight2 = new ModelRenderer(this, 38, 22);
		this.LegRight2.setRotationPoint(0.0F, 3.7F, 0.0F);
		this.LegRight2.addBox(-0.3F, 0.0F, -0.7F, 1, 5, 1, 0.0F);
		this.setRotateAngle(LegRight2, 0.0F, 0.0F, -0.22759093446006054F);
		this.body = new ModelRenderer(this, 0, 0);
		this.body.setRotationPoint(0.0F, 5.7F, 0.0F);
		this.body.addBox(-4.4F, 0.0F, -4.9F, 8, 8, 8, 0.0F);
		this.MushroomTop_2 = new ModelRenderer(this, 12, 26);
		this.MushroomTop_2.setRotationPoint(0.0F, -3.2F, 0.0F);
		this.MushroomTop_2.addBox(-1.4F, -1.4F, -1.4F, 3, 2, 3, 0.0F);
		this.MushroomTop = new ModelRenderer(this, 12, 16);
		this.MushroomTop.setRotationPoint(-0.4F, -1.5F, 0.2F);
		this.MushroomTop.addBox(-1.1F, -1.5F, -1.3F, 3, 2, 3, 0.0F);
		this.MushroomTopRight_3 = new ModelRenderer(this, 54, 22);
		this.MushroomTopRight_3.setRotationPoint(-0.3F, -2.0F, 0.0F);
		this.MushroomTopRight_3.addBox(-1.2F, -2.0F, -1.6F, 3, 2, 3, 0.0F);
		this.MushroomBaseLeftEar = new ModelRenderer(this, 64, 7);
		this.MushroomBaseLeftEar.setRotationPoint(-0.1F, -3.1F, 0.5F);
		this.MushroomBaseLeftEar.addBox(-0.4F, -1.5F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(MushroomBaseLeftEar, -0.40980330836826856F, 0.6829473363053812F, 0.0F);
		this.BodyMushroom = new ModelRenderer(this, 32, 0);
		this.BodyMushroom.setRotationPoint(1.6F, 0.4F, -3.4F);
		this.BodyMushroom.addBox(-0.3F, -3.3F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(BodyMushroom, 0.5462880558742251F, 0.6829473363053812F, 0.6373942428283291F);
		this.MushroomTop_1 = new ModelRenderer(this, 0, 25);
		this.MushroomTop_1.setRotationPoint(0.3F, -3.7F, 0.0F);
		this.MushroomTop_1.addBox(-1.6F, -1.1F, -1.5F, 3, 2, 3, 0.0F);
		this.MushroomBaseRightEar_1 = new ModelRenderer(this, 64, 11);
		this.MushroomBaseRightEar_1.setRotationPoint(0.7F, 0.2F, -1.6F);
		this.MushroomBaseRightEar_1.addBox(-0.3F, -2.1F, -0.9F, 1, 2, 1, 0.0F);
		this.setRotateAngle(MushroomBaseRightEar_1, 0.27314402793711257F, -0.40980330836826856F, 0.18203784098300857F);
		this.Neck = new ModelRenderer(this, 32, 0);
		this.Neck.setRotationPoint(-0.2F, 0.7F, 0.0F);
		this.Neck.addBox(-2.8F, -4.6F, -2.2F, 5, 5, 5, 0.0F);
		this.setRotateAngle(Neck, -0.36425021489121656F, 0.0F, 0.0F);
		this.HandArm_1 = new ModelRenderer(this, 52, 20);
		this.HandArm_1.setRotationPoint(-5.6F, 0.0F, 0.0F);
		this.HandArm_1.addBox(-5.8F, -0.3F, -0.5F, 6, 1, 1, 0.0F);
		this.setRotateAngle(HandArm_1, -0.36425021489121656F, -1.0927506446736497F, 0.0F);
		this.MushroomBaseRightEar = new ModelRenderer(this, 67, 9);
		this.MushroomBaseRightEar.setRotationPoint(-0.8F, -2.6F, 0.0F);
		this.MushroomBaseRightEar.addBox(-0.6F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(MushroomBaseRightEar, 0.0F, 0.0F, -0.5462880558742251F);
		this.MushroomTop1 = new ModelRenderer(this, 21, 16);
		this.MushroomTop1.setRotationPoint(-0.2F, -0.8F, 0.5F);
		this.MushroomTop1.addBox(-0.5F, -1.2F, -1.3F, 2, 1, 2, 0.0F);
		this.MushroomTopRight2_3 = new ModelRenderer(this, 22, 24);
		this.MushroomTopRight2_3.setRotationPoint(0.0F, -2.3F, 0.0F);
		this.MushroomTopRight2_3.addBox(-0.7F, -0.2F, -1.1F, 2, 1, 2, 0.0F);
		this.BodyMushTop = new ModelRenderer(this, 28, 25);
		this.BodyMushTop.setRotationPoint(0.0F, -1.0F, -0.2F);
		this.BodyMushTop.addBox(-1.1F, -0.6F, -0.8F, 2, 1, 2, 0.0F);
		this.MushroomTopRight2_1 = new ModelRenderer(this, 9, 16);
		this.MushroomTopRight2_1.setRotationPoint(0.0F, 0.2F, -1.2F);
		this.MushroomTopRight2_1.addBox(-0.8F, -1.2F, -1.1F, 2, 2, 1, 0.0F);
		this.MushroomBaseRightEar_2 = new ModelRenderer(this, 9, 21);
		this.MushroomBaseRightEar_2.setRotationPoint(-0.8F, 0.3F, -1.8F);
		this.MushroomBaseRightEar_2.addBox(-0.5F, -2.2F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(MushroomBaseRightEar_2, 0.31869712141416456F, 1.0016444577195458F, 0.0F);
		this.shoeleft = new ModelRenderer(this, 0, 21);
		this.shoeleft.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.shoeleft.addBox(-1.3F, 0.0F, -2.4F, 3, 1, 3, 0.0F);
		this.ArmRight = new ModelRenderer(this, 32, 10);
		this.ArmRight.setRotationPoint(-2.3F, -3.4F, -0.2F);
		this.ArmRight.addBox(-5.4F, -0.3F, -0.5F, 5, 1, 1, 0.0F);
		this.setRotateAngle(ArmRight, 0.7285004297824331F, -0.31869712141416456F, -0.36425021489121656F);
		this.MushroomTopRight = new ModelRenderer(this, 0, 16);
		this.MushroomTopRight.setRotationPoint(-0.3F, -2.0F, 0.0F);
		this.MushroomTopRight.addBox(-1.2F, -2.0F, -1.6F, 3, 2, 3, 0.0F);
		this.ArmLeft = new ModelRenderer(this, 58, 0);
		this.ArmLeft.setRotationPoint(2.0F, -3.1F, 0.0F);
		this.ArmLeft.addBox(0.0F, -0.6F, -0.3F, 5, 1, 1, 0.0F);
		this.setRotateAngle(ArmLeft, 0.091106186954104F, 0.36425021489121656F, 0.40980330836826856F);
		this.HandArm = new ModelRenderer(this, 29, 17);
		this.HandArm.setRotationPoint(4.6F, -0.1F, 0.4F);
		this.HandArm.addBox(0.3F, -0.4F, -0.7F, 5, 1, 1, 0.0F);
		this.setRotateAngle(HandArm, -0.36425021489121656F, 0.8196066167365371F, 0.0F);
		this.BodyMushTop_1 = new ModelRenderer(this, 40, 26);
		this.BodyMushTop_1.setRotationPoint(0.1F, -1.2F, -0.1F);
		this.BodyMushTop_1.addBox(-1.1F, -0.6F, -0.8F, 2, 1, 2, 0.0F);
		this.MushroomTopRight_1 = new ModelRenderer(this, 22, 19);
		this.MushroomTopRight_1.setRotationPoint(0.1F, 0.5F, -7.5F);
		this.MushroomTopRight_1.addBox(-1.4F, -1.4F, -1.8F, 3, 3, 2, 0.0F);
		this.LegRight = new ModelRenderer(this, 24, 0);
		this.LegRight.setRotationPoint(-3.2F, 7.4F, -1.1F);
		this.LegRight.addBox(-1.1F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(LegRight, 0.0F, 0.0F, 0.22759093446006054F);
		this.MushroomHand = new ModelRenderer(this, 34, 13);
		this.MushroomHand.setRotationPoint(4.5F, 0.0F, 0.0F);
		this.MushroomHand.addBox(-0.3F, 0.0F, -7.6F, 1, 1, 8, 0.0F);
		this.setRotateAngle(MushroomHand, -1.3203415791337103F, -1.3203415791337103F, 0.5462880558742251F);
		this.Neck2 = new ModelRenderer(this, 52, 0);
		this.Neck2.setRotationPoint(-0.3F, -3.4F, -0.7F);
		this.Neck2.addBox(-1.0F, -5.6F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(Neck2, 0.4134684997974567F, 0.0F, 0.0F);
		this.Head = new ModelRenderer(this, 46, 8);
		this.Head.setRotationPoint(-0.4F, -8.6F, -2.1F);
		this.Head.addBox(-2.8F, -5.7F, -3.1F, 6, 6, 6, 0.0F);
		this.setRotateAngle(Head, 0.36425021489121656F, 0.0F, 0.0F);
		this.LeftEar.addChild(this.RightEar);
		this.MushroomTopRight_2.addChild(this.MushroomTopRight2_2);
		this.body.addChild(this.LegLeft);
		this.LegLeft.addChild(this.Leg2);
		this.Head.addChild(this.LeftEar);
		this.MushroomTopRight.addChild(this.MushroomTopRight2);
		this.MushroomBaseRightEar_1.addChild(this.MushroomTopRight_2);
		this.LegRight2.addChild(this.shoeright);
		this.body.addChild(this.BodyMushroom2);
		this.LegRight.addChild(this.LegRight2);
		this.BodyMushroom2.addChild(this.MushroomTop_2);
		this.MushroomBaseLeftEar.addChild(this.MushroomTop);
		this.MushroomBaseRightEar_2.addChild(this.MushroomTopRight_3);
		this.LeftEar.addChild(this.MushroomBaseLeftEar);
		this.body.addChild(this.BodyMushroom);
		this.BodyMushroom.addChild(this.MushroomTop_1);
		this.shoeleft.addChild(this.MushroomBaseRightEar_1);
		this.body.addChild(this.Neck);
		this.ArmRight.addChild(this.HandArm_1);
		this.RightEar.addChild(this.MushroomBaseRightEar);
		this.MushroomTop.addChild(this.MushroomTop1);
		this.MushroomTopRight_3.addChild(this.MushroomTopRight2_3);
		this.MushroomTop_1.addChild(this.BodyMushTop);
		this.MushroomTopRight_1.addChild(this.MushroomTopRight2_1);
		this.shoeright.addChild(this.MushroomBaseRightEar_2);
		this.Leg2.addChild(this.shoeleft);
		this.Neck.addChild(this.ArmRight);
		this.MushroomBaseRightEar.addChild(this.MushroomTopRight);
		this.Neck.addChild(this.ArmLeft);
		this.ArmLeft.addChild(this.HandArm);
		this.MushroomTop_2.addChild(this.BodyMushTop_1);
		this.MushroomHand.addChild(this.MushroomTopRight_1);
		this.body.addChild(this.LegRight);
		this.HandArm.addChild(this.MushroomHand);
		this.Neck.addChild(this.Neck2);
		this.Neck.addChild(this.Head);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {

		GlStateManager.pushMatrix();
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

		float speed = (float) ((new Vec3d(entity.motionX, 0, entity.motionZ)).lengthVector() * 2.0f);

		this.body.render(scale);
		//LegRight.rotateAngleX = (float) Math
		//		.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(ageInTicks % 360) * 24F));

	//	LegLeft.rotateAngleX = -(float) Math
		//		.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(ageInTicks % 360) * 24F));

		ArmLeft.rotateAngleX = -(float) Math
				.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(ageInTicks % 360) * 24F));

		ArmRight.rotateAngleX = -(float) Math
				.toRadians(speed * 240f * (float) Math.sin(Math.toRadians(ageInTicks % 360) * 24F));
		
		LegRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		LegLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		
		GlStateManager.popMatrix();

	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);

	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
