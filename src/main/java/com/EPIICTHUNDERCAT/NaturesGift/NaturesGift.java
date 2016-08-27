package com.EPIICTHUNDERCAT.NaturesGift;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.proxy.CommonProxy;
import com.EPIICTHUNDERCAT.NaturesGift.util.VersionCheck;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VER)
public class NaturesGift {

	@Instance(value = Reference.ID)
	public static NaturesGift instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	private static CommonProxy proxy;
	public static Configuration config;
	public static VersionCheck versionChecker;
	public static boolean getUpdates;
	public static String latest;
	public static boolean isLatest;
	public static boolean warned;

	@EventHandler
	private void preInit(FMLPreInitializationEvent preEvent) {
		proxy.preInit(preEvent);
	}

	@EventHandler
	private void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onPlayerTick(PlayerTickEvent event) {
		proxy.VersionCheck(event);
	}

	@SubscribeEvent
	public void onItemPickup(EntityItemPickupEvent event) {

		if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.GRASS_CLIPPINGS)))) {
			//FMLLog.info(Reference.ID + "Event Handler called");
			event.getEntityPlayer().addStat(NGAchievement.YouBrokeGrass, 1); }
			
			else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.NATURE_ESSENCE)))) {
				event.getEntityPlayer().addStat(NGAchievement.ThisIsOdd, 1);}
		
				else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.LIFE_CORE)))) {
					event.getEntityPlayer().addStat(NGAchievement.LifeCore, 1);}
		
					else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.SKY_ESSENCE)))) {
						event.getEntityPlayer().addStat(NGAchievement.SkyEssence, 1);}
		
						else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.BARTZ_ESSENCE)))) {
							event.getEntityPlayer().addStat(NGAchievement.WhoIsBartz, 1);}
		
							

		}
	
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) {
		
		Item item = event.crafting.getItem();
		if (item == NGItems.NATURE_INFESTED_AXE) {
	
			event.player.addStat(NGAchievement.InfestedAxe, 1);
		}
		if (item == NGItems.NATURE_PICKAXE) {
			
			event.player.addStat(NGAchievement.EarlyGame, 1);
		}
	}
	
		/*
		 * @SubscribeEvent public void playerKilledEntityZombie(LivingDropsEvent
		 * event) { if (event.getEntity() instanceof EntityZombie) { } }
		 */

	}

