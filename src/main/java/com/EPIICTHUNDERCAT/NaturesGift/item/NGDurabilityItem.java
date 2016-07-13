package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.item.ItemStack;

public class NGDurabilityItem extends NGItem {

	public NGDurabilityItem(String name, int durability) {
		super(name);
		this.setMaxDamage(durability);
		this.setMaxStackSize(1);
	}

	public ItemStack getContainerItem(ItemStack stack) {

		if (stack.getItem() == NGItems.CLIPPERS || stack.getItem() == NGItems.HAMMER) {
			return new ItemStack(stack.getItem(), stack.stackSize, stack.getItemDamage() + 1);
		}
		return null;
	}

	public boolean hasContainerItem(ItemStack stack) {
		if (stack.getItem() == NGItems.CLIPPERS || stack.getItem() == NGItems.HAMMER) {
			return true;
		}
		return false;
	}
}
