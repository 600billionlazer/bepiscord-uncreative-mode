
package net.mcreator.toomanykoopersmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.toomanykoopersmod.entity.KooperEntity;
import net.mcreator.toomanykoopersmod.client.model.ModelKooper;

public class KooperRenderer extends MobRenderer<KooperEntity, ModelKooper<KooperEntity>> {
	public KooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKooper(context.bakeLayer(ModelKooper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KooperEntity entity) {
		return new ResourceLocation("too_many_koopers_mod:textures/entities/koopa.png");
	}
}
