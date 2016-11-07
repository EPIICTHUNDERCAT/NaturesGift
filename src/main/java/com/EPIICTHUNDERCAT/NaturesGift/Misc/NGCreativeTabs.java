package com.EPIICTHUNDERCAT.NaturesGift.misc;


import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NGCreativeTabs extends CreativeTabs {
	public NGCreativeTabs(int index, String label) {
		super(index, label);
	}

	public static final NGCreativeTabs NGCombat = new NGCreativeTabs(CreativeTabs.getNextID(), "ngcombat") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return NGItems.SEQS_SCEPTER;
		}
	};
	public static final NGCreativeTabs NGSpecial = new NGCreativeTabs(CreativeTabs.getNextID(), "ngspecial") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return NGItems.BARTZ_WAND;
		}
	};

	public static final NGCreativeTabs NGMaterials = new NGCreativeTabs(CreativeTabs.getNextID(), "ngmaterials") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return NGItems.GOO_ESSENCE;
		}
	};
	public static final NGCreativeTabs NGFood = new NGCreativeTabs(CreativeTabs.getNextID(), "ngfood") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return NGItems.GRASS_DOG;
		}
	};
	
	public static final NGCreativeTabs NGTools = new NGCreativeTabs(CreativeTabs.getNextID(), "ngtools") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return NGItems.NATURE_INFESTED_AXE;
		}
	};
	

	@Override
	public Item getTabIconItem() {
		return null;
	}

}
