
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balrviumplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import balrviumplus.BalrviumplusMod;

public class BalrviumplusModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BalrviumplusMod.MODID);
	public static final RegistryObject<SoundEvent> BALRVIUMHURT = REGISTRY.register("balrviumhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("balrviumplus", "balrviumhurt")));
	public static final RegistryObject<SoundEvent> BALRVIUMGIGGLE = REGISTRY.register("balrviumgiggle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("balrviumplus", "balrviumgiggle")));
	public static final RegistryObject<SoundEvent> BALRVIUMDEATH = REGISTRY.register("balrviumdeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("balrviumplus", "balrviumdeath")));
	public static final RegistryObject<SoundEvent> BALRVIUMHAMMER = REGISTRY.register("balrviumhammer", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("balrviumplus", "balrviumhammer")));
	public static final RegistryObject<SoundEvent> BALRVIUMHONK = REGISTRY.register("balrviumhonk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("balrviumplus", "balrviumhonk")));
}
