package com.EPIICTHUNDERCAT.NaturesGift.Blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class NGBlockMaterial extends Material{

	public static final NGBlockMaterial PINK_DIAMOND = (new NGBlockMaterial(MapColor.PINK));
	
	 
	 
	public NGBlockMaterial(MapColor color) {
		super(color);
		this.setAdventureModeExempt();	
	}
 
    @Override
    public boolean blocksLight() {
        return false;
    }
	

}
