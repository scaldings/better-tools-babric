package scaldings.bettertools.util;

import net.minecraft.core.achievement.AchievementList;
import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.CraftingManager;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemToolHoe;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.item.tool.ItemToolSword;
import net.minecraft.core.player.inventory.IInventory;
import net.minecraft.core.player.inventory.InventoryCrafting;
import net.minecraft.core.player.inventory.slot.Slot;

public class SlotSmithing extends Slot {
	private final IInventory craftMatrix;
	private final EntityPlayer thePlayer;

	public SlotSmithing(EntityPlayer entityplayer, IInventory iinventory, IInventory iinventory1, int id, int x, int y) {
		super(iinventory1, id, x, y);
		this.thePlayer = entityplayer;
		this.craftMatrix = iinventory;
	}

	@Override
	public boolean canPutStackInSlot(ItemStack itemstack) {
		return false;
	}

	@Override
	public void onPickupFromSlot(ItemStack itemStack) {
		itemStack.onCrafting(this.thePlayer.world, this.thePlayer);
		Item item = itemStack.getItem();
		if (item instanceof ItemToolHoe) {
			this.thePlayer.addStat(AchievementList.BUILD_HOE, 1);
		}
		if (item instanceof ItemToolSword) {
			this.thePlayer.addStat(AchievementList.BUILD_SWORD, 1);
		}
		if (item instanceof ItemToolPickaxe) {
			ItemToolPickaxe itemToolPickaxe = (ItemToolPickaxe)item;
			if (itemToolPickaxe.getMaterial().getMiningLevel() > 0) {
				this.thePlayer.addStat(AchievementList.BUILD_BETTER_PICKAXE, 1);
			}
			this.thePlayer.addStat(AchievementList.BUILD_PICKAXE, 1);
		}
		SmithingManager.getInstance().onCraftResult((InventoryCrafting)this.craftMatrix);
	}

	@Override
	public boolean enableDragAndPickup() {
		return false;
	}

	@Override
	public boolean allowItemInteraction() {
		return false;
	}
}
