
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.delynxoswtmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.delynxoswtmod.procedures.IsTriggerActiveProcedure;
import net.mcreator.delynxoswtmod.item.BorderTriggerItem;
import net.mcreator.delynxoswtmod.DelynxosWtModMod;

public class DelynxosWtModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, DelynxosWtModMod.MODID);
	public static final DeferredHolder<Item, Item> BORDER_TRIGGER = REGISTRY.register("border_trigger", () -> new BorderTriggerItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(BORDER_TRIGGER.get(), new ResourceLocation("delynxos_wt_mod:border_trigger_isactive"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) IsTriggerActiveProcedure.execute(entity));
			});
		}
	}
}
