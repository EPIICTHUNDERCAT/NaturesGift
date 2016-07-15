package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGCreativeTabs;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class NGItemArmor extends ItemArmor {

	public static ArmorMaterial PINK_DIAMOND = EnumHelper.addArmorMaterial("PINK_DIAMOND", "naturesgift:pink_diamond",
			200, new int[] { 3, 6, 6, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public NGItemArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
		super(material, renderIndex, armorType);
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(NGCreativeTabs.NGCombat);
		addToItems(this);
	}

	private void addToItems(Item item) {
		NGItems.items.add(item);

	}
}
