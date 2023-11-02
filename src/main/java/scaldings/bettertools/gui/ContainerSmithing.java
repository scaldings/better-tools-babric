package scaldings.bettertools.gui;

import net.minecraft.core.InventoryAction;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.*;
import net.minecraft.core.player.inventory.slot.Slot;
import net.minecraft.core.world.World;
import scaldings.bettertools.blocks.Blocks;
import scaldings.bettertools.util.SlotSmithing;
import scaldings.bettertools.util.SmithingManager;

import java.util.List;

public class ContainerSmithing extends Container {
	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 2, 1);
	public IInventory craftResult = new InventoryCraftResult();
	private final World world;
	private final int blockX;
	private final int blockY;
	private final int blockZ;

	public ContainerSmithing(InventoryPlayer inventoryplayer, World world, int i, int j, int k) {
		this.world = world;
		this.blockX = i;
		this.blockY = j;
		this.blockZ = k;

		//smithing grid
		this.addSlot(new Slot(this.craftMatrix, 0, 26, 19));
		this.addSlot(new Slot(this.craftMatrix, 1, 80, 19));

		//smithing result slot
		this.addSlot(new SlotSmithing(inventoryplayer.player, this.craftMatrix, this.craftResult, 0, 134, 19));

		//3x9 player invnetory
		for (int i1 = 0; i1 < 3; ++i1) {
			for (int l1 = 0; l1 < 9; ++l1) {
				this.addSlot(new Slot(inventoryplayer, l1 + i1 * 9 + 9, 8 + l1 * 18, 55 + i1 * 18));
			}
		}

		//player hotbar
		for (int j1 = 0; j1 < 9; ++j1) {
			this.addSlot(new Slot(inventoryplayer, j1, 8 + j1 * 18, 113));
		}

		this.onCraftMatrixChanged(this.craftMatrix);
	}

	@Override
	public void onCraftMatrixChanged(IInventory iinventory) {
		this.craftResult.setInventorySlotContents(0, SmithingManager.getInstance().findMatchingRecipe(this.craftMatrix));
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer entityplayer) {
		if (this.world.getBlockId(this.blockX, this.blockY, this.blockZ) != Blocks.smithingTable.id) {
			return false;
		}
		return entityplayer.distanceToSqr((double)this.blockX + 0.5, (double)this.blockY + 0.5, (double)this.blockZ + 0.5) <= 64.0;
	}

	@Override
	public void onCraftGuiClosed(EntityPlayer player) {
		super.onCraftGuiClosed(player);

		boolean insert = false;
		for(int h = 0; h < this.craftMatrix.getSizeInventory(); h++) {
			ItemStack itemstack = this.craftMatrix.getStackInSlot(h);
			if (itemstack != null) {
				this.storeOrDropItem(player, itemstack);
				insert = true;
			}
		}

		if (insert) {player.world.playSoundAtEntity(player, "random.insert", 0.1f, 1.0f);}
	}

	@Override
	public List<Integer> getMoveSlots(InventoryAction action, Slot slot, int target, EntityPlayer player) {
		if (slot.id == 0) {
			return this.getSlots(0, 1, false);}
		if (slot.id >= 1 && slot.id < 9) {
			return this.getSlots(1, 9, false);
		}
		if (action == InventoryAction.MOVE_SIMILAR) {
			if (slot.id >= 10 && slot.id <= 45) {
				return this.getSlots(10, 36, false);
			}
		} else {
			if (slot.id >= 10 && slot.id <= 36) {
				return this.getSlots(10, 27, false);
			}
			if (slot.id >= 37 && slot.id <= 45) {
				return this.getSlots(37, 9, false);
			}
		}
		return null;
	}

	@Override
	public List<Integer> getTargetSlots(InventoryAction action, Slot slot, int target, EntityPlayer player) {
		if (slot.id >= 10 && slot.id <= 45) {
			if (target == 1) {
				return this.getSlots(1, 9, false);
			}
			if (slot.id >= 10 && slot.id <= 36) {
				return this.getSlots(37, 9, false);
			}
			if (slot.id >= 37 && slot.id <= 45) {
				return this.getSlots(10, 27, false);
			}
		} else {
			if (slot.id == 0) {
				return this.getSlots(10, 36, true);
			}
			return this.getSlots(10, 36, false);
		}
		return null;
	}
}
