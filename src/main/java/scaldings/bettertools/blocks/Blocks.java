package scaldings.bettertools.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import scaldings.bettertools.BetterTools;
import turniplabs.halplibe.helper.BlockBuilder;

public class Blocks {
	public static int availableID = 1301;
	public static Block smithingTable;

	public static void createBlocks() {
		smithingTable = new BlockBuilder(BetterTools.MOD_ID)
			.setHardness(5.0F)
			.setResistance(10.0F)
			.setImmovable()
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setBottomTexture("smithing_table/smithing_table_bottom.png")
			.setTopTexture("smithing_table/smithing_table_top.png")
			.setSideTextures("smithing_table/smithing_table_side.png")
			.build(new SmithingTableBlock("smithing_table" , availableID++));
	}
}
