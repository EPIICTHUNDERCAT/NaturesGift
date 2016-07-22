package com.EPIICTHUNDERCAT.NaturesGift.item.Tools;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.Misc.NGCreativeTabs;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class NatureInfestedAxe extends ItemAxe {

	public NatureInfestedAxe(String name, ToolMaterial material) {
		super(material, 6.0f, 6.0f);
		setRegistryName(name.toLowerCase());
		setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setCreativeTab(NGCreativeTabs.NGCombat);
	}

	private void addToItems(Item item) {

		NGItems.items.add(item);

	}

	// Makes it so Nature Infested Axe is Reparable by the return
	// repair.getItem()
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (toRepair.getItem() == NGItems.NATURE_INFESTED_AXE) {
			return repair.getItem() == NGItems.STRONG_NATURE_MATERIAL;
		}
		return false;
	}
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) {
		System.out.println("HELLO");
		Item item = event.crafting.getItem();
		if (item == NGItems.NATURE_INFESTED_AXE) {
			System.out.println(event.crafting.getDisplayName());
			event.player.addStat(NGAchievement.InfestedAxe, 1);
		}
	}
}
