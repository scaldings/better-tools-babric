package scaldings.bettertools.items;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.tool.*;
import scaldings.bettertools.BetterTools;
import turniplabs.halplibe.helper.ItemHelper;

public class Items {
	public static int availableID = 16530;

	public static Item reinforcedDiamondSword = new ItemToolSword("reinforced_diamond_sword", availableID++, ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondShovel = new ItemToolShovel("reinforced_diamond_shovel", availableID++, ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondPickaxe = new ItemToolPickaxe("reinforced_diamond_pickaxe", availableID++, ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondAxe = new ItemToolAxe("reinforced_diamond_axe", availableID++, ToolMaterials.reinforcedDiamond);
	public static Item reinforcedDiamondHoe = new ItemToolHoe("reinforced_diamond_hoe", availableID++, ToolMaterials.reinforcedDiamond);

	public static Item gildedSteelSword = new ItemToolSword("gilded_steel_sword", availableID++, ToolMaterials.gildedSteel);
	public static Item gildedSteelShovel = new ItemToolShovel("gilded_steel_shovel", availableID++, ToolMaterials.gildedSteel);
	public static Item gildedSteelPickaxe = new ItemToolPickaxe("gilded_steel_pickaxe", availableID++, ToolMaterials.gildedSteel);
	public static Item gildedSteelAxe = new ItemToolAxe("gilded_steel_axe", availableID++, ToolMaterials.gildedSteel);
	public static Item gildedSteelHoe = new ItemToolHoe("gilded_steel_hoe", availableID++, ToolMaterials.gildedSteel);

	public static Item gildedDiamondSword = new ItemToolSword("gilded_diamond_sword", availableID++, ToolMaterials.gildedDiamond);
	public static Item gildedDiamondShovel = new ItemToolShovel("gilded_diamond_shovel", availableID++, ToolMaterials.gildedDiamond);
	public static Item gildedDiamondPickaxe = new ItemToolPickaxe("gilded_diamond_pickaxe", availableID++, ToolMaterials.gildedDiamond);
	public static Item gildedDiamondAxe = new ItemToolAxe("gilded_diamond_axe", availableID++, ToolMaterials.gildedDiamond);
	public static Item gildedDiamondHoe = new ItemToolHoe("gilded_diamond_hoe", availableID++, ToolMaterials.gildedDiamond);

	public static Item reinforcedDiamondHelmet = new ItemArmor("reinforced_diamond_helmet", availableID++, ArmorMaterials.reinforced_diamond, 0);
	public static Item reinforcedDiamondChestplate = new ItemArmor("reinforced_diamond_chestplate", availableID++, ArmorMaterials.reinforced_diamond, 1);
	public static Item reinforcedDiamondLeggings = new ItemArmor("reinforced_diamond_leggings", availableID++, ArmorMaterials.reinforced_diamond, 2);
	public static Item reinforcedDiamondBoots = new ItemArmor("reinforced_diamond_boots", availableID++, ArmorMaterials.reinforced_diamond, 3);

	public static Item gildedSteelHelmet = new ItemArmor("gilded_steel_helmet", availableID++, ArmorMaterials.gilded_steel, 0);
	public static Item gildedSteelChestplate = new ItemArmor("gilded_steel_chestplate", availableID++, ArmorMaterials.gilded_steel, 1);
	public static Item gildedSteelLeggings = new ItemArmor("gilded_steel_leggings", availableID++, ArmorMaterials.gilded_steel, 2);
	public static Item gildedSteelBoots = new ItemArmor("gilded_steel_boots", availableID++, ArmorMaterials.gilded_steel, 3);

	public static Item gildedDiamondHelmet = new ItemArmor("gilded_diamond_helmet", availableID++, ArmorMaterials.gilded_diamond, 0);
	public static Item gildedDiamondChestplate = new ItemArmor("gilded_diamond_chestplate", availableID++, ArmorMaterials.gilded_diamond, 1);
	public static Item gildedDiamondLeggings = new ItemArmor("gilded_diamond_leggings", availableID++, ArmorMaterials.gilded_diamond, 2);
	public static Item gildedDiamondBoots = new ItemArmor("gilded_diamond_boots", availableID++, ArmorMaterials.gilded_diamond, 3);

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
