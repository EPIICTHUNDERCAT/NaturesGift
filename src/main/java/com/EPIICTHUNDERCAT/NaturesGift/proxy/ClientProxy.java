package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.Misc.ParticleLeaf;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);

	}

	public void init(FMLInitializationEvent event) {
		super.init(event);

	}

	@Override
	public void registerRenders(FMLInitializationEvent event) {
		NGItems.registerRender(event);
		NGBlocks.registerRender(event);
	}

	@Override
	public void spawnParticleLeaf(World world, double x, double y, double z, double vx, double vy, double vz, double r,
			double g, double b) {
		ParticleLeaf particle = new ParticleLeaf(world, x, y, z, vx, vy, vz, r, g, b);
		Minecraft.getMinecraft().effectRenderer.addEffect(particle);

	}
}
