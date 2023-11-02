package scaldings.bettertools.blocks;

import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import scaldings.bettertools.BetterTools;
import turniplabs.halplibe.helper.BlockBuilder;

public class Blocks {
	private static int blockID(String configItemName) {
		return BetterTools.config.getInt("Block IDs." + configItemName);
	}

	public static Block smithingTable;

	public static void createBlocks() {
		smithingTable = new BlockBuilder(BetterTools.MOD_ID)
			.setResistance(10.0f)
			.setImmovable()
			.setBottomTexture("smithing_table/smithing_table_bottom.png")
			.setTopTexture("smithing_table/smithing_table_top.png")
			.setSideTextures("smithing_table/smithing_table_side.png")
			.setHardness(3.5f)
			.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
			.setBlockSound(BlockSounds.WOOD)
			.build(new SmithingTableBlock("smithing_table" , blockID("smithing_table"), Material.wood));
	}
}
