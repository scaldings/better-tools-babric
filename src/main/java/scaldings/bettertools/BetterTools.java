package scaldings.bettertools;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scaldings.bettertools.blocks.Blocks;
import scaldings.bettertools.items.ArmorMaterials;
import scaldings.bettertools.items.Items;
import scaldings.bettertools.util.CraftingRecipes;
import scaldings.bettertools.util.SmithingRecipes;
import turniplabs.halplibe.helper.AchievementHelper;

public class BetterTools implements ModInitializer {
	public static final String MOD_ID = "bettertools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Blocks.createBlocks();
		Items.createItems();
		CraftingRecipes.registerCraftingRecipes();
		SmithingRecipes.registerSmithingRecipes();
	}
}
