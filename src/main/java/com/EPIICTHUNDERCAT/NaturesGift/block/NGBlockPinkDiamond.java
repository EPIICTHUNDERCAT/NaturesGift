package com.EPIICTHUNDERCAT.NaturesGift.block;

import com.EPIICTHUNDERCAT.NaturesGift.block.material.NGMaterial;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NGBlockPinkDiamond extends NGBlock {

	public NGBlockPinkDiamond(String name, Material material) {
		super(name, material);
		this.setHardness(3.0F);
	}

	@Override
	public void onBlockPlacedBy(final World w, final BlockPos coord, final IBlockState bs,
			final EntityLivingBase placer, final ItemStack src) {
		super.onBlockPlacedBy(w, coord, bs, placer, src);
		// Once Player Places
		if (placer instanceof EntityPlayer) {
			((EntityPlayer) placer).addStat(NGAchievement.SOPINK, 1);
		}
	}
	
}
