package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.NaturesGift;
import com.EPIICTHUNDERCAT.NaturesGift.entity.EntityNatureBeam;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGRecipes;
import com.EPIICTHUNDERCAT.NaturesGift.misc.NGAchievement;
import com.EPIICTHUNDERCAT.NaturesGift.miscdrops.NGTreeDrops;
import com.EPIICTHUNDERCAT.NaturesGift.mobs.NGMobDrops;
import com.EPIICTHUNDERCAT.NaturesGift.util.EventManager;
import com.EPIICTHUNDERCAT.NaturesGift.util.NGConfig;
import com.EPIICTHUNDERCAT.NaturesGift.util.NGEntityRegistry;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {

	public static int neDrop;
	public static int gcDrop;

	public void preInit(FMLPreInitializationEvent preEvent) {
		register(preEvent);
		NGConfig.config(preEvent);
		NGEntityRegistry.init();

	}

	public void init(FMLInitializationEvent event) {
		registerRenders(event);

		AchievementPage.registerAchievementPage(NGAchievement.NGAchievePage);
	}

	private void register(FMLPreInitializationEvent preEvent) {
		registerEntities(preEvent);
		NGItems.register(preEvent);
		NGBlocks.register(preEvent);
		NGRecipes.register(preEvent);
		// recipe change for 1.9.4 handling
		/*
		 * if (versionCompare(MinecraftForge.MC_VERSION) >= 0)
		 * NGRecipes.register(preEvent); else LegacyRecipes.register(preEvent);
		 */
		MinecraftForge.addGrassSeed(new ItemStack(NGItems.GRASS_CLIPPINGS), gcDrop);
		MinecraftForge.addGrassSeed(new ItemStack(NGItems.NATURE_ESSENCE), neDrop);
		MinecraftForge.EVENT_BUS.register(new NGMobDrops());
		MinecraftForge.EVENT_BUS.register(new NaturesGift());
		MinecraftForge.EVENT_BUS.register(new NGTreeDrops());
		MinecraftForge.EVENT_BUS.register(new EventManager());
		MinecraftForge.EVENT_BUS.register(new ItemStack(NGItems.NATURE_INFESTED_AXE));

	}

	public void registerRenders(FMLInitializationEvent event) {

	}

	public void registerEntities(FMLPreInitializationEvent preEvent) {
		int id = 0;

		EntityRegistry.registerModEntity(EntityNatureBeam.class, "naturebeam", id++, NaturesGift.instance, 64, 2, true);
	}

	/*
	 * public void spawnParticleLeaf(World world, double x, double y, double z,
	 * double vx, double vy, double vz, double r, double g, double b) {
	 * 
	 * }
	 */
	/*
	 * public static int versionCompare(String version) { String cutoff =
	 * "1.10.0"; String[] mcVersion = version.split("\\."); String[]
	 * cutoffVersion = cutoff.split("\\."); int i = 0; // set index to first
	 * non-equal ordinal or length of shortest version // string while (i <
	 * mcVersion.length && i < cutoffVersion.length &&
	 * mcVersion[i].equals(cutoffVersion[i])) { i++; } // compare first
	 * non-equal ordinal number if (i < mcVersion.length && i <
	 * cutoffVersion.length) { int diff =
	 * Integer.valueOf(mcVersion[i]).compareTo(Integer.valueOf(cutoffVersion[i])
	 * ); return Integer.signum(diff); } // the strings are equal or one string
	 * is a substring of the other // e.g. "1.2.3" = "1.2.3" or "1.2.3" <
	 * "1.2.3.4" return Integer.signum(mcVersion.length - cutoffVersion.length);
	 * }
	 */
	public void spawnParticleLeaf(World world, double x, double y, double z, double vx, double vy, double vz, double r,
			double g, double b) {

	}

}