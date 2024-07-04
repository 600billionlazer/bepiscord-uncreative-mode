
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.toomanykoopersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.toomanykoopersmod.TooManyKoopersModMod;

public class TooManyKoopersModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TooManyKoopersModMod.MODID);
	public static final RegistryObject<Item> KOOPER_SPAWN_EGG = REGISTRY.register("kooper_spawn_egg", () -> new ForgeSpawnEggItem(TooManyKoopersModModEntities.KOOPER, -16711936, -1064556, new Item.Properties()));
	public static final RegistryObject<Item> RED_KOOPER_SPAWN_EGG = REGISTRY.register("red_kooper_spawn_egg", () -> new ForgeSpawnEggItem(TooManyKoopersModModEntities.RED_KOOPER, -4902624, -739195, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
