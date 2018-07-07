package avengingcondor.mce.tabs;

import avengingcondor.mce.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs 
{
	public ToolTab(String label)
	{
		super("mcetabtool");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.PICKAXE_COPPER); //change to copper pick when added
	}
}
