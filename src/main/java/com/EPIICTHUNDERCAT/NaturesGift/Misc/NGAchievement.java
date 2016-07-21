package com.EPIICTHUNDERCAT.NaturesGift.Misc;

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
			"ThisIsOdd", "thisisodd", 0, 4,
			new ItemStack(NGItems.NATURE_ESSENCE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement LifeCore = new Achievement(
			"LifeCore", "lifecore", 0, 5,
			new ItemStack(NGItems.LIFE_CORE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement SkyEssence = new Achievement(
			"SkyEssence", "skyessence", 0, 6,
			new ItemStack(NGItems.SKY_ESSENCE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement WhoIsBartz = new Achievement(
			"WhoIsBartz", "whoisbartz", 0, 7,
			new ItemStack(NGItems.BARTZ_ESSENCE, 1),
			AchievementList.OPEN_INVENTORY).registerStat();
	
	public static final Achievement InfestedAxe = new Achievement(
			"InfestedAxe", "infestedaxe", 0, -1,
			new ItemStack(NGItems.BARTZ_ESSENCE, 1),
			AchievementList.DIAMONDS).registerStat();
	
	
	
	
	
	
	
	
	
	
	public static AchievementPage NGAchievePage = new AchievementPage(
			"Natures Gift", YouBrokeGrass, ThisIsOdd);


	}
	
