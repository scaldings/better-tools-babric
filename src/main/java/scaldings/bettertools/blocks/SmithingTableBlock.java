package scaldings.bettertools.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;
import scaldings.bettertools.interfaces.IEntityPlayer;

public class SmithingTableBlock extends Block {
	public SmithingTableBlock(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		if (!world.isClientSide) {
			this.displayGUI(player, x, y, z);
		}
        return true;
    }

	private void displayGUI(EntityPlayer player, int x, int y, int z) {
		((IEntityPlayer)player).bettertools$displayGUISmithing(x, y, z);
	}
}
