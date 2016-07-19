package com.EPIICTHUNDERCAT.NaturesGift.Blocks.PreciousBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.EPIICTHUNDERCAT.NaturesGift.Blocks.NGBlockMaterial;
import com.EPIICTHUNDERCAT.NaturesGift.Blocks.NGBlockPinkDiamond;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PinkDiamondBlock extends NGBlockPinkDiamond{

	public PinkDiamondBlock(NGBlockMaterial pinkDiamond, String name) {
		super(name);
		
	}
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> ret = new ArrayList<ItemStack>();
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;
		Item item = NGBlocks.Pink_Diamond_Block.getItemDropped(state, rand, fortune);
		ret.add(new ItemStack(item, 1));
		return ret;
	}}
