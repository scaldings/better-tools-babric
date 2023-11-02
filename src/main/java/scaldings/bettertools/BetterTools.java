package scaldings.bettertools;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scaldings.bettertools.blocks.Blocks;
import scaldings.bettertools.items.Items;
import scaldings.bettertools.util.CraftingRecipes;
import scaldings.bettertools.util.SmithingRecipes;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

public class BetterTools implements ModInitializer {
	public static final String MOD_ID = "bettertools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final ConfigUpdater configUpdater = ConfigUpdater.fromProperties();
	private static final Toml tomlProperties = new Toml("BetterTools Config");
	public static TomlConfigHandler config;

	private static int itemID = 23450;
	private int getNextItemID() {
		return itemID++;
	}

	public static int blockID = 2345;
	private int getNextBlockID() {
		return blockID++;
	}

	private void initializeConfig() {
		tomlProperties.addCategory("Item IDs")
			.addEntry("reinforced_diamond_sword", getNextItemID())
			.addEntry("reinforced_diamond_shovel", getNextItemID())
			.addEntry("reinforced_diamond_pickaxe", getNextItemID())
			.addEntry("reinforced_diamond_axe", getNextItemID())
			.addEntry("reinforced_diamond_hoe", getNextItemID())
			.addEntry("gilded_steel_sword", getNextItemID())
			.addEntry("gilded_steel_shovel", getNextItemID())
			.addEntry("gilded_steel_pickaxe", getNextItemID())
			.addEntry("gilded_steel_axe", getNextItemID())
			.addEntry("gilded_steel_hoe", getNextItemID())
			.addEntry("gilded_diamond_sword", getNextItemID())
			.addEntry("gilded_diamond_shovel", getNextItemID())
			.addEntry("gilded_diamond_pickaxe", getNextItemID())
			.addEntry("gilded_diamond_axe", getNextItemID())
			.addEntry("gilded_diamond_hoe", getNextItemID())
			.addEntry("reinforced_diamond_helmet", getNextItemID())
			.addEntry("reinforced_diamond_chestplate", getNextItemID())
			.addEntry("reinforced_diamond_leggings", getNextItemID())
			.addEntry("reinforced_diamond_boots", getNextItemID())
			.addEntry("gilded_steel_helmet", getNextItemID())
			.addEntry("gilded_steel_chestplate", getNextItemID())
			.addEntry("gilded_steel_leggings", getNextItemID())
			.addEntry("gilded_steel_boots", getNextItemID())
			.addEntry("gilded_diamond_helmet", getNextItemID())
			.addEntry("gilded_diamond_chestplate", getNextItemID())
			.addEntry("gilded_diamond_leggings", getNextItemID())
			.addEntry("gilded_diamond_boots", getNextItemID());

		tomlProperties.addCategory("Block IDs")
			.addEntry("smithing_table", getNextBlockID());

		config = new TomlConfigHandler(configUpdater, MOD_ID, tomlProperties);
	}

	@Override
	public void onInitialize() {
		initializeConfig();
		Blocks.createBlocks();
		Items.createItems();
		CraftingRecipes.registerCraftingRecipes();
		SmithingRecipes.registerSmithingRecipes();
	}
}
