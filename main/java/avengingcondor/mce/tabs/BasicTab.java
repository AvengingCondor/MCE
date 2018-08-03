package avengingcondor.mce.tabs;

import avengingcondor.mce.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasicTab extends CreativeTabs 
{
	public BasicTab(String label)
	{
		super("mcetabbasic");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Item.getItemFromBlock(BlockInit.ORE_COPPER));
	}
}
