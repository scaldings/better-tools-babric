package scaldings.bettertools.items;

import net.minecraft.core.item.material.ToolMaterial;

public class ToolMaterials {
	public static final ToolMaterial reinforcedDiamond = new ToolMaterial().setDurability(4608).setEfficiency(14.0f, 45.0f).setMiningLevel(3).setDamage(4).setBlockHitDelay(4);
	public static final ToolMaterial gildedSteel = new ToolMaterial().setDurability(4608).setEfficiency(7.0f, 14.0f).setMiningLevel(3).setSilkTouch(true);
	public static final ToolMaterial gildedDiamond = new ToolMaterial().setDurability(1536).setEfficiency(14.0f, 45.0f).setMiningLevel(3).setDamage(4).setBlockHitDelay(4).setSilkTouch(true);
}
