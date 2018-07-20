package avengingcondor.mce.init;

import java.util.ArrayList;
import java.util.List;

import avengingcondor.mce.objects.blocks.BlockBase;
import avengingcondor.mce.objects.blocks.BlockT1Metal;
import avengingcondor.mce.objects.blocks.BlockT2Metal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//metal
	public static final Block BLOCK_T1METAL = new BlockT1Metal("block_t1metal", Material.IRON);
	public static final Block BLOCK_T2METAL = new BlockT2Metal("block_t2metal", Material.IRON);
	
	//ore
	public static final Block ORE_COPPER = new BlockBase("ore_copper", Material.ROCK, "pickaxe", 1, 3.0f, 15f);
	public static final Block ORE_ZINC = new BlockBase("ore_zinc", Material.ROCK, "pickaxe", 1, 2.5f, 12f);
	public static final Block ORE_TIN = new BlockBase("ore_tin", Material.ROCK, "pickaxe", 2, 3.5f, 15f);
	public static final Block ORE_IRON_MCE = new BlockBase("ore_iron_mce", Material.ROCK, "pickaxe", 3, 4.0f, 15f);
	public static final Block ORE_MANGANESE = new BlockBase("ore_manganese", Material.ROCK, "pickaxe", 4, 4.8f, 30f);
	public static final Block ORE_COBALT = new BlockBase("ore_cobalt", Material.ROCK, "pickaxe", 5, 5.2f, 30f);
	public static final Block ORE_SILVER = new BlockBase("ore_silver", Material.ROCK, "pickaxe", 6, 5.0f, 30f);
	public static final Block ORE_NYMPHIUM = new BlockBase("ore_nymphium", Material.ROCK, "pickaxe", 6, 5.5f, 30f);
	public static final Block ORE_NICKEL = new BlockBase("ore_nickel", Material.ROCK, "pickaxe", 7, 6.2f, 30f);
}
