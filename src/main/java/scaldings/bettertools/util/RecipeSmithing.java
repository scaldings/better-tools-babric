package scaldings.bettertools.util;

import net.minecraft.core.crafting.recipe.RecipeShapeless;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.InventoryCrafting;

import java.util.ArrayList;
import java.util.List;

public class RecipeSmithing extends RecipeShapeless {
	public RecipeSmithing(ItemStack itemstack, List list) {
		super(itemstack, list);
	}

	@Override
	public boolean matches(InventoryCrafting inventorycrafting) {
		ArrayList<ItemStack> arraylist = new ArrayList(this.recipeItems);
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				ItemStack itemstack = inventorycrafting.getItemStackAt(j, i);
				if (itemstack == null) continue;
				boolean flag = false;
				for (ItemStack itemstack1 : arraylist) {
					if (itemstack.itemID != itemstack1.itemID) continue;
					flag = true;
					arraylist.remove(itemstack1);
					break;
				}
				if (flag) continue;
				return false;
			}
		}
		return arraylist.isEmpty();
	}
}
