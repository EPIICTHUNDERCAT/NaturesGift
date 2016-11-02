package com.EPIICTHUNDERCAT.NaturesGift.block;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NGBlock extends Block {

	public NGBlock(String name, Material material){
		super(material);
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(NGCreativeTabs.NGMaterials);
		addToBlocks(this);
	}
	private void addToBlocks(Block block) {
		NGBlocks.blocks.add(block);
	}
}
