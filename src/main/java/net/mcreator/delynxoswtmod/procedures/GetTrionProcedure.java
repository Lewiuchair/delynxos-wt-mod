package net.mcreator.delynxoswtmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.delynxoswtmod.network.DelynxosWtModModVariables;

public class GetTrionProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Trion: " + entity.getData(DelynxosWtModModVariables.PLAYER_VARIABLES).trion + "/100";
	}
}
