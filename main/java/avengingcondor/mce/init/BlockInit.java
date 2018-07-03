package avengingcondor.mce.init;

import java.util.ArrayList;
import java.util.List;

import avengingcondor.mce.objects.blocks.BlockBase;
import avengingcondor.mce.objects.blocks.BlockT1Metal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_T1METAL = new BlockT1Metal("block_t1metal", Material.IRON);
}
