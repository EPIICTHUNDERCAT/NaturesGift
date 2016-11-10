package com.EPIICTHUNDERCAT.NaturesGift.util;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;
import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities.EntityAgaric;
import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities.EntityNatureSprig;
import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.render.RenderEntityAgaric;
import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.render.RenderEntityNatureSprig;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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

		/*
		 * We want our mob to spawn in Plains and ice plains biomes. If you
		 * don't add this then it will not spawn automatically but you can of
		 * course still make it spawn manually
		 */
		EntityRegistry.addSpawn(EntityNatureSprig.class, 3, 4, 8, EnumCreatureType.MONSTER, Biomes.ROOFED_FOREST);

		// This is the loot table for our mob
		LootTableList.register(EntityNatureSprig.LOOT);

		// AGARIC//
		EntityRegistry.registerModEntity(EntityAgaric.class, "Agaric", id++, NaturesGift.instance, 64, 3, true, 0x85294,
				0x18346e42);

		EntityRegistry.addSpawn(EntityAgaric.class, 3, 2, 4, EnumCreatureType.MONSTER, Biomes.BIRCH_FOREST_HILLS,
				Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.JUNGLE_EDGE,
				Biomes.BIRCH_FOREST, Biomes.MUSHROOM_ISLAND, Biomes.MUSHROOM_ISLAND_SHORE, Biomes.SWAMPLAND,
				Biomes.ROOFED_FOREST);

		LootTableList.register(EntityAgaric.LOOT);

	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		RenderingRegistry.registerEntityRenderingHandler(EntityNatureSprig.class, RenderEntityNatureSprig.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityAgaric.class, RenderEntityAgaric.FACTORY);

	}

}
