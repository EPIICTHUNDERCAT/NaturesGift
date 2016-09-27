package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.entity.EntityNatureBeam;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NGNatureWand extends NGItem{
	
	public static int leafDamage;
	public static int superiorDamage;
	private int uses;
	
	public NGNatureWand(String name) {
		super(name);
		this.setMaxStackSize(1);
		if (this.getRegistryName().toString().substring(11).startsWith("superior")) {
			this.setMaxDamage(superiorDamage);
		} else {
			this.setMaxDamage(leafDamage);
		}
		
	}
public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack){
	if (stack.hasTagCompound()) {
		if (stack.getTagCompound().hasKey("wandCooldown")) {
			if (stack.getTagCompound().getInteger("wandCooldown") == 0) {
				if (stack.getTagCompound().hasKey("firing")) {
					stack.getTagCompound().setInteger("firing", stack.getTagCompound().getInteger("firing") + 1);
				} else {
					stack.getTagCompound().setInteger("firing", 1);
				}
				stack.getTagCompound().setInteger("wandCooldown", 10);
				return false;
			}
		} else {
			if (stack.getTagCompound().hasKey("firing")) {
				stack.getTagCompound().setInteger("firing", stack.getTagCompound().getInteger("firing") + 1);
			} else {
				stack.getTagCompound().setInteger("firing", 1);
			}
			stack.getTagCompound().setInteger("wandCooldown", 10);
			return false;
		}
	}
	return true;
}
@Override
public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand,
		EnumFacing facing, float hitX, float hitY, float hitZ) {
	return EnumActionResult.PASS;

}

@Override
public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
	if (stack.hasTagCompound()) {
		if (stack.getTagCompound().hasKey("wandCooldown")) {
			if (stack.getTagCompound().getInteger("wandCooldown") > 0) {
				stack.getTagCompound().setInteger("wandCooldown",
						stack.getTagCompound().getInteger("wandCooldown") - 1);
			}

			if (stack.getTagCompound().hasKey("firing")) {
				if (stack.getTagCompound().getInteger("firing") > 0) {
					stack.getTagCompound().setInteger("firing", stack.getTagCompound().getInteger("firing") - 1);
					for (int i = 0; i < 6; ++i) {
						if ((i % 6) == 0) {
							if (!world.isRemote) {
								world.playSound((EntityPlayer) null, entity.posX, entity.posY, entity.posZ,
										SoundEvents.ENTITY_WITHER_SHOOT, SoundCategory.NEUTRAL, 1.5F, 10.0F);
								EntityNatureBeam beam = new EntityNatureBeam(world, (EntityLivingBase) entity);
								beam.setHeadingFromThrower(entity, entity.rotationPitch, entity.rotationYaw, 0.0F,
										1.0F, 0.0F);
								entity.getEntityWorld().spawnEntityInWorld(beam);
								stack.damageItem(1, (EntityPlayer) entity);
								if (stack.getItemDamage() == stack.getMaxDamage()){
									entity.replaceItemInInventory(itemSlot, null);
								}
							}
						}
					}
				}
			}
		}

	} else {
		stack.setTagCompound(new NBTTagCompound());
	}
}

public float getStrVsBlock(ItemStack stack, IBlockState state) {
	return !state.getBlock().equals(Blocks.TALLGRASS) || !state.equals(Blocks.GRASS)? 0.0F : 1.0F;
}

public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos,
		EntityLivingBase entityLiving) {
	return !world.getBlockState(pos).getBlock().equals(Blocks.TALLGRASS) || !world.getBlockState(pos).equals(Blocks.GRASS);
}

   public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return slotChanged;
    }

}
