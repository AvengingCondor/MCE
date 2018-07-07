package avengingcondor.mce.tabs;

import avengingcondor.mce.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BasicTab extends CreativeTabs 
{
	public BasicTab(String label)
	{
		super("mcetabbasic");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.INGOT_COPPER); //change to copper ore when added: Item.getItemFromBlock(BlockInit.ORE_COPPER
	}
}
