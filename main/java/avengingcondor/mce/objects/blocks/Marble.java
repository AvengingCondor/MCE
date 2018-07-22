package avengingcondor.mce.objects.blocks;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.BlockInit;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.objects.blocks.item.ItemBlockVariants;
import avengingcondor.mce.util.handlers.StoneEnumHandler;
import avengingcondor.mce.util.interfaces.IHasModel;
import avengingcondor.mce.util.interfaces.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Marble extends Block implements IHasModel, IMetaName 
{
	
	public static final PropertyEnum<StoneEnumHandler.EnumType> VARIANT = PropertyEnum.<StoneEnumHandler.EnumType>create("variant", StoneEnumHandler.EnumType.class);
	private String name;
	
	public Marble(String name)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BASETAB);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, StoneEnumHandler.EnumType.stone));
		setHarvestLevel("pickaxe", 8);
		setHardness(6.5f);
		setResistance(60f);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return ((StoneEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((StoneEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, StoneEnumHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(StoneEnumHandler.EnumType variant : StoneEnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName (ItemStack stack)
	{
		return StoneEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for (int i=0; i < StoneEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "marble_" + StoneEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		super.getDrops(drops, world, pos, state, fortune);
		if(this.getMetaFromState(state) == 0)
		{
			drops.clear();
			drops.add(new ItemStack(BlockInit.MARBLE, 1, 1));
		}
	}
}
