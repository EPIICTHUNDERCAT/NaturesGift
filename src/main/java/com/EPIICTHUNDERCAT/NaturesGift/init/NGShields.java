package com.EPIICTHUNDERCAT.NaturesGift.init;

import javax.annotation.Nullable;

import com.EPIICTHUNDERCAT.NaturesGift.misc.NGCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NGShields extends ItemShield {

	public NGShields(String name) {
		this.maxStackSize = 1;
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setMaxDamage(1000);
		this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F
						: 0.0F;
			}
		});
	}

	private void addToItems(Item item) {
		NGItems.items.add(item);
	}


	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return NGCreativeTabs.NGCombat;
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		String name;
		if (stack.isItemEqual(new ItemStack(NGItems.PINK_DIAMOND_MOSSY_SHIELD))){
			name = "Pink Diamond Mossy Shield";
		}
		else {
			name = "Mossy Shield";
		}
		return name;
    }

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		Item repairItem;
		if (toRepair.isItemEqual(new ItemStack(NGItems.PINK_DIAMOND_MOSSY_SHIELD))){
			repairItem = NGItems.PINK_DIAMOND;
		}
		else {
			repairItem = Item.getItemFromBlock(Blocks.MOSSY_COBBLESTONE);
		}
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}
}
