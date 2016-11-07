package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;
import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGCreativeTabs;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class NGItemArmor extends ItemArmor {

	public static ArmorMaterial PINK_DIAMOND = EnumHelper.addArmorMaterial("PINK_DIAMOND", "naturesgift:pink_diamond",
			150, new int[] { 3, 6, 8, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	public static ArmorMaterial STRONG_NATURE_MATERIAL = EnumHelper.addArmorMaterial("STRONG_NATURE_MATERIAL",
			"naturesgift:strong_nature_material", 100, new int[] { 3, 6, 5, 3 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static ArmorMaterial NATURE_MATERIAL = EnumHelper.addArmorMaterial("NATURE_MATERIAL",
			"naturesgift:nature_material", 10, new int[] { 2, 4, 3, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

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
	   @Override
	    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
	            NaturesGift.proxy.spawnParticleLeaf(world, player.posX, player.posY, player.posZ, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
	}
	
}
