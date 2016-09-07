package com.EPIICTHUNDERCAT.NaturesGift;

import com.EPIICTHUNDERCAT.NaturesGift.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VER)
public class NaturesGift {

	@Instance(value = Reference.ID)
	public static NaturesGift instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	public static Configuration config;

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

	/*
	 * @SubscribeEvent public void playerKilledEntityZombie(LivingDropsEvent
	 * event) { if (event.getEntity() instanceof EntityZombie) { } }
	 */

}
