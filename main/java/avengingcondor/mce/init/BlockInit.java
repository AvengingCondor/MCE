package avengingcondor.mce.init;

import java.util.ArrayList;
import java.util.List;

import avengingcondor.mce.objects.blocks.BlockBase;
import avengingcondor.mce.objects.blocks.BlockT1Metal;
import avengingcondor.mce.objects.blocks.BlockT2Metal;
import avengingcondor.mce.objects.blocks.BlockT3Metal;
import avengingcondor.mce.objects.blocks.BlockT4Metal;
import avengingcondor.mce.objects.blocks.Dolostone;
import avengingcondor.mce.objects.blocks.Limestone;
import avengingcondor.mce.objects.blocks.Marble;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//metal
	public static final Block BLOCK_T1METAL = new BlockT1Metal("block_t1metal");
	public static final Block BLOCK_T2METAL = new BlockT2Metal("block_t2metal");
	public static final Block BLOCK_T3METAL = new BlockT3Metal("block_t3metal");
	public static final Block BLOCK_T4METAL = new BlockT4Metal("block_t4metal");
	
	//stone
	public static final Block DOLOSTONE = new Dolostone("dolostone");
	public static final Block MARBLE = new Marble("marble");
	public static final Block LIMESTONE = new Limestone("limestone");
	
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
	public static final Block ORE_PERSITE = new BlockBase("ore_persite", Material.ROCK, "pickaxe", 8, 7.0f, 45f);
	public static final Block ORE_GOLD_MCE = new BlockBase("ore_gold_mce", Material.ROCK, "pickaxe", 9, 7.8f, 45f);
	public static final Block ORE_NEZMINE = new BlockBase("ore_nezmine", Material.ROCK, "pickaxe", 9, 7.5f, 45f);
	public static final Block ORE_EPRESE = new BlockBase("ore_eprese", Material.ROCK, "pickaxe", 10, 8.2f, 45f);
	public static final Block ORE_MITHRIL = new BlockBase("ore_mithril", Material.ROCK, "pickaxe", 11, 9.0f, 45f);
	public static final Block ORE_GILDRIUM = new BlockBase("ore_gildrium", Material.ROCK, "pickaxe", 12, 10.2f, 60f);
	public static final Block ORE_DENDRITE = new BlockBase("ore_dendrite", Material.ROCK, "pickaxe", 13, 11.0f, 60f);
	public static final Block ORE_ORICHALCUM = new BlockBase("ore_orichalcum", Material.ROCK, "pickaxe", 14, 12.2f, 60f);
	public static final Block ORE_AERITE = new BlockBase("ore_aerite", Material.ROCK, "pickaxe", 15, 13.0f, 60f);
	public static final Block ORE_PALLADIUM = new BlockBase("ore_palladium", Material.ROCK, "pickaxe", 15, 12.6f, 60f);
}
