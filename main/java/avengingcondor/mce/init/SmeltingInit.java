package avengingcondor.mce.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingInit 
{
	public static void init()
	{
		GameRegistry.addSmelting(BlockInit.ORE_COPPER, new ItemStack(ItemInit.INGOT_COPPER, 1), 0.5f);
		GameRegistry.addSmelting(BlockInit.ORE_ZINC, new ItemStack(ItemInit.INGOT_ZINC, 1), 0.5f);
		GameRegistry.addSmelting(BlockInit.ORE_TIN, new ItemStack(ItemInit.INGOT_TIN, 1), 0.7f);
		GameRegistry.addSmelting(BlockInit.ORE_IRON_MCE, new ItemStack(Items.IRON_INGOT, 1), 0.8f);
		GameRegistry.addSmelting(BlockInit.ORE_MANGANESE, new ItemStack(ItemInit.INGOT_MANGANESE, 1), 1.0f);
		GameRegistry.addSmelting(BlockInit.ORE_COBALT, new ItemStack(ItemInit.INGOT_COBALT, 1), 1.0f);
		GameRegistry.addSmelting(BlockInit.ORE_SILVER, new ItemStack(ItemInit.INGOT_SILVER, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.ORE_NYMPHIUM, new ItemStack(ItemInit.INGOT_NYMPHIUM, 1), 1.2f);
		GameRegistry.addSmelting(BlockInit.ORE_NICKEL, new ItemStack(ItemInit.INGOT_NICKEL, 1), 1.2f);
	}
	
}
