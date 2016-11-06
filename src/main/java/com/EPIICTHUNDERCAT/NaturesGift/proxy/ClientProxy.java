package com.EPIICTHUNDERCAT.NaturesGift.proxy;

import com.EPIICTHUNDERCAT.NaturesGift.entity.EntityNatureBeam;
import com.EPIICTHUNDERCAT.NaturesGift.entity.render.RenderEntityNatureBeam;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGBlocks;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;
import com.EPIICTHUNDERCAT.NaturesGift.misc.ParticleLeaf;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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
	@Override
	public void registerEntities(FMLPreInitializationEvent preEvent) {
		super.registerEntities(preEvent);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNatureBeam.class, new IRenderFactory<EntityNatureBeam>() {
            @Override public RenderEntityNatureBeam createRenderFor (RenderManager manager) {
                return new RenderEntityNatureBeam(manager, NGItems.NATUREBEAM);
            }
        });
	}

}
