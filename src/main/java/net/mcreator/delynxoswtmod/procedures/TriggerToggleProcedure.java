package net.mcreator.delynxoswtmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.delynxoswtmod.network.DelynxosWtModModVariables;

public class TriggerToggleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			DelynxosWtModModVariables.PlayerVariables _vars = entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES);
			_vars.triggeractive = !entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).triggeractive;
			_vars.syncPlayerVariables(entity);
		}
	}
}
