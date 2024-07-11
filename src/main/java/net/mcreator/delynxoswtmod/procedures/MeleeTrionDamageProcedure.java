package net.mcreator.delynxoswtmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.delynxoswtmod.network.DelynxosWtModModVariables;

public class MeleeTrionDamageProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).triggeractive) {
			if (entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).guarding == 0) {
				{
					DelynxosWtModModVariables.PlayerVariables _vars = entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES);
					_vars.trion = entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).trion - 15;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 15);
		}
	}
}
