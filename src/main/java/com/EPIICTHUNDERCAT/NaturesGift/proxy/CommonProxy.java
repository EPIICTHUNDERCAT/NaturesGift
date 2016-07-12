package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.Mobs.NGMobDrops;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGRecipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);

	}

	private void register(FMLPreInitializationEvent preEvent) {
		NGItems.register(preEvent);
		MinecraftForge.addGrassSeed(new ItemStack(NGItems.GRASS_CLIPPINGS), 10);
		NGRecipes.register(preEvent);
		MinecraftForge.EVENT_BUS.register(new NGMobDrops());
		// TODO Auto-generated method stub

	}

	public void registerRenders(FMLInitializationEvent event) {
		// TODO Auto-generated method stub

	}

}