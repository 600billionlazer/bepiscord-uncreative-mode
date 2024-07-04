
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balrviumplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import balrviumplus.block.DirtSlabBlock;

import balrviumplus.BalrviumplusMod;

public class BalrviumplusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BalrviumplusMod.MODID);
	public static final RegistryObject<Block> DIRT_SLAB = REGISTRY.register("dirt_slab", () -> new DirtSlabBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
