package com.EPIICTHUNDERCAT.NaturesGift.item.Tools;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class PinkDiamondAxe extends ItemAxe {

	public PinkDiamondAxe(String name, ToolMaterial material) {
		super(material, 7.0f, -2.0f);
		setRegistryName(name.toLowerCase());
		setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setCreativeTab(NGCreativeTabs.NGTools);
	}
	private void addToItems(Item item) {

		NGItems.items.add(item);

	}
}
