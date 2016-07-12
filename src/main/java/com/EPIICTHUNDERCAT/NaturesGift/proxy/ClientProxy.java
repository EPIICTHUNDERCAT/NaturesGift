package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
	// TODO Auto-generated method stub
}
}
	

