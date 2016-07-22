package com.EPIICTHUNDERCAT.NaturesGift.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class NGToolMaterials {
	public static ToolMaterial GOO_ESSENCE = EnumHelper.addToolMaterial("GOO_ESSENCE", 3, 8000, 18.0F, 10.0F, 30);
	public static ToolMaterial NATURE_CHIPS = EnumHelper.addToolMaterial("NATURE_CHIPS", 3, 6000, 9.0F, 4.0F, 30);
	public static ToolMaterial SKY_GEM = EnumHelper.addToolMaterial("SKY_GEM", 3, 4000, 12.0F, 3.0F, 30);
	public static ToolMaterial BARTZ_ESSENCE = EnumHelper.addToolMaterial("BARTZ_ESSENCE", 2, 800, 2.0F, 1.0F, 10);
	public static ToolMaterial PINK_DIAMOND = EnumHelper.addToolMaterial("PINK_DIAMOND", 3, 5000, 10.0F, 10.0F, 30);
	public static ToolMaterial NATURE_MATERIAL = EnumHelper.addToolMaterial("NATURE_MATERIAL", 2, 510, 3.0F, 3.0F, 20);
	public static ToolMaterial STRONG_NATURE_MATERIAL = EnumHelper.addToolMaterial("STRONG_NATURE_MATERIAL", 3, 1200,
			14.0F, 4.0F, 30);
	
	public float getDamageVsEntity() {
		
		return 0;
	}
	public int getMaxUses() {
	
		return 0;
	}
}
