package com.EPIICTHUNDERCAT.NaturesGift.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityNatureBeam extends EntityThrowable {
	
	public static boolean entity;
	public static boolean player;
	public static boolean block;
	private EntityLivingBase shootingEntity;
	

	public EntityNatureBeam(World worldIn) {
		super(worldIn);
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (result.typeOfHit.equals(result.typeOfHit.ENTITY)) {
			if (result.entityHit instanceof EntityPlayer && player) {
				EntityLivingBase entity = (EntityLivingBase) result.entityHit;
				if (!this.getEntityWorld().isRemote) {
					entity.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 100, 1, false, false));

				}
			}
			if (result.entityHit instanceof EntityLiving && entity) {
				EntityLivingBase entity = (EntityLivingBase) result.entityHit;
				if (!this.getEntityWorld().isRemote) {
					entity.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 100, 1, false, false));
				
				}
			}
		}
	
		
	}
	public EntityNatureBeam(World worldIn, EntityLivingBase shooter) {
		this(worldIn, shooter.posX, shooter.posY + (double) shooter.getEyeHeight() - 0.10000000149011612D,
				shooter.posZ);
		this.shootingEntity = shooter;

	}

	public EntityNatureBeam(World worldIn, double x, double y, double z) {
		this(worldIn);
		this.setPosition(x, y, z);
	}
	
	protected float getGravityVelocity() {
		return -0.01F;

	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		World world = this.worldObj;
		int x = this.ticksExisted;
		if ((this.ticksExisted % 2) == 0) {
			world.spawnParticle(EnumParticleTypes.SLIME, this.posX, this.posY, this.posZ, 0.1, 1.0, 0.3);
		}

	}
	
	
	
	

}
