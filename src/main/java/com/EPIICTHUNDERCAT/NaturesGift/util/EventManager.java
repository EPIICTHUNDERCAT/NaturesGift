package com.EPIICTHUNDERCAT.NaturesGift.util;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventManager {
	
	@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onTextureStitch(TextureStitchEvent event){
        ResourceLocation leafparticle = new ResourceLocation("naturesgift:entity/leafparticle");
        event.getMap().registerSprite(leafparticle);
    }

}
