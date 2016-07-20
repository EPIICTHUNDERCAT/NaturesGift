package com.EPIICTHUNDERCAT.NaturesGift.item.Tools;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGCreativeTabs;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class NatureInfestedShovel extends ItemSpade{

	public NatureInfestedShovel(String name, ToolMaterial material) {
		super(material);
		setRegistryName(name.toLowerCase());
		setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setCreativeTab(NGCreativeTabs.NGCombat);
		
	}
	private void addToItems(Item item) {

		NGItems.items.add(item);

	}
}
