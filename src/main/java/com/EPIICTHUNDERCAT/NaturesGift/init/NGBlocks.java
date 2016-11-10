package com.EPIICTHUNDERCAT.NaturesGift.init;

import java.util.ArrayList;
import java.util.List;

import com.EPIICTHUNDERCAT.NaturesGift.block.blocks.NGBlockPinkDiamond;
import com.EPIICTHUNDERCAT.NaturesGift.block.blocks.NGBlockWandCore;
import com.EPIICTHUNDERCAT.NaturesGift.block.blocks.NGPinkDiamondOre;
import com.EPIICTHUNDERCAT.NaturesGift.block.material.NGMaterial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NGBlocks extends Blocks{
	
	public static List<Block> blocks = new ArrayList();
	
	public static Block NATURE_WAND_CORE = new NGBlockWandCore("NATURE_WAND_CORE", NGMaterial.SKY_GEM);
	public static Block PINK_DIAMOND_BLOCK = new NGBlockPinkDiamond("PINK_DIAMOND_BLOCK", NGMaterial.PINK_DIAMOND);
	public static Block PINK_DIAMOND_ORE = new NGPinkDiamondOre("PINK_DIAMOND_ORE", Material.ROCK);
	
	
	public static List<Block> blockList() {
		return blocks;		
	}
	
	public static void register(FMLPreInitializationEvent preEvent) {
		for (Block block : blockList()){
			ItemBlock iBlock = new ItemBlock(block);
			GameRegistry.register(block);
		    GameRegistry.register(iBlock, block.getRegistryName());
		}
	}
	
	public static void registerRender(FMLInitializationEvent event) {
		for (Block block : blockList()){
		Item item = new Item().getItemFromBlock(block);
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
		}
	}
}