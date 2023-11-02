package scaldings.bettertools.items;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.tool.*;
import scaldings.bettertools.BetterTools;
import turniplabs.halplibe.helper.ItemHelper;

public class Items {
	private static int itemID(String configItemName) {
		return BetterTools.config.getInt("Item IDs." + configItemName);
	}

	public static Item reinforcedDiamondSword = new ItemToolSword("reinforced_diamond_sword", itemID("reinforced_diamond_sword"), ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondShovel = new ItemToolShovel("reinforced_diamond_shovel", itemID("reinforced_diamond_shovel"), ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondPickaxe = new ItemToolPickaxe("reinforced_diamond_pickaxe", itemID("reinforced_diamond_pickaxe"), ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondAxe = new ItemToolAxe("reinforced_diamond_axe", itemID("reinforced_diamond_axe"), ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondHoe = new ItemToolHoe("reinforced_diamond_hoe", itemID("reinforced_diamond_hoe"), ToolMaterials.reinforcedDiamond);

	public static Item gildedSteelSword = new ItemToolSword("gilded_steel_sword", itemID("gilded_steel_sword"), ToolMaterials.gildedSteel);
	public static Item gildedSteelShovel = new ItemToolShovel("gilded_steel_shovel", itemID("gilded_steel_shovel"), ToolMaterials.gildedSteel);
	public static Item gildedSteelPickaxe = new ItemToolPickaxe("gilded_steel_pickaxe", itemID("gilded_steel_pickaxe"), ToolMaterials.gildedSteel);
	public static Item gildedSteelAxe = new ItemToolAxe("gilded_steel_axe", itemID("gilded_steel_axe"), ToolMaterials.gildedSteel);
	public static Item gildedSteelHoe = new ItemToolHoe("gilded_steel_hoe", itemID("gilded_steel_hoe"), ToolMaterials.gildedSteel);

	public static Item gildedDiamondSword = new ItemToolSword("gilded_diamond_sword", itemID("gilded_diamond_sword"), ToolMaterials.gildedDiamond);
	public static Item gildedDiamondShovel = new ItemToolShovel("gilded_diamond_shovel", itemID("gilded_diamond_shovel"), ToolMaterials.gildedDiamond);
	public static Item gildedDiamondPickaxe = new ItemToolPickaxe("gilded_diamond_pickaxe", itemID("gilded_diamond_pickaxe"), ToolMaterials.gildedDiamond);
	public static Item gildedDiamondAxe = new ItemToolAxe("gilded_diamond_axe", itemID("gilded_diamond_axe"), ToolMaterials.gildedDiamond);
	public static Item gildedDiamondHoe = new ItemToolHoe("gilded_diamond_hoe", itemID("gilded_diamond_hoe"), ToolMaterials.gildedDiamond);

	public static Item reinforcedDiamondHelmet = new ItemArmor("reinforced_diamond_helmet", itemID("reinforced_diamond_helmet"), ArmorMaterials.reinforced_diamond, 0);
	public static Item reinforcedDiamondChestplate = new ItemArmor("reinforced_diamond_chestplate", itemID("reinforced_diamond_chestplate"), ArmorMaterials.reinforced_diamond, 1);
	public static Item reinforcedDiamondLeggings = new ItemArmor("reinforced_diamond_leggings", itemID("reinforced_diamond_leggings"), ArmorMaterials.reinforced_diamond, 2);
	public static Item reinforcedDiamondBoots = new ItemArmor("reinforced_diamond_boots", itemID("reinforced_diamond_boots"), ArmorMaterials.reinforced_diamond, 3);

	public static Item gildedSteelHelmet = new ItemArmor("gilded_steel_helmet", itemID("gilded_steel_helmet"), ArmorMaterials.gilded_steel, 0);
	public static Item gildedSteelChestplate = new ItemArmor("gilded_steel_chestplate", itemID("gilded_steel_chestplate"), ArmorMaterials.gilded_steel, 1);
	public static Item gildedSteelLeggings = new ItemArmor("gilded_steel_leggings", itemID("gilded_steel_leggings"), ArmorMaterials.gilded_steel, 2);
	public static Item gildedSteelBoots = new ItemArmor("gilded_steel_boots", itemID("gilded_steel_boots"), ArmorMaterials.gilded_steel, 3);

	public static Item gildedDiamondHelmet = new ItemArmor("gilded_diamond_helmet", itemID("gilded_diamond_helmet"), ArmorMaterials.gilded_diamond, 0);
	public static Item gildedDiamondChestplate = new ItemArmor("gilded_diamond_chestplate", itemID("gilded_diamond_chestplate"), ArmorMaterials.gilded_diamond, 1);
	public static Item gildedDiamondLeggings = new ItemArmor("gilded_diamond_leggings", itemID("gilded_diamond_leggings"), ArmorMaterials.gilded_diamond, 2);
	public static Item gildedDiamondBoots = new ItemArmor("gilded_diamond_boots", itemID("gilded_diamond_boots"), ArmorMaterials.gilded_diamond, 3);

	private static final Item[] itemList = new Item[] {
		reinforcedDiamondSword,
		reinforcedDiamondShovel,
		reinforcedDiamondPickaxe,
		reinforcedDiamondAxe,
		reinforcedDiamondHoe,
		gildedSteelSword,
		gildedSteelShovel,
		gildedSteelPickaxe,
		gildedSteelAxe,
		gildedSteelHoe,
		gildedDiamondSword,
		gildedDiamondShovel,
		gildedDiamondPickaxe,
		gildedDiamondAxe,
		gildedDiamondHoe,
		reinforcedDiamondHelmet,
		reinforcedDiamondChestplate,
		reinforcedDiamondLeggings,
		reinforcedDiamondBoots,
		gildedSteelHelmet,
		gildedSteelChestplate,
		gildedSteelLeggings,
		gildedSteelBoots,
		gildedDiamondHelmet,
		gildedDiamondChestplate,
		gildedDiamondLeggings,
		gildedDiamondBoots
	};

	public static void createItems() {
		for(Item i : itemList) {
			String name = i.getKey().replace("item.", "");
			//BetterTools.LOGGER.info("Registering item " + name + " with ID: " + i.id);
			ItemHelper.createItem(BetterTools.MOD_ID, i, name, name + ".png");
		}
	}
}
