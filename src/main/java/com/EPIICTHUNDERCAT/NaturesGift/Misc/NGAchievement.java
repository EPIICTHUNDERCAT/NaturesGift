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
	
	
	
	
	
	
	
	
	
	
	public static AchievementPage NGAchievePage = new AchievementPage(
			"Natures Gift", YouBrokeGrass);


	}
	
