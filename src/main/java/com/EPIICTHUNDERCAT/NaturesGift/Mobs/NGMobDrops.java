package com.EPIICTHUNDERCAT.NaturesGift.mobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class NGMobDrops {
	static List<NGMobDrop> drops = new ArrayList<NGMobDrop>();

	// Life Core Drop
	@SubscribeEvent
	public void livingEntityDrops(LivingDropsEvent event) {
		for (NGMobDrop drop : drops) {
			Random rand = new Random();
			int x = rand.nextInt(100) + 1;
			if (x <= drop.dropChance) {
				ItemStack stack = drop.stackDrop.copy();
				stack.stackSize = rand.nextInt(drop.maxAmount+1-drop.minAmount)+drop.minAmount;
				EntityItem entityItem = event.getEntityLiving().entityDropItem(stack, 0);
			}
		}
	}

	public static void addMobDrop(ItemStack stack, int chance, int min, int max) {
		NGMobDrop drop = new NGMobDrop(stack, chance, min, max);
		drops.add(drop);
	}
}