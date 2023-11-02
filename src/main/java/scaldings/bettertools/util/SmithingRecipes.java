package scaldings.bettertools.util;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import scaldings.bettertools.items.Items;

public class SmithingRecipes {
	public static void registerSmithingRecipes() {
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondSword, 1), Item.toolSwordDiamond, Item.toolSwordSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondShovel, 1), Item.toolShovelDiamond, Item.toolShovelSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondPickaxe, 1), Item.toolPickaxeDiamond, Item.toolPickaxeSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondAxe, 1), Item.toolAxeDiamond, Item.toolAxeSteel);

		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelSword, 1), Item.toolSwordGold, Item.toolSwordSteel);
		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelShovel, 1), Item.toolShovelGold, Item.toolShovelSteel);
		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelPickaxe, 1), Item.toolPickaxeGold, Item.toolPickaxeSteel);
		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelAxe, 1), Item.toolAxeGold, Item.toolAxeSteel);

		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondSword, 1), Item.toolSwordGold, Item.toolSwordDiamond);
		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondShovel, 1), Item.toolShovelGold, Item.toolShovelDiamond);
		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondPickaxe, 1), Item.toolPickaxeGold, Item.toolPickaxeDiamond);
		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondAxe, 1), Item.toolAxeGold, Item.toolAxeDiamond);

		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondHelmet, 1), Item.armorHelmetDiamond, Item.armorHelmetSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondChestplate, 1), Item.armorChestplateDiamond, Item.armorChestplateSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondLeggings, 1), Item.armorLeggingsDiamond, Item.armorLeggingsSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondBoots, 1), Item.armorBootsDiamond, Item.armorBootsSteel);

		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondHelmet, 1), Item.armorHelmetDiamond, Item.armorHelmetSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondChestplate, 1), Item.armorChestplateDiamond, Item.armorChestplateSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondLeggings, 1), Item.armorLeggingsDiamond, Item.armorLeggingsSteel);
		SmithingManager.addRecipe(new ItemStack(Items.reinforcedDiamondBoots, 1), Item.armorBootsDiamond, Item.armorBootsSteel);

		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelHelmet, 1), Item.armorHelmetGold, Item.armorHelmetSteel);
		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelChestplate, 1), Item.armorChestplateGold, Item.armorChestplateSteel);
		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelLeggings, 1), Item.armorLeggingsGold, Item.armorLeggingsSteel);
		SmithingManager.addRecipe(new ItemStack(Items.gildedSteelBoots, 1), Item.armorBootsGold, Item.armorBootsSteel);

		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondHelmet, 1), Item.armorHelmetGold, Item.armorHelmetDiamond);
		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondChestplate, 1), Item.armorChestplateGold, Item.armorChestplateDiamond);
		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondLeggings, 1), Item.armorLeggingsGold, Item.armorLeggingsDiamond);
		SmithingManager.addRecipe(new ItemStack(Items.gildedDiamondBoots, 1), Item.armorBootsGold, Item.armorBootsDiamond);
	}
}
