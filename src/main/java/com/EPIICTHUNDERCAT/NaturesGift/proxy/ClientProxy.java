package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.util.VersionCheck;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ClientProxy extends CommonProxy{


	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
	
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
	
	}
	
	@Override
	public void registerRenders(FMLInitializationEvent event) {
	NGItems.registerRender(event);
	NGBlocks.registerRender(event);
	}
	
	@Override
	public void VersionCheck(PlayerTickEvent event) {
		VersionCheck.getWarning(event);
		
	}
}
	

