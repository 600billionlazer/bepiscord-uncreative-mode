package net.mcreator.toomanykoopersmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelKooper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("too_many_koopers_mod", "model_kooper"), "main");
	public final ModelPart ModelKoopa;

	public ModelKooper(ModelPart root) {
		this.ModelKoopa = root.getChild("ModelKoopa");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ModelKoopa = partdefinition.addOrReplaceChild("ModelKoopa", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition Shell = ModelKoopa.addOrReplaceChild("Shell",
				CubeListBuilder.create().texOffs(0, 21).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-6.0F, 2.0F, -2.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 36).addBox(-6.0F, 4.0F, -3.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-7.0F, 5.0F, -4.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-6.0F, 9.0F, -4.0F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -6.0F, 1.0F));
		PartDefinition Head = ModelKoopa.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 75).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 82).addBox(-4.0F, -10.0F, 1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-4.0F, -10.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 0).addBox(-3.0F, -7.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -2.0F, -5.0F));
		PartDefinition Legs = ModelKoopa.addOrReplaceChild("Legs",
				CubeListBuilder.create().texOffs(39, 6).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 0).addBox(2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 6)
						.addBox(-3.0F, 0.0F, 8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 0).addBox(2.0F, 0.0F, 8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.0F, -5.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ModelKoopa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
