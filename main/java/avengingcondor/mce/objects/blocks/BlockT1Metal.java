package avengingcondor.mce.objects.blocks;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.BlockInit;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.objects.blocks.item.ItemBlockVariants;
import avengingcondor.mce.util.handlers.T1BlockEnumHandler;
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
import net.minecraft.world.World;

public class BlockT1Metal extends Block implements IHasModel, IMetaName 
{
	
	public static final PropertyEnum<T1BlockEnumHandler.EnumType> VARIANT = PropertyEnum.<T1BlockEnumHandler.EnumType>create("variant", T1BlockEnumHandler.EnumType.class);
	private String name;
	
	public BlockT1Metal(String name)
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BASETAB);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, T1BlockEnumHandler.EnumType.copper));
		setHarvestLevel("pickaxe", 1);
		setHardness(5.0f);
		setResistance(30f);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return ((T1BlockEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((T1BlockEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, T1BlockEnumHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(T1BlockEnumHandler.EnumType variant : T1BlockEnumHandler.EnumType.values())
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
		return T1BlockEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for (int i=0; i < T1BlockEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "block_" + T1BlockEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}
