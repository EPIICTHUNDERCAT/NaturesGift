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
		// Shaped Recipe// - Nature Stick
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_STICK),
				new Object[] { "BRY", "WSC", "GOP", 'B', "dyeBlue", 'R', "dyeRed", 'Y', "dyeYellow", 'W', "dyeWhite",
						'S', "stickWood", 'C', "dyeCyan", 'G', "dyeGreen", 'O', "dyeOrange", 'P', "dyePurple" }));
		// Shaped Recipe// - Magical Nature Stick
		GameRegistry.addRecipe(new ItemStack(NGItems.MAGICAL_NATURE_STICK), "bbb", "gng", "bbb", 'b',
				new ItemStack(Blocks.field_189880_di), 'g', new ItemStack(NGItems.GRASS_CLIPPINGS), 'n',
				new ItemStack(NGItems.NATURE_STICK));
		// Shaped Recipe// -Nature Infested Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFESTED_SWORD),
				new Object[] { "CCG", "SDC", "NSC", 'C', "natureChips", 'G', "grassClippings", 'S', "essenceGoo", 'D',
						new ItemStack(Items.DIAMOND_SWORD), 'N', "natureStick" }));
		// Shaped Recipe// - Motor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.MOTOR),
				new Object[] { "RBR", "IRI", "III", 'I', "ingotIron", 'R', "wireRedstone", 'B', "miniMotorBlade" }));
		// Shaped Recipe// - Nature Chips
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_CHIPS),
				new Object[] { "GNG", "NSN", "GNG", 'G', "grassClipings", 'N', "essenceNature", 'S', "smallStones" }));
		// Shaped Recipe// - Clippers
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.CLIPPERS),
				new Object[] { "I I", " S ", "S S", 'I', "ingotIron", 'S', "stickWood" }));
		// Shapeless Recipe// - Redstone Wire
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.REDSTONE_WIRE), new ItemStack(Items.REDSTONE),
				new ItemStack(NGItems.CLIPPERS, 1, OreDictionary.WILDCARD_VALUE));
		// Shaped Recipe// - Hammer
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.HAMMER),
				new Object[] { "GIG", "III", " S ", 'S', "stickWood", 'I', "ingotIron", 'G', "ingotGold" }));
		// Shaped Recipe// -

		// Shaped Recipe// - Stones
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.STONES, 9),
				new ItemStack(NGItems.HAMMER, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.COBBLESTONE));
		// Shaped Recipe// - Nature Infused Star
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.NATURE_INFUSED_STAR),
				new Object[] { "NGN", "GSG", "NGN", 'N', "natureChips", 'G', "essenceGoo", 'S', "netherStar" }));
		// Shaped Recipe// - Bartz Wand

		// Shaped Recipe// - Bartz Dagger

		// Shaped Recipe// - Pink Diamond
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.PINK_DIAMOND),
				new Object[] { " S ", "PDP", " S ", 'S', "gemSky", 'D', "gemDiamond", 'P', "dyePink" }));
		// Shaped Recipe// - Empty Mossy Shield
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.EMPTY_MOSSY_SHIELD), new Object [] {"MMM", "M M", " M ", 'M', new ItemStack(Blocks.MOSSY_COBBLESTONE) }));
		// Shaped Recipe// - Pink Diamond Mossy Shield
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.PINK_DIAMOND_MOSSY_SHIELD),
				new ItemStack(NGItems.EMPTY_MOSSY_SHIELD), new ItemStack(NGItems.PINK_DIAMOND));
		// Shaped Recipe// - Iron Blade
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.IRON_BLADE, 2),
				new ItemStack(NGItems.HAMMER, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_INGOT));
		// Shaped Recipe// - Seq's Scepter
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.SEQS_SCEPTER),
				new Object[] { "PMP", "GSG", "PNP", 'M', "motorMotor", 'G', "essenceGOO", 'S', "infusedNatureStar", 'N',
						"natureStick", 'P', "gemPinkDiamond" }));
		// Shaped Recipe// - Goo Essence
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NGItems.GOO_ESSENCE, 8),
				new Object[] { "SSS", "SLS", "SSS", 'S', "slimeball", 'L', "lifeCore" }));
		// Shapeless Recipe// - Grass Dog
		GameRegistry.addShapelessRecipe(new ItemStack(NGItems.GRASS_DOG), new ItemStack(Items.COOKED_PORKCHOP),
				new ItemStack(Items.STICK), new ItemStack(NGItems.GRASS_CLIPPINGS));
		// Shaped Recipe// - Cobblestone
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE),
				new Object[] { "SSS", "SSS", "SSS", 'S', "smallStones" }));
		// Shaped Recipe// - MossyCobbleStone
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE),
				new Object[] { "CCC", "CMC", "CCC", 'C', new ItemStack(Blocks.COBBLESTONE), 'M', "mossMoss" }));

		OreDictionary.registerOre("grassClippings", new ItemStack(NGItems.GRASS_CLIPPINGS));
		OreDictionary.registerOre("essenceGoo", new ItemStack(NGItems.GOO_ESSENCE));
		OreDictionary.registerOre("natureChips", new ItemStack(NGItems.NATURE_CHIPS));
		OreDictionary.registerOre("natureStick", new ItemStack(NGItems.NATURE_STICK));
		OreDictionary.registerOre("lifeCore", new ItemStack(NGItems.LIFE_CORE));
		OreDictionary.registerOre("motorMotor", new ItemStack(NGItems.MOTOR));
		OreDictionary.registerOre("infusedNatureStar", new ItemStack(NGItems.NATURE_INFUSED_STAR));
		OreDictionary.registerOre("wireRedstone", new ItemStack(NGItems.REDSTONE_WIRE));
		OreDictionary.registerOre("smallStones", new ItemStack(NGItems.STONES));
		OreDictionary.registerOre("gemSky", new ItemStack(NGItems.SKY_GEM));
		OreDictionary.registerOre("ingotBartz", new ItemStack(NGItems.BARTZ_INGOT));
		OreDictionary.registerOre("essenceBartz", new ItemStack(NGItems.BARTZ_ESSENCE));
		OreDictionary.registerOre("essenceNature", new ItemStack(NGItems.NATURE_ESSENCE));
		OreDictionary.registerOre("essenceSky", new ItemStack(NGItems.SKY_ESSENCE));
		OreDictionary.registerOre("mossMoss", new ItemStack(NGItems.MOSS));
		OreDictionary.registerOre("gemPinkDiamond", new ItemStack(NGItems.PINK_DIAMOND));

		NGMobDrops.addMobDrop(new ItemStack(NGItems.BARTZ_ESSENCE), 15, 1, 1);
		NGMobDrops.addMobDrop(new ItemStack(NGItems.LIFE_CORE), 10, 1, 1);
		NGMobDrops.addMobDrop(new ItemStack(NGItems.SKY_ESSENCE), 5, 1, 1);
		NGTreeDrops.addTreeDrop(new ItemStack(NGItems.HEAVY_BRANCH), 25, 1, 1);
		NGTreeDrops.addTreeDrop(new ItemStack(NGItems.MOSS), 30, 1, 1);
		NGTreeDrops.addTreeDrop(new ItemStack(NGItems.NATURE_ESSENCE), 10, 1, 1);
	}

}
