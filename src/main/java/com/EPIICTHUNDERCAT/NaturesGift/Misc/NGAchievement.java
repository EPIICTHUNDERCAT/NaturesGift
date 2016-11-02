package com.EPIICTHUNDERCAT.NaturesGift.misc;

import com.EPIICTHUNDERCAT.NaturesGift.block.NGBlock;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class NGAchievement{

	
	public static final Achievement YouBrokeGrass = new Achievement(
			"YouBrokeGrass!", "youbrokegrass!", 0, 1,
			new ItemStack(NGItems.GRASS_CLIPPINGS, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement ThisIsOdd = new Achievement(
			"ThisIsOdd", "thisisodd", 0, 2,
			new ItemStack(NGItems.NATURE_ESSENCE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement LifeCore = new Achievement(
			"LifeCore", "lifecore", 2, 0,
			new ItemStack(NGItems.LIFE_CORE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement SkyEssence = new Achievement(
			"SkyEssence", "skyessence", 2, 1,
			new ItemStack(NGItems.SKY_ESSENCE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement WhoIsBartz = new Achievement(
			"WhoIsBartz", "whoisbartz", 2, 2,
			new ItemStack(NGItems.BARTZ_ESSENCE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement InfestedAxe = new Achievement(
			"InfestedAxe", "infestedaxe", 4, 1,
			new ItemStack(NGItems.NATURE_INFESTED_AXE),
			AchievementList.DIAMONDS).registerStat();
	
	public static final Achievement SOPINK = new Achievement(
			"SOPINK", "sopink", 3, 1,
			new ItemStack(NGBlocks.PINK_DIAMOND_BLOCK, 1),
			AchievementList.DIAMONDS).registerStat();
	
	public static final Achievement EarlyGame = new Achievement(
			"EarlyGame", "earlygame", 4, 2,
			new ItemStack(NGItems.NATURE_PICKAXE),
			AchievementList.BUILD_PICKAXE).registerStat();
	
	
	
	
	
	
	
	
	
	
	public static AchievementPage NGAchievePage = new AchievementPage(

			"Natures Gift", YouBrokeGrass, ThisIsOdd, WhoIsBartz, SkyEssence, InfestedAxe, SOPINK, LifeCore, EarlyGame);


	}
	
