package com.scrabosoft.scraboskibidi.entity.client;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.*;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class ToiletModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart BasicToilet;
	private final ModelPart Head;
	private final ModelPart Toilet;

	public ToiletModel(ModelPart root) {
		this.BasicToilet = root.getChild("BasicToilet");
		this.Head = this.BasicToilet.getChild("Head");
		this.Toilet = this.BasicToilet.getChild("Toilet");
	}
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition BasicToilet = partdefinition.addOrReplaceChild("BasicToilet", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = BasicToilet.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 5.0F, -5.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-4.0F, -5.0F, -6.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.5F))
		.texOffs(24, 0).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Toilet = BasicToilet.addOrReplaceChild("Toilet", CubeListBuilder.create().texOffs(0, 75).addBox(-8.0F, -2.0F, -11.0F, 20.0F, 14.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-6.0F, -19.0F, 5.0F, 16.0F, 31.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		BasicToilet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}


	@Override
	public ModelPart root() {
		return BasicToilet;
	}
}