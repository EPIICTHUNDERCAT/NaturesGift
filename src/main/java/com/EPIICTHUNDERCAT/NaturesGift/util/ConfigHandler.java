package com.EPIICTHUNDERCAT.NaturesGift.util;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
	
	public static void config(FMLPreInitializationEvent preEvent) {
		NaturesGift.config = new Configuration(preEvent.getSuggestedConfigurationFile());
		NaturesGift.config.load();
    	boolean updates = NaturesGift.config.getBoolean("Check for updates:", "Updates", true, "Whether to check for an updated Mod.");
    	NaturesGift.getUpdates = updates;
    	NaturesGift.config.save();
		ConfigHandler.sync();
	}
	
	public static void sync() {
		MinecraftForge.EVENT_BUS.register(NaturesGift.instance);
			if (NaturesGift.config.hasChanged()) {
				NaturesGift.config.save();
			}
		}

}
