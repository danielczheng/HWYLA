package mcp.mobius.waila.handlers.tooltip;

import java.util.List;
import mcp.mobius.waila.mod_Waila;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;
import codechicken.nei.forge.IContainerTooltipHandler;

public class TooltipHandlerWaila implements IContainerTooltipHandler {

	private mod_Waila waila = mod_Waila.instance;
	
	@Override
	public List<String> handleTooltipFirst(GuiContainer gui, int mousex, int mousey, List<String> currenttip) {
		return currenttip;
	}

	@Override
	public List<String> handleItemTooltip(GuiContainer gui, ItemStack itemstack, List<String> currenttip) {
		String canonicalName = waila.getModName(itemstack);
		if (canonicalName != null && !canonicalName.equals(""))
			currenttip.add("\u00a79\u00a7o" + canonicalName);
		return currenttip;
	}

}