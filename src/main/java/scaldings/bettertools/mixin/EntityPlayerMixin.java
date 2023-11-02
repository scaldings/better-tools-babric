package scaldings.bettertools.mixin;

import net.minecraft.core.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import scaldings.bettertools.interfaces.IEntityPlayer;

@Mixin(value = EntityPlayer.class, remap = false)
public class EntityPlayerMixin implements IEntityPlayer {
	@Override
	public void bettertools$displayGUISmithing(int i, int j, int k) {}
}
