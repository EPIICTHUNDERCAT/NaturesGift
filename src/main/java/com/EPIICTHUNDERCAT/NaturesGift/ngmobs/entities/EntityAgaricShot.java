package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityAgaricShot extends EntityThrowable {

	private static final int Age = 0;
	public static boolean entity;
	public static boolean player;
	public static boolean block;
	private EntityLivingBase thrower;
	private EntityLivingBase shootingEntity;
	float damageadd = 1;
	private int lifetime;

	public EntityAgaricShot(World worldIn) {
		super(worldIn);
		
	}



	
	public EntityAgaricShot(World worldIn, EntityLivingBase shooter, float damageadd) {
		this(worldIn, shooter.posX, shooter.posY + (double) shooter.getEyeHeight() - 0.10000000149011612D,
				shooter.posZ);
		this.shootingEntity = shooter;
		this.damageadd = damageadd;

	}
	
	

	public EntityAgaricShot(World worldIn, double x, double y, double z) {
		this(worldIn);
		this.setPosition(x, y, z);
	}
	public EntityAgaricShot(World worldIn, EntityLivingBase throwerIn)
    {
        this(worldIn, throwerIn.posX, throwerIn.posY + (double)throwerIn.getEyeHeight() - 0.10000000149011612D, throwerIn.posZ);
        this.thrower = throwerIn;
    }








	public void setHeadingFromThrower(Entity entityThrower, float rotationPitchIn, float rotationYawIn, float pitchOffset, float velocity, float inaccuracy)
	    {
	        float f = -MathHelper.sin(rotationYawIn * 0.017453292F) * MathHelper.cos(rotationPitchIn * 0.017453292F);
	        float f1 = -MathHelper.sin((rotationPitchIn + pitchOffset) * 0.017453292F);
	        float f2 = MathHelper.cos(rotationYawIn * 0.017453292F) * MathHelper.cos(rotationPitchIn * 0.017453292F);
	        this.setThrowableHeading((double)f, (double)f1, (double)f2, velocity, inaccuracy);
	        this.motionX += entityThrower.motionX;
	        this.motionZ += entityThrower.motionZ;

	        if (!entityThrower.onGround)
	        {
	            this.motionY += entityThrower.motionY;
	        }
	    }

	protected float getGravityVelocity() {
		return 0.0905F;

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		World world = this.worldObj;
		int x = this.ticksExisted;
		if ((this.ticksExisted % 2) == 0) {
			 if (!this.worldObj.isRemote && this.Age > this.lifetime)
		        {
		            this.setDead();
		        }
			//NaturesGift.proxy.spawnParticleLeaf(worldObj, this.posX, this.posY, this.posZ, -0.1, 0, -0.2, -255, 255,
			//		255);
			// this.worldObj.spawnParticle(EnumParticleTypes.SPELL_WITCH,
			// this.posX, this.posY, this.posZ, 0.0D, 0.0D,
			// 0.0D);
		}

	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (result.entityHit != null && result.entityHit != this.shootingEntity) {
			result.entityHit.attackEntityFrom(DamageSource.causeMobDamage((EntityAgaric) this.shootingEntity),
					10.0F);
			for (int j = 0; j < 4; ++j) {
				this.worldObj.spawnParticle(EnumParticleTypes.DRAGON_BREATH, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
				//NaturesGift.proxy.spawnParticleLeaf(worldObj, this.posX, this.posY, this.posZ, 0, 0, 0, 255, 255, 255);

			}
		}
		if (!this.worldObj.isRemote) {
			this.setDead();
		}

	}
}
