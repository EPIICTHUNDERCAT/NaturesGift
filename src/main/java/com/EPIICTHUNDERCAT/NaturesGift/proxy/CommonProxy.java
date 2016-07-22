package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;
import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.MiscDrops.NGTreeDrops;
import com.EPIICTHUNDERCAT.NaturesGift.Mobs.NGMobDrops;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGRecipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);
	
		AchievementPage.registerAchievementPage(NGAchievement.NGAchievePage);
}
	

	private void register(FMLPreInitializationEvent preEvent) {
		NGItems.register(preEvent);
		MinecraftForge.addGrassSeed(new ItemStack(NGItems.GRASS_CLIPPINGS), 10);
		MinecraftForge.addGrassSeed(new ItemStack(NGItems.NATURE_ESSENCE), 10);
		NGRecipes.register(preEvent);
		NGBlocks.register(preEvent);
		MinecraftForge.EVENT_BUS.register(new NGMobDrops());
		MinecraftForge.EVENT_BUS.register(new NaturesGift());
		MinecraftForge.EVENT_BUS.register(new NGTreeDrops());
		MinecraftForge.EVENT_BUS.register(new ItemStack(NGItems.NATURE_INFESTED_AXE));
	
		
		

	}

	public void registerRenders(FMLInitializationEvent event) {
		// TODO Auto-generated method stub

	}

	public void VersionCheck(PlayerTickEvent event) {
		// TODO Auto-generated method stub

	}

}