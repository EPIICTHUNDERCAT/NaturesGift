package com.EPIICTHUNDERCAT.NaturesGift.miscdrops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class NGTreeDrops {
	static List<NGTreeDrop> drops = new ArrayList<NGTreeDrop>();

	@SubscribeEvent
	public void onBlockBreak(BreakEvent event) {
		if(event.getWorld().getBlockState(event.getPos()).getBlock() instanceof BlockLeaves) {
		for (NGTreeDrop drop : drops) {
			Random rand = new Random();
			int x = rand.nextInt(100) + 1;
			if (x <= drop.dropChance) {
				ItemStack stack = drop.stackDrop.copy();
				stack.stackSize = rand.nextInt(drop.maxAmount + 1 - drop.minAmount) + drop.minAmount;
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), 
						event.getPos().getY(), event.getPos().getZ(), stack);
				event.getWorld().spawnEntityInWorld(item);
			}}
		}
	}

	public static void addTreeDrop(ItemStack stack, int chance, int min, int max) {
		NGTreeDrop drop = new NGTreeDrop(stack, chance, min, max);
		drops.add(drop);
	}

}
