package com.EPIICTHUNDERCAT.NaturesGift.block;

import com.EPIICTHUNDERCAT.NaturesGift.block.material.NGMaterial;

import net.minecraft.block.material.Material;

public class NGBlockPinkDiamond extends NGBlock{

	public NGBlockPinkDiamond(String name) {
		super(name, NGMaterial.PINK_DIAMOND);
		this.setHardness(5.0F);
		}
}
