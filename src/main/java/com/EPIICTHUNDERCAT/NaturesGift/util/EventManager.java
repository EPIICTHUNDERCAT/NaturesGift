package com.EPIICTHUNDERCAT.NaturesGift.util;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventManager {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTextureStitch(TextureStitchEvent event) {
		ResourceLocation leafparticle = new ResourceLocation("naturesgift:entity/leafparticle");
		event.getMap().registerSprite(leafparticle);
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
		if (item == NGItems.NATURE_WAND) {
			event.player.addStat(NGAchievement.EndGame, 1);
		}
	}

	@SubscribeEvent
	public void onItemPickup(EntityItemPickupEvent event) {

		if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.GRASS_CLIPPINGS)))) {
			event.getEntityPlayer().addStat(NGAchievement.YouBrokeGrass, 1);
		}

		else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.NATURE_ESSENCE)))) {
			event.getEntityPlayer().addStat(NGAchievement.ThisIsOdd, 1);
		}

		else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.LIFE_CORE)))) {
			event.getEntityPlayer().addStat(NGAchievement.LifeCore, 1);
		}

		else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.SKY_ESSENCE)))) {
			event.getEntityPlayer().addStat(NGAchievement.SkyEssence, 1);
		}

		else if (event.getItem().getEntityItem().isItemEqual((new ItemStack(NGItems.BARTZ_ESSENCE)))) {
			event.getEntityPlayer().addStat(NGAchievement.WhoIsBartz, 1);
		}

	}

}
