package com.EPIICTHUNDERCAT.NaturesGift.block.blocks;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.block.NGBlock;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NGPinkDiamondOre extends NGBlock {

	public NGPinkDiamondOre(String name, Material material) {
		super(name, material);
		this.setHardness(3.0F);
	}

}
