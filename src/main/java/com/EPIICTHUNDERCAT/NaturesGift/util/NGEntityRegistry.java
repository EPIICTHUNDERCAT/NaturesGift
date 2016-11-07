package com.EPIICTHUNDERCAT.NaturesGift.util;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;
import com.EPIICTHUNDERCAT.NaturesGift.mobs.entities.EntityNatureSprig;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NGEntityRegistry {
	public static void init() {

		// NatureSprig
		// Every entity in our mod has an ID (local to this mod)
		int id = 1;
		EntityRegistry.registerModEntity(EntityNatureSprig.class, "NatureSprig", id++, NaturesGift.instance, 64, 3,
				true, 0x847294, 0x18be42);

		// We want our mob to spawn in Plains and ice plains biomes. If you
		// don't add this then it will not spawn automatically
		// but you can of course still make it spawn manually
		//EntityRegistry.addSpawn(EntityNatureSprig.class, 3, 43, 8, EnumCreatureType.MONSTER, Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntityNatureSprig.LOOT);
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		// RenderingRegistry.registerEntityRenderingHandler(EntityNatureSprig.class,
		// RenderEntityNatureSprig.FACTORY);

	}

}
