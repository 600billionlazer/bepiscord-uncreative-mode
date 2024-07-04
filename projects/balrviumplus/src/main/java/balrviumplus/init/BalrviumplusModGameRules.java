
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balrviumplus.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BalrviumplusModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DANGEROUS_LEAP = GameRules.register("dangerousLeap", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
