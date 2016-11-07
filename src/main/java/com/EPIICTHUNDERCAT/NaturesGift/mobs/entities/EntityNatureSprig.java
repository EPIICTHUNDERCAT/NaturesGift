package com.EPIICTHUNDERCAT.NaturesGift.Mobs.entities;

import javax.annotation.Nullable;

import com.EPIICTHUNDERCAT.NaturesGift.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityNatureSprig extends EntityMob{
	
	public static final ResourceLocation LOOT = new ResourceLocation(Reference.ID, "entities/naturesprig");
	
	 public EntityNatureSprig(World worldIn)
	    {
	        super(worldIn);
	    }
	 protected void initEntityAI() {
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
			this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.applyEntityAI();

		}

		protected void applyEntityAI() {

		}

		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.75D);
			this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0);
			this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
		}

		protected void entityInit() {
			super.entityInit();

		}
		protected int getExperiencePoints(EntityPlayer player) {
			this.experienceValue = (int) ((float) this.experienceValue * 2.5F);

			return super.getExperiencePoints(player);
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
		 public boolean isNonBoss()
		    {
		        return false;
		    }
		 public void addPotionEffect(PotionEffect potioneffectIn)
		    {
			 
		    }

}
