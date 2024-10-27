package com.scrabosoft.scraboskibidi.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.scrabosoft.scraboskibidi.ScraboSkibidi;
import com.scrabosoft.scraboskibidi.entity.custom.ToiletEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ToiletRenderer extends MobRenderer<ToiletEntity, ToiletModel<ToiletEntity>> {
    public ToiletRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ToiletModel<>(pContext.bakeLayer(ModModelLayers.TOILET_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ToiletEntity pEntity) {
        return new ResourceLocation(ScraboSkibidi.MODID, "textures/entity/toilet.png");
    }

    @Override
    public void render(ToiletEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
