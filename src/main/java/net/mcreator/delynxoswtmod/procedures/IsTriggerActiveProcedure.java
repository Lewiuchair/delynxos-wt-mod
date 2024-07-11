package net.mcreator.delynxoswtmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.delynxoswtmod.network.DelynxosWtModModVariables;

public class IsTriggerActiveProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).triggeractive) {
			return 1;
		}
		return 0;
	}
}
