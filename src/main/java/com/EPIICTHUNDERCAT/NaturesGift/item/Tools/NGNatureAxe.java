package com.EPIICTHUNDERCAT.NaturesGift.item.Tools;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class NGNatureAxe extends ItemAxe {

	public NGNatureAxe(String name, ToolMaterial material) {
		super(material, 2.0f, 2.0f);
		setRegistryName(name.toLowerCase());
		setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setCreativeTab(NGCreativeTabs.NGTools);
	}

	private void addToItems(Item item) {

		NGItems.items.add(item);

	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (toRepair.getItem() == NGItems.NATURE_AXE) {
			return repair.getItem() == NGItems.NATURE_MATERIAL;
		}
		return false;
	}
}
