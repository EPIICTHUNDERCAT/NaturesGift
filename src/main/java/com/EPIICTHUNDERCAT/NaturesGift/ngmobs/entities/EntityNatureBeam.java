package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityNatureBeam extends EntityThrowable {

	public static boolean entity;
	public static boolean player;
	public static boolean block;
	private EntityLivingBase shootingEntity;
	float damageadd = 1;

	public EntityNatureBeam(World worldIn) {
		super(worldIn);
	}

	public EntityNatureBeam(World worldIn, EntityLivingBase shooter, float damageadd) {
		this(worldIn, shooter.posX, shooter.posY + (double) shooter.getEyeHeight() - 0.10000000149011612D,
				shooter.posZ);
		this.shootingEntity = shooter;
		this.damageadd = damageadd;

	}

	public EntityNatureBeam(World worldIn, double x, double y, double z) {
		this(worldIn);
		this.setPosition(x, y, z);
	}

	protected float getGravityVelocity() {
		return 0.0F;

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		World world = this.worldObj;
		int x = this.ticksExisted;
		if ((this.ticksExisted % 2) == 0) {
			NaturesGift.proxy.spawnParticleLeaf(worldObj, this.posX, this.posY, this.posZ, -0.1, 0, -0.2, -255, 255, 255);
			//this.worldObj.spawnParticle(EnumParticleTypes.SPELL_WITCH, this.posX, this.posY, this.posZ, 0.0D, 0.0D,
				//	0.0D);
		}

	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (result.entityHit != null && result.entityHit != this.shootingEntity) {
			result.entityHit.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) this.shootingEntity),
					10.0F);
			for (int j = 0; j < 4; ++j) {
				NaturesGift.proxy.spawnParticleLeaf(worldObj, this.posX, this.posY, this.posZ, 0, 0, 0, 255, 255, 255);

			}
		}
		if (!this.worldObj.isRemote) {
			this.setDead();
		}

	}

}
