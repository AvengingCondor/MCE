package avengingcondor.mce.objects.tools;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.util.interfaces.IHasModel;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ToolShovel extends ItemSpade implements IHasModel 
{
	private EnumRarity rarity;
	public ToolShovel(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TOOLTAB);
		setRarity(EnumRarity.UNCOMMON);
		
		ItemInit.ITEMS.add(this);
	}
	public ToolShovel(String name, ToolMaterial material, EnumRarity r)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TOOLTAB);
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
