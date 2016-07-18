package com.EPIICTHUNDERCAT.NaturesGift.Blocks;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGCreativeTabs;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class NGBlockPinkDiamond extends Block{
	
	public NGBlockPinkDiamond(String name) {
		super(Material.GROUND);
		this.setHardness(0.5F);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.blockSoundType = Blocks.DIRT.getSoundType();
		this.setCreativeTab(NGCreativeTabs.NGMaterials);
		addToBlocks(this);
	}
	private void addToBlocks(NGBlockPinkDiamond block) {
		NGBlocks.blocks.add(block);
	}
	@Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
            entityIn.fall(fallDistance = 0, 0.0F);
    }
	
	@Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		
		return this.getDefaultState();
	}
}
