package net.mcreator.delynxoswtmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.delynxoswtmod.network.DelynxosWtModModVariables;

public class IsTriggerActiveProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).triggeractive;
	}
}
