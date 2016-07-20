package com.EPIICTHUNDERCAT.NaturesGift.init;

import java.util.ArrayList;
import java.util.List;

import com.EPIICTHUNDERCAT.NaturesGift.item.BonemealNGItem;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGDurabilityItem;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItem;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItemArmor;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItemFood;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItemSword;
import com.EPIICTHUNDERCAT.NaturesGift.item.Tools.NGNatureAxe;
import com.EPIICTHUNDERCAT.NaturesGift.item.Tools.NGNatureHoe;
import com.EPIICTHUNDERCAT.NaturesGift.item.Tools.NGNaturePickaxe;
import com.EPIICTHUNDERCAT.NaturesGift.item.Tools.NGNatureShovel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NGItems extends Items {
	// Items/Materials //
	public static List<Item> items = new ArrayList();
	public static Item NATURE_STICK = new NGItem("NATURE_STICK");
	public static Item GRASS_CLIPPINGS = new NGItem("GRASS_CLIPPINGS");
	public static Item GRASS_DOG = new NGItemFood("GRASS_DOG", 10, 0.6f, false);
	public static Item MAGICAL_NATURE_STICK = new BonemealNGItem("MAGICAL_NATURE_STICK");
	public static Item NATURE_INFUSED_STAR = new NGItem("NATURE_INFUSED_STAR");
	public static Item GOO_ESSENCE = new NGItem("GOO_ESSENCE");
	public static Item NATURE_CHIPS = new NGItem("NATURE_CHIPS");
	public static Item LIFE_CORE = new NGItem("LIFE_CORE");
	public static Item MOTOR = new NGItem("MOTOR");
	public static Item STONES = new NGItem("STONES");
	public static Item CLIPPERS = new NGDurabilityItem("CLIPPERS", 200);
	public static Item REDSTONE_WIRE = new NGItem("REDSTONE_WIRE");
	public static Item PINK_DIAMOND = new NGItem("PINK_DIAMOND");
	public static Item NATURE_ESSENCE = new NGItem("NATURE_ESSENCE");
	public static Item SKY_GEM = new NGItem("SKY_GEM");
	public static Item BARTZ_ESSENCE = new NGItem("BARTZ_ESSENCE");
	public static Item HAMMER = new NGDurabilityItem("HAMMER", 200);
	public static Item BARTZ_INGOT = new NGItem("BARTZ_INGOT");
	public static Item MINI_MOTOR_BLADE = new NGItem("MINI_MOTOR_BLADE");
	public static Item HEAVY_BRANCH = new NGItem("HEAVY_BRANCH");
	public static Item SKY_ESSENCE = new NGItem("SKY_ESSENCE");
	public static Item IRON_BLADE = new NGItem("IRON_BLADE");
	public static Item MOSS = new NGItem("MOSS");
	public static Item NATURE_MATERIAL = new NGItem("NATURE_MATERIAL");
	public static Item STRONG_NATURE_MATERIAL = new NGItem("STRONG_NATURE_MATERIAL");
	
	
	//Shields//
	public static Item PINK_DIAMOND_MOSSY_SHIELD = new NGShields("PINK_DIAMOND_MOSSY_SHIELD");
	public static Item EMPTY_MOSSY_SHIELD = new NGShields("EMPTY_MOSSY_SHIELD");
	
	
	//Weapons//
	public static Item BARTZ_DAGGER = new NGItemSword("BARTZ_DAGGER", NGToolMaterials.SKY_GEM);
	public static Item BARTZ_WAND = new NGItemSword("BARTZ_WAND", NGToolMaterials.BARTZ_ESSENCE);
	public static Item NATURE_INFESTED_SWORD = new NGItemSword("NATURE_INFESTED_SWORD", NGToolMaterials.NATURE_CHIPS);
	public static Item SEQS_SCEPTER = new NGItemSword("SEQS_SCEPTER", NGToolMaterials.GOO_ESSENCE);
	
	
	//Armors//
	public static Item PINK_DIAMOND_CHESTPLATE = new NGItemArmor("PINK_DIAMOND_CHESTPLATE", NGItemArmor.PINK_DIAMOND, 7,
			EntityEquipmentSlot.CHEST);
	public static Item PINK_DIAMOND_HELMET = new NGItemArmor("PINK_DIAMOND_HELMET", NGItemArmor.PINK_DIAMOND, 7,
			EntityEquipmentSlot.HEAD);
	public static Item PINK_DIAMOND_LEGGINGS = new NGItemArmor("PINK_DIAMOND_LEGGINGS", NGItemArmor.PINK_DIAMOND, 7,
			EntityEquipmentSlot.LEGS);
	public static Item PINK_DIAMOND_BOOTS = new NGItemArmor("PINK_DIAMOND_BOOTS", NGItemArmor.PINK_DIAMOND, 7,
			EntityEquipmentSlot.FEET);
	public static Item NATURE_INFESTED_CHESTPLATE = new NGItemArmor("NATURE_INFESTED_CHESTPLATE", NGItemArmor.STRONG_NATURE_MATERIAL, 7,
			EntityEquipmentSlot.CHEST);
	public static Item NATURE_INFESTED_HELMET = new NGItemArmor("NATURE_INFESTED_HELMET", NGItemArmor.STRONG_NATURE_MATERIAL, 7,
			EntityEquipmentSlot.HEAD);
	public static Item NATURE_INFESTED_LEGGINGS = new NGItemArmor("NATURE_INFESTED_LEGGINGS", NGItemArmor.STRONG_NATURE_MATERIAL, 7,
			EntityEquipmentSlot.LEGS);
	public static Item NATURE_INFESTED_BOOTS = new NGItemArmor("NATURE_INFESTED_BOOTS", NGItemArmor.STRONG_NATURE_MATERIAL, 7,
			EntityEquipmentSlot.FEET);
	public static Item NATURE_INFUSED_CHESTPLATE = new NGItemArmor("NATURE_INFUSED_CHESTPLATE", NGItemArmor.NATURE_MATERIAL, 7,
			EntityEquipmentSlot.CHEST);
	public static Item NATURE_INFUSED_HELMET = new NGItemArmor("NATURE_INFUSED_HELMET", NGItemArmor.NATURE_MATERIAL, 7,
			EntityEquipmentSlot.HEAD);
	public static Item NATURE_INFUSED_LEGGINGS = new NGItemArmor("NATURE_INFUSED_LEGGINGS", NGItemArmor.NATURE_MATERIAL, 7,
			EntityEquipmentSlot.LEGS);
	public static Item NATURE_INFUSED_BOOTS = new NGItemArmor("NATURE_INFUSED_BOOTS", NGItemArmor.NATURE_MATERIAL, 7,
			EntityEquipmentSlot.FEET);
	
	//Tools//
	public static Item NATURE_HOE = new NGNatureHoe("NATURE_HOE", NGToolMaterials.NATURE_MATERIAL);
	public static Item NATURE_AXE = new NGNatureAxe("NATURE_AXE", NGToolMaterials.NATURE_MATERIAL);
	public static Item NATURE_PICKAXE = new NGNaturePickaxe("NATURE_PICKAXE", NGToolMaterials.NATURE_MATERIAL);
	public static Item NATURE_SHOVEL = new NGNatureShovel("NATURE_SHOVEL", NGToolMaterials.NATURE_MATERIAL);
	public static Item NATURE_INFESTED_HOE = new NGNatureHoe("NATURE_INFESTED_HOE", NGToolMaterials.STRONG_NATURE_MATERIAL);
	public static Item NATURE_INFESTED_AXE = new NGNatureAxe("NATURE_INFESTED_AXE", NGToolMaterials.STRONG_NATURE_MATERIAL);
	public static Item NATURE_INFESTED_PICKAXE = new NGNaturePickaxe("NATURE_INFESTED_PICKAXE", NGToolMaterials.STRONG_NATURE_MATERIAL);
	public static Item NATURE_INFESTED_SHOVEL = new NGNatureShovel("NATURE_INFESTED_SHOVEL", NGToolMaterials.STRONG_NATURE_MATERIAL);
	//Parts//
	public static Item NATURE_HOE_HEAD = new NGItem("NATURE_HOE_HEAD");
	public static Item NATURE_AXE_HEAD = new NGItem("NATURE_AXE_HEAD");
	public static Item NATURE_PICKAXE_HEAD = new NGItem("NATURE_PICKAXE_HEAD");
	public static Item NATURE_SHOVEL_HEAD = new NGItem("NATURE_SHOVEL_HEAD");
	

	private static List<Item> getItems() {
		return items;
	}

	public static void register(FMLPreInitializationEvent preEvent) {
		for (Item item : getItems()) {
			GameRegistry.register(item);
		}
	}

	public static void registerRender(FMLInitializationEvent event) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : getItems()) {
			renderItem.getItemModelMesher().register(item, 0,
					new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}

}