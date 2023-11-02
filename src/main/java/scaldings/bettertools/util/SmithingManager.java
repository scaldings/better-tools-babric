package scaldings.bettertools.util;

import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.recipe.IRecipe;
import net.minecraft.core.crafting.recipe.RecipeShapeless;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.InventoryCrafting;

import java.util.ArrayList;
import java.util.List;

public class SmithingManager {
	private static final SmithingManager instance = new SmithingManager();
	private static final List<IRecipe> recipes = new ArrayList<IRecipe>();

	public static SmithingManager getInstance() {return instance;}

	public static void addRecipe(ItemStack result, Object ... ingredients) {
		ArrayList<ItemStack> list = new ArrayList<ItemStack>();
		for (int i = 0; i < ingredients.length; ++i) {
			Object obj = ingredients[i];
			if (obj instanceof ItemStack) {
				list.add(((ItemStack)obj).copy());
				continue;
			}
			if (obj instanceof Item) {
				list.add(new ItemStack((Item)obj));
				continue;
			}
			if (obj instanceof Block) {
				list.add(new ItemStack((Block)obj));
				continue;
			}
			throw new RuntimeException("Invalid object " + obj + " at index " + i);
		}
		recipes.add(new RecipeSmithing(result, list));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting inventorycrafting) {
        for (IRecipe irecipe : recipes) {
            if (!irecipe.matches(inventorycrafting)) continue;
            return irecipe.getCraftingResult(inventorycrafting);
        }
		return null;
	}

	public ItemStack[] onCraftResult(InventoryCrafting inventorycrafting) {
        for (IRecipe irecipe : recipes) {
            if (!irecipe.matches(inventorycrafting)) continue;
            return irecipe.onCraftResult(inventorycrafting);
        }
		return null;
	}
}
