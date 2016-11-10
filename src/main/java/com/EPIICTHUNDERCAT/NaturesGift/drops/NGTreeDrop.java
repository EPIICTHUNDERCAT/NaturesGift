package com.EPIICTHUNDERCAT.NaturesGift.drops;

import net.minecraft.item.ItemStack;

public class NGTreeDrop {
	public NGTreeDrop(ItemStack stack, int chance, int min, int max) {
		stackDrop = stack;
		dropChance = chance;
		minAmount = min;
		maxAmount = max;
	}

	public ItemStack stackDrop;
	public int dropChance;
	public int minAmount;
	public int maxAmount;

	
}
