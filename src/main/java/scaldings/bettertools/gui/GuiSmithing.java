package scaldings.bettertools.gui;

import net.minecraft.client.gui.GuiContainer;
import net.minecraft.core.player.inventory.InventoryPlayer;
import net.minecraft.core.world.World;
import org.lwjgl.opengl.GL11;
import scaldings.bettertools.BetterTools;

public class GuiSmithing extends GuiContainer {
	public GuiSmithing(InventoryPlayer inventoryplayer, World world, int i, int j, int k) {
		super(new ContainerSmithing(inventoryplayer, world, i, j, k));
	}

	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
		this.inventorySlots.onCraftGuiClosed(this.mc.thePlayer);
	}

	@Override
	protected void drawGuiContainerForegroundLayer() {
		this.fontRenderer.drawString("Smithing", this.xSize / 2 - this.fontRenderer.getStringWidth("Smithing") / 2, 6, 0x404040);
		this.fontRenderer.drawString("Inventory", 8, this.ySize - 123, 0x404040);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f) {
		int i = this.mc.renderEngine.getTexture("/assets/" + BetterTools.MOD_ID + "/gui/smithing.png");
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.renderEngine.bindTexture(i);
		int j = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);
	}
}
