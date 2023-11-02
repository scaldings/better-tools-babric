package scaldings.bettertools.util;

import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.CraftingManager;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import scaldings.bettertools.blocks.Blocks;

public class CraftingRecipes {
	public static void registerCraftingRecipes() {
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.smithingTable, 1), true, new Object[]{"XX", "##", Character.valueOf('X'), Item.ingotSteel, Character.valueOf('#'), Block.logOak});
	}
}
