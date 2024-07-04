
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanykoopersmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.toomanykoopersmod.client.renderer.RedKooperRenderer;
import net.mcreator.toomanykoopersmod.client.renderer.KooperRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TooManyKoopersModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TooManyKoopersModModEntities.KOOPER.get(), KooperRenderer::new);
		event.registerEntityRenderer(TooManyKoopersModModEntities.RED_KOOPER.get(), RedKooperRenderer::new);
	}
}
