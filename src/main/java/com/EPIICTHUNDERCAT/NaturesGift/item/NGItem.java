package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class NGItem extends Item {

	public NGItem(String name) {
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(NGCreativeTabs.NGMaterials);
		addToItems(this);
	}

	private void addToItems(Item item) {

		NGItems.items.add(item);

	}
}
