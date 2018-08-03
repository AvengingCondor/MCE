package avengingcondor.mce.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolAxe extends ItemAxe implements IHasModel
{
	private EnumRarity rarity;
	public ToolAxe(String name, ToolMaterial material, float attackDamage, float attackSpeed)
	{
		super(material, attackDamage, attackSpeed);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TOOLTAB);
		setRarity(EnumRarity.COMMON);
		
		ItemInit.ITEMS.add(this);
	}
	public ToolAxe(String name, ToolMaterial material, float attackDamage, float attackSpeed, EnumRarity r)
	{
		super(material, attackDamage, attackSpeed);
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
