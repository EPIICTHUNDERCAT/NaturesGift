package com.EPIICTHUNDERCAT.NaturesGift.init;

import java.util.ArrayList;
import java.util.List;

import com.EPIICTHUNDERCAT.NaturesGift.Blocks.NGBlockMaterial;
import com.EPIICTHUNDERCAT.NaturesGift.Blocks.PreciousBlocks.PinkDiamondBlock;

import net.minecraft.block.Block;
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
	
	public static List<Item> items = new ArrayList();

	public static List<Block> blocks = new ArrayList();
	public static Block Pink_Diamond_Block = new PinkDiamondBlock(NGBlockMaterial.PINK_DIAMOND, "pink_diamond_block");
	
	
	
	public static List<Block> blockList(){
		return blocks;		
	}
	
	public static void register(FMLPreInitializationEvent preEvent) {
		for (Block block : blockList()){
			ItemBlock iBlock = new ItemBlock(block);
			if (block.getRegistryName().toString().endsWith("_crop")){
				iBlock.setMaxStackSize(1);
			}
			GameRegistry.register(block);
		    GameRegistry.register(iBlock, block.getRegistryName());
		}
	}
	public static void registerRender(FMLInitializationEvent event){
		for (Block block : blockList()){
		Item item = new Item().getItemFromBlock(block);
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
		}
	}
}