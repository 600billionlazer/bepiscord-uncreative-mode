
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanykoopersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.toomanykoopersmod.TooManyKoopersModMod;

public class TooManyKoopersModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TooManyKoopersModMod.MODID);
	public static final RegistryObject<SoundEvent> KOOP_HURT = REGISTRY.register("koop_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("too_many_koopers_mod", "koop_hurt")));
	public static final RegistryObject<SoundEvent> KOOP_DIE = REGISTRY.register("koop_die", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("too_many_koopers_mod", "koop_die")));
}
