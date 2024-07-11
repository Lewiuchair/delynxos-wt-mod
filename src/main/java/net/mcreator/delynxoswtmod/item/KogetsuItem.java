
package net.mcreator.delynxoswtmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.delynxoswtmod.procedures.MeleeTrionDamageProcedure;

public class KogetsuItem extends Item {
	public KogetsuItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MeleeTrionDamageProcedure.execute(entity.level(), entity);
		return retval;
	}
}
