
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.delynxoswtmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.delynxoswtmod.item.KogetsuItem;
import net.mcreator.delynxoswtmod.item.BorderTriggerItem;
import net.mcreator.delynxoswtmod.DelynxosWtModMod;

public class DelynxosWtModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, DelynxosWtModMod.MODID);
	public static final DeferredHolder<Item, Item> BORDER_TRIGGER = REGISTRY.register("border_trigger", () -> new BorderTriggerItem());
	public static final DeferredHolder<Item, Item> KOGETSU = REGISTRY.register("kogetsu", () -> new KogetsuItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
