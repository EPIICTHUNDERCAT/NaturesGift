package com.EPIICTHUNDERCAT.NaturesGift.entity.render;

import com.EPIICTHUNDERCAT.NaturesGift.entity.EntityNatureBeam;
import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EntityRenderNatureBeam extends Render<EntityNatureBeam>{
	
	private static final ResourceLocation NATUREBEAM = new ResourceLocation(
			"naturesgift:textures/entity/naturebeam.png");
	private Item item;
	private RenderItem itemRenderer;

	public EntityRenderNatureBeam(RenderManager renderManager, Item item) {
		super(renderManager);
		this.item = item;
		this.itemRenderer = Minecraft.getMinecraft().getRenderItem();
		

	}
	@Override
	public void doRender(EntityNatureBeam entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x, (float) y, (float) z);
		GlStateManager.enableRescaleNormal();
		GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(
				(float) (this.renderManager.options.thirdPersonView == 2 ? -1 : 1) * this.renderManager.playerViewX,
				1.0F, 0.0F, 0.0F);
		GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
		this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);

		if (this.renderOutlines) {
			GlStateManager.enableColorMaterial();
			GlStateManager.enableOutlineMode(this.getTeamColor(entity));
		}

		this.itemRenderer.renderItem(this.getStackToRender(entity), ItemCameraTransforms.TransformType.GROUND);

		if (this.renderOutlines) {
			GlStateManager.disableOutlineMode();
			GlStateManager.disableColorMaterial();
		}

		GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	private ItemStack getStackToRender(EntityNatureBeam entity) {
		return new ItemStack(NGItems.NATUREBEAM);
			}

	@Override
	protected ResourceLocation getEntityTexture(EntityNatureBeam entity) {
		
		return NATUREBEAM;
	}

}
