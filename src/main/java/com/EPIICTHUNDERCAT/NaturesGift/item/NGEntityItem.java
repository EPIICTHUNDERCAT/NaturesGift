package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.item.Item;

public class NGEntityItem extends Item{
	
	public NGEntityItem(String name) {
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(NGCreativeTabs.NGSpecial);
		addToItems(this);
	}


	private void addToItems(Item item) {
		NGItems.items.add(item);
	}

}