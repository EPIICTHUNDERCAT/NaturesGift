package com.EPIICTHUNDERCAT.NaturesGift.init;

import com.EPIICTHUNDERCAT.NaturesGift.MiscDrops.NGTreeDrops;
import com.EPIICTHUNDERCAT.NaturesGift.Mobs.NGMobDrops;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class NGRecipes {

	public static void register(FMLPreInitializationEvent preEvent) {
		// X Shaped Recipe// - Nature Stick
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_STICK),
				new Object[] { "BRY", "WSC", "GOP", 'B', "dyeBlue", 'R', "dyeRed", 'Y', "dyeYellow", 'W', "dyeWhite",
						'S', "stickWood", 'C', "dyeCyan", 'G', "dyeGreen", 'O', "dyeOrange", 'P', "dyePurple" }));
		// X Shaped Recipe// - Magical Nature Stick
		GameRegistry.addRecipe(new ItemStack(NGItems.MAGICAL_NATURE_STICK), "bbb", "gng", "bbb", 'b',
				new ItemStack(Blocks.field_189880_di), 'g', new ItemStack(NGItems.GRASS_CLIPPINGS), 'n',
				new ItemStack(NGItems.NATURE_STICK));
		// X Shaped Recipe// -Nature Infested Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_SWORD),
				new Object[] { "CCG", "SDC", "NSC", 'C', "natureChips", 'G', "grassClippings", 'S', "essenceGoo", 'D',
						new ItemStack(Items.DIAMOND_SWORD), 'N', "natureStick" }));
		// X Shaped Recipe// - Motor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.MOTOR),
				new Object[] { "RBR", "IRI", "III", 'I', "ingotIron", 'R', "wireRedstone", 'B', "miniMotorBlade" }));
		// X Shaped Recipe// - Nature Chips
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_CHIPS),
				new Object[] { "GNG", "NSN", "GNG", 'G', "grassClippings", 'N', "essenceNature", 'S', "smallStones" }));
		// X Shaped Recipe// - Clippers
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.CLIPPERS),
				new Object[] { "I I", " S ", "S S", 'I', "ingotIron", 'S', "stickWood" }));
		// X Shapeless Recipe// - Redstone Wire
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.REDSTONE_WIRE), new ItemStack(Items.REDSTONE),
				new ItemStack(NGItems.CLIPPERS, 1, OreDictionary.WILDCARD_VALUE));
		// X Shaped Recipe// - Hammer
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.HAMMER),
				new Object[] { "GIG", "III", " S ", 'S', "woodBranch", 'I', "ingotIron", 'G', "ingotBartz" }));
		// X Shaped Recipe// - MIni Motor Blade
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.MINI_MOTOR_BLADE),
				new Object[] { " B ", "BRB", " B ", 'B', "ironBlade", 'R', "wireRedstone" }));
		// X Shaped Recipe// - Stones
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.STONES, 9),
				new ItemStack(NGItems.HAMMER, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.COBBLESTONE));
		// X Shaped Recipe// - Nature Infused Star
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFUSED_STAR),
				new Object[] { "NGN", "GSG", "NGN", 'N', "natureChips", 'G', "essenceGoo", 'S', "netherStar" }));
		// X Shaped Recipe// - Bartz Wand
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.BARTZ_WAND),
				new Object[] { " EB", "EBE", "HE ", 'E', "essenceBartz", 'B', "ingotBartz", 'H', "woodBranch" }));
		// X Shaped Recipe// - Bartz Ingot
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.BARTZ_INGOT),
				new Object[] { "BBB", "BGB", "BBB", 'B', "essenceBartz", 'G', "ingotGold" }));
		// X Shaped Recipe// - Bartz Dagger
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.BARTZ_DAGGER), new Object[] { "IBI", "MBB",
				"HG ", 'I', "ingotIron", 'B', "ingotBartz", 'M', "mossMoss", 'H', "woodBranch", 'G', "essenceGoo" }));
		// X Shaped Recipe// - Pink Diamond
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.PINK_DIAMOND),
				new Object[] { " S ", "PDP", " S ", 'S', "gemSky", 'D', "gemDiamond", 'P', "dyePink" }));
		// X Shaped Recipe// - Empty Mossy Shield
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.EMPTY_MOSSY_SHIELD),
				new Object[] { "MMM", "M M", " M ", 'M', new ItemStack(Blocks.MOSSY_COBBLESTONE) }));
		// X Shaped Recipe// - Pink Diamond Mossy Shield
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.PINK_DIAMOND_MOSSY_SHIELD),
				new ItemStack(NGItems.EMPTY_MOSSY_SHIELD), new ItemStack(NGItems.PINK_DIAMOND));
		// X Shaped Recipe// - Iron Blade
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.IRON_BLADE, 2),
				new ItemStack(NGItems.HAMMER, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_INGOT));
		// X Shaped Recipe// - Seq's Scepter
		GameRegistry.addShapedRecipe(new ItemStack(NGItems.SEQS_SCEPTER), "PMP", "GSG", "PNP", 'P',
				new ItemStack(NGItems.PINK_DIAMOND), 'M', new ItemStack(NGItems.MOTOR), 'G',
				new ItemStack(NGItems.GOO_ESSENCE), 'N', new ItemStack(NGItems.NATURE_STICK), 'S',
				new ItemStack(NGItems.NATURE_INFUSED_STAR));
		// X Shaped Recipe// - Goo Essence
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.GOO_ESSENCE, 8),
				new Object[] { "SSS", "SLS", "SSS", 'S', "slimeball", 'L', "lifeCore" }));
		// X Shapeless Recipe// - Grass Dog
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.GRASS_DOG), new ItemStack(Items.COOKED_PORKCHOP),
				new ItemStack(Items.STICK), new ItemStack(NGItems.GRASS_CLIPPINGS));
		// X Shaped Recipe// - Cobblestone
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE),
				new Object[] { "SSS", "SSS", "SSS", 'S', "smallStones" }));
		// X Shaped Recipe// - MossyCobbleStone
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE),
				new Object[] { "CCC", "CMC", "CCC", 'C', new ItemStack(Blocks.COBBLESTONE), 'M', "mossMoss" }));
		// X Shaped Recipe// - Sky Gem
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.SKY_GEM),
				new Object[] { "NSN", "SDS", "NSN", 'S', "essenceSky", 'N', "essenceNature", 'D', "gemDiamond" }));
		// Shaped Recipe// - Nature Material
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_MATERIAL), new Object [] { "CMC", "EWE", "CMC", 'C', "natureChips", 'M', "mossMoss", 'E', "essenceNature", 'W', new ItemStack(Blocks.WOOL) }));
		// Shaped Recipe// - Strong Nature Material
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.STRONG_NATURE_MATERIAL), new Object [] { "CNT", "NGN", "SNC", 'T', "treeSapling", 'C', "blockCactus", 'S', "sugarcane", 'N', "natureMaterial", 'G', "gemSky" }));
				
	
		
		
		
		
		//Added Vanilla Recipes//
		
		// Shapeless Recipe// - Seeds
		GameRegistry.addShapelessRecipe(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(NGItems.GRASS_CLIPPINGS));
		// Shaped Recipe// - Seeds2
		GameRegistry.addShapedRecipe(new ItemStack(Items.WHEAT_SEEDS, 12), "NNN", "   ", "   ", 'N', new ItemStack(NGItems.NATURE_ESSENCE));
		// Shapeless Recipe// - Sticks		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 4), new ItemStack(NGItems.HEAVY_BRANCH));
		// Shaped Recipe// - Feather
		GameRegistry.addShapedRecipe(new ItemStack(Items.FEATHER, 6), "S  ", " S ", "  S", 'S', new ItemStack(NGItems.SKY_ESSENCE));
		
		
		
		
		//ARMORS//
		
		// Shaped Recipe// - Nature Infested Helmet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_HELMET), new Object [] { "NNN", "NSN", "   ", 'N', "strongNatureMaterial", 'S', "essenceSky" }));
		// Shaped Recipe// - Nature Infested ChestPlate
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_CHESTPLATE), new Object [] { "NSN", "NNN", "NNN", 'N', "strongNatureMaterial", 'S', "essenceSky" }));
		// Shaped Recipe// - Nature Infested Leggings
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_LEGGINGS), new Object [] { "NNN", "NSN", "N N", 'N', "strongNatureMaterial", 'S', "essenceSky" }));
		// Shaped Recipe// - Nature Infested Boots
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_BOOTS), new Object [] { "NSN", "N N", "   ", 'N', "strongNatureMaterial", 'S', "essenceSky" }));
		// Shaped Recipe// - Nature Infused Helmet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFUSED_HELMET), new Object [] { "NNN", "N N", "   ", 'N', "natureMaterial" }));
		// Shaped Recipe// - Nature Infused Chestplate
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFUSED_CHESTPLATE), new Object [] { "N N", "NNN", "NNN", 'N', "natureMaterial" }));
		// Shaped Recipe// - Nature Infused Leggings
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFUSED_LEGGINGS), new Object [] { "NNN", "N N", "N N", 'N', "natureMaterial" }));
		// Shaped Recipe// - Nature Infused Boots
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFUSED_BOOTS), new Object [] { "N N", "N N", "   ", 'N', "natureMaterial" }));
		// Shaped Recipe// - Pink Diamond Helmet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.PINK_DIAMOND_HELMET), new Object [] { "PPP", "P P", "   ", 'P', "gemPinkDiamond", }));
		// Shaped Recipe// - Pink Diamond ChestPlate
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.PINK_DIAMOND_CHESTPLATE), new Object [] { "P P", "PPP", "PPP", 'P', "gemPinkDiamond", }));
		// Shaped Recipe// - Pink Diamond Leggings
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.PINK_DIAMOND_LEGGINGS), new Object [] { "PPP", "P P", "P P", 'P', "gemPinkDiamond", }));
		// Shaped Recipe// - Pink Diamond Boots
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.PINK_DIAMOND_BOOTS), new Object [] { "P P", "P P", "   ", 'P', "gemPinkDiamond", }));
		
		//TOOLS//
		//Shaped Recipe// - Nature Infested Axe(TEMPORARY)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_AXE), new Object [] { "P P", "P P", "   ", 'P', "strongNatureMaterial", }));
		
		
		
		
		
		
		OreDictionary.registerOre("grassClippings", new ItemStack(NGItems.GRASS_CLIPPINGS));
		OreDictionary.registerOre("essenceGoo", new ItemStack(NGItems.GOO_ESSENCE));
		OreDictionary.registerOre("natureChips", new ItemStack(NGItems.NATURE_CHIPS));
		OreDictionary.registerOre("natureStick", new ItemStack(NGItems.NATURE_STICK));
		OreDictionary.registerOre("lifeCore", new ItemStack(NGItems.LIFE_CORE));
		OreDictionary.registerOre("motorMotor", new ItemStack(NGItems.MOTOR));
		OreDictionary.registerOre("infusedNatureStar", new ItemStack(NGItems.NATURE_INFUSED_STAR));
		OreDictionary.registerOre("wireRedstone", new ItemStack(NGItems.REDSTONE_WIRE));
		OreDictionary.registerOre("miniMotorBlade", new ItemStack(NGItems.MINI_MOTOR_BLADE));
		OreDictionary.registerOre("smallStones", new ItemStack(NGItems.STONES));
		OreDictionary.registerOre("gemSky", new ItemStack(NGItems.SKY_GEM));
		OreDictionary.registerOre("ingotBartz", new ItemStack(NGItems.BARTZ_INGOT));
		OreDictionary.registerOre("essenceBartz", new ItemStack(NGItems.BARTZ_ESSENCE));
		OreDictionary.registerOre("essenceNature", new ItemStack(NGItems.NATURE_ESSENCE));
		OreDictionary.registerOre("essenceSky", new ItemStack(NGItems.SKY_ESSENCE));
		OreDictionary.registerOre("mossMoss", new ItemStack(NGItems.MOSS));
		OreDictionary.registerOre("ironBlade", new ItemStack(NGItems.IRON_BLADE));
		OreDictionary.registerOre("gemPinkDiamond", new ItemStack(NGItems.PINK_DIAMOND));
		OreDictionary.registerOre("woodBranch", new ItemStack(NGItems.HEAVY_BRANCH));
		OreDictionary.registerOre("strongNatureMaterial", new ItemStack(NGItems.STRONG_NATURE_MATERIAL));
		OreDictionary.registerOre("natureMaterial", new ItemStack(NGItems.NATURE_MATERIAL));

		NGMobDrops.addMobDrop(new ItemStack(NGItems.BARTZ_ESSENCE), 3, 1, 1);
		NGMobDrops.addMobDrop(new ItemStack(NGItems.LIFE_CORE), 3, 1, 1);
		NGMobDrops.addMobDrop(new ItemStack(NGItems.SKY_ESSENCE), 1, 1, 1);
		NGTreeDrops.addTreeDrop(new ItemStack(NGItems.HEAVY_BRANCH), 10, 1, 1);
		NGTreeDrops.addTreeDrop(new ItemStack(NGItems.MOSS), 10, 1, 1);
		NGTreeDrops.addTreeDrop(new ItemStack(NGItems.NATURE_ESSENCE), 10, 1, 1);
	}

}
