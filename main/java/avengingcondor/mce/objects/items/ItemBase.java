package avengingcondor.mce.objects.items;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel
{
	private EnumRarity rarity;
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BASETAB);
		setRarity(EnumRarity.COMMON);
		
		ItemInit.ITEMS.add(this);
	}
	public ItemBase(String name, EnumRarity r)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BASETAB);
		setRarity(r);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
	public void setRarity(EnumRarity r)
	{
		this.rarity = r;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return rarity;	
	}
}
