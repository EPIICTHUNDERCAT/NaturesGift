package com.EPIICTHUNDERCAT.NaturesGift.block;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.block.material.NGMaterial;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NGBlockPinkDiamond extends NGBlock {

	public NGBlockPinkDiamond(String name) {
		super(name, NGMaterial.PINK_DIAMOND);
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
