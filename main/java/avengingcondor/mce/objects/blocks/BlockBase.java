package avengingcondor.mce.objects.blocks;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.BlockInit;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material, String tool, int harvest, float hardness, float resistance)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BASETAB);
		setHarvestLevel(tool, harvest);
		setHardness(hardness);
		setResistance(resistance);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");	
	}
}
