package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities;

import javax.annotation.Nullable;

import com.EPIICTHUNDERCAT.NaturesGift.Reference;
import com.EPIICTHUNDERCAT.NaturesGift.util.NGSoundHandler;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityAgaric extends EntityGolem implements IRangedAttackMob {
	
	
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/agaric");

	public EntityAgaric(World worldIn) {
		super(worldIn);
		this.experienceValue = 20;
	}
	
	 

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.25D, 10, 20.0F));
		this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(1,
				new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, true, false, IMob.MOB_SELECTOR));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
	}

	protected void entityInit() {
		super.entityInit();
		
		

	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
		 EntityAgaricShot entityagaricshot = new EntityAgaricShot(this.worldObj, this, distanceFactor);
	        double d0 = target.posY + (double)target.getEyeHeight() - 1.100000023841858D;
	        double d1 = target.posX - this.posX;
	        double d2 = d0 - entityagaricshot.posY;
	        double d3 = target.posZ - this.posZ;
	        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.2F;
	        entityagaricshot.setThrowableHeading(d1, d2 + (double)f, d3, 1.6F, 12.0F);
	        this.playSound(SoundEvents.ENTITY_SNOWMAN_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	        this.worldObj.spawnEntityInWorld(entityagaricshot);
	    	

	}

	protected SoundEvent getAmbientSound() {
		return NGSoundHandler.AGARIC_AMBIANT;

	}

	protected SoundEvent getHurtSound() {
		return NGSoundHandler.AGARIC_HURT_SOUND;

	}

	protected SoundEvent getDeathSound() {
		return NGSoundHandler.AGARIC_DEATH_SOUND;
	}

	protected void playStepSound(BlockPos pos, Block blockIn) {

	}

	protected float getSoundVolume() {
		return 0.4F;
	}

	@Override
	public int getMaxSpawnedInChunk() {
		return 2;
	}

	@Override
	@Nullable
	protected ResourceLocation getLootTable() {
		return LOOT;
	}

	protected boolean canDespawn() {
		return false;
	}
	
}
