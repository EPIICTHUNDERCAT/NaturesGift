package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.render;

import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities.EntityNatureSprig;
import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.models.NatureSprigModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityNatureSprig extends RenderLiving<EntityNatureSprig>{

	private static final ResourceLocation NATURESPRIG_TEXTURES = new ResourceLocation("naturesgift:textures/entity/naturesprig.png");
	
	

	   
	public static final Factory FACTORY = new Factory();

	public RenderEntityNatureSprig(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new NatureSprigModel(), 0.5F);
	}

	public RenderEntityNatureSprig(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityNatureSprig entity) {
		// TODO Auto-generated method stub
		return NATURESPRIG_TEXTURES;
	}
	public static class Factory implements IRenderFactory<EntityNatureSprig> {

		@Override
		public Render<? super EntityNatureSprig> createRenderFor(RenderManager manager) {
			return new RenderEntityNatureSprig(manager);
		}
	}
	


}

