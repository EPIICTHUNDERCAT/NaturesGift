package com.EPIICTHUNDERCAT.NaturesGift.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class NGMaterial extends Material{

	
	public static final NGMaterial PINK_DIAMOND = (new NGMaterial(MapColor.PINK));
	public static final NGMaterial SKY_GEM = (new NGMaterial(MapColor.QUARTZ));
	
	public NGMaterial(MapColor color) {
		super(color);
	}

}
