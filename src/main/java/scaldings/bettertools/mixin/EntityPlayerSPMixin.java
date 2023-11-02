package scaldings.bettertools.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import scaldings.bettertools.gui.GuiSmithing;
import scaldings.bettertools.interfaces.IEntityPlayer;

@Mixin(value = EntityPlayerSP.class, remap = false)
public class EntityPlayerSPMixin implements IEntityPlayer {
	@Unique
	private EntityPlayerSP thisAs = (EntityPlayerSP) (Object) this;
	@Shadow
	protected Minecraft mc;

	@Unique
	public void bettertools$displayGUISmithing(int i, int j, int k) {
		this.mc.displayGuiScreen(new GuiSmithing(thisAs.inventory, thisAs.world, i, j, k));
	}
}
