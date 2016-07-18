package com.EPIICTHUNDERCAT.NaturesGift.init;

import java.util.ArrayList;
import java.util.List;

import com.EPIICTHUNDERCAT.NaturesGift.Blocks.NGBlockMaterial;
import com.EPIICTHUNDERCAT.NaturesGift.Blocks.PreciousBlocks.PinkDiamond;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class NGBlocks extends Blocks{
	
	public static List<Item> items = new ArrayList();

	public static List<Block> blocks = new ArrayList();
	public static Block Pink_Diamond = new PinkDiamond(NGBlockMaterial.PINK_DIAMOND, "pink_diamond");
	
}