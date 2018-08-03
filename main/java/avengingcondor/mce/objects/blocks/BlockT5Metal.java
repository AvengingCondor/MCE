package avengingcondor.mce.objects.blocks;

import avengingcondor.mce.Main;
import avengingcondor.mce.init.BlockInit;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.objects.blocks.item.ItemBlockVariants;
import avengingcondor.mce.util.handlers.T5BlockEnumHandler;
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

public class BlockT5Metal extends Block implements IHasModel, IMetaName 
{
	
	public static final PropertyEnum<T5BlockEnumHandler.EnumType> VARIANT = PropertyEnum.<T5BlockEnumHandler.EnumType>create("variant", T5BlockEnumHandler.EnumType.class);
	private String name;
	
	public BlockT5Metal(String name)
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BASETAB);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, T5BlockEnumHandler.EnumType.sednum));
		setHarvestLevel("pickaxe", 16);
		setHardness(24f);
		setResistance(90f);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return ((T5BlockEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((T5BlockEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, T5BlockEnumHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(T5BlockEnumHandler.EnumType variant : T5BlockEnumHandler.EnumType.values())
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
		return T5BlockEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for (int i=0; i < T5BlockEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "block_" + T5BlockEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}
