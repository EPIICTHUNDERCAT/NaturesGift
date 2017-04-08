package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities;

import javax.annotation.Nullable;

import com.EPIICTHUNDERCAT.NaturesGift.Reference;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityNatureSprig extends EntityMob implements IRangedAttackMob {

	private final BossInfoServer ngbossInfo = (BossInfoServer) (new BossInfoServer(this.getDisplayName(),
			BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);

	private static final Predicate<Entity> NOT_UNDEAD = new Predicate<Entity>() {
		public boolean apply(@Nullable Entity entity) {
			return entity instanceof EntityLivingBase
					&& ((EntityLivingBase) entity).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD;
		}
	};

	public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/naturesprig");

	public EntityNatureSprig(World worldIn) {
		super(worldIn);
		this.experienceValue = 1000;
		setSize(3.5F, 5.5F);
		

		this.setHealth(this.getMaxHealth());
	}

	@Override
	protected void initEntityAI() {

		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackRanged(this, 1.0D, 40, 20.0F));
		this.tasks.addTask(3, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		this.targetTasks.addTask(2,
				new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, NOT_UNDEAD));
		this.applyEntityAI();
	}

	protected void applyEntityAI() {
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2,
				new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, NOT_UNDEAD));

	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(600.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3000000238418579D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D);
	}

	protected void entityInit() {
		super.entityInit();

	}

	protected boolean canBeRidden(Entity entityIn) {
		return false;
	}
	@Override
	public float getRenderSizeModifier(){
		return 2.0F;
		
	}

	protected void updateAITasks() {
		super.updateAITasks();

		this.ngbossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

	@Override
	public void addTrackingPlayer(EntityPlayerMP player) {
		super.addTrackingPlayer(player);
		this.ngbossInfo.addPlayer(player);
	}

	@Override
	public void removeTrackingPlayer(EntityPlayerMP player) {
		super.removeTrackingPlayer(player);
		this.ngbossInfo.removePlayer(player);
	}

	// Still Need Sounds
	protected SoundEvent getAmbientSound() {
		return null;

	}

	// Still Need Sounds
	protected SoundEvent getHurtSound() {
		return null;

	}

	// Still Need Sounds
	protected SoundEvent getDeathSound() {
		return null;
	}

	// Still Need Sounds
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

	@Override
	public boolean isNonBoss() {
		return false;
	}

	public void addPotionEffect(PotionEffect potioneffectIn) {

	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		// TODO Auto-generated method stub

	}

}
