package com.EPIICTHUNDERCAT.NaturesGift.ngmobs.render;

import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.entities.EntityAgaric;
import com.EPIICTHUNDERCAT.NaturesGift.ngmobs.models.AgaricModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEntityAgaric extends RenderLiving<EntityAgaric>{

	private static final ResourceLocation AGARIC_TEXTURES = new ResourceLocation("naturesgift:textures/entity/agaric.png");
	
	

	   
	public static final Factory FACTORY = new Factory();

	public RenderEntityAgaric(RenderManager rendermanagerIn) {

		super(rendermanagerIn, new AgaricModel(), 0.5F);
	}

	public RenderEntityAgaric(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityAgaric entity) {
		// TODO Auto-generated method stub
		return AGARIC_TEXTURES;
	}
	public static class Factory implements IRenderFactory<EntityAgaric> {

		@Override
		public Render<? super EntityAgaric> createRenderFor(RenderManager manager) {
			return new RenderEntityAgaric(manager);
		}
	}
}
	


