package scaldings.bettertools.mixin;

import net.minecraft.core.net.packet.Packet100OpenWindow;
import net.minecraft.server.entity.player.EntityPlayerMP;
import net.minecraft.server.net.handler.NetServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import scaldings.bettertools.gui.ContainerSmithing;
import scaldings.bettertools.interfaces.IEntityPlayer;

@Mixin(value = EntityPlayerMP.class, remap = false, priority = 2000)
public class EntityPlayerMPMixin implements IEntityPlayer {
	@Shadow
	private void getNextWindowId() {}
	@Shadow
	private int currentWindowId;
	@Shadow
	public NetServerHandler playerNetServerHandler;
	@Unique
	private EntityPlayerMP thisAs = (EntityPlayerMP)(Object)this;

	@Unique
	public void bettertools$displayGUISmithing(int i, int j, int k) {
		this.getNextWindowId();
		this.playerNetServerHandler.sendPacket(new Packet100OpenWindow(this.currentWindowId, 1, "Smithing", 2));
		thisAs.craftingInventory = new ContainerSmithing(((EntityPlayerMP)(Object)this).inventory, ((EntityPlayerMP)(Object)this).world, i, j, k);
		thisAs.craftingInventory.windowId = this.currentWindowId;
		thisAs.craftingInventory.onContainerInit(((EntityPlayerMP)(Object)this));
	}
}
