package avengingcondor.mce.init;

import avengingcondor.mce.util.handlers.StoneEnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyEnum;
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
		GameRegistry.addSmelting(BlockInit.ORE_PERSITE, new ItemStack(ItemInit.INGOT_PERSITE, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.ORE_NEZMINE, new ItemStack(ItemInit.INGOT_NEZMINE, 1), 1.8f);
		GameRegistry.addSmelting(BlockInit.ORE_GOLD_MCE, new ItemStack(Items.GOLD_INGOT, 1), 2.5f);
		GameRegistry.addSmelting(BlockInit.ORE_EPRESE, new ItemStack(ItemInit.INGOT_EPRESE, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.ORE_MITHRIL, new ItemStack(ItemInit.INGOT_MITHRIL, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.ORE_GILDRIUM, new ItemStack(ItemInit.INGOT_GILDRIUM, 1), 2.2f);
		GameRegistry.addSmelting(BlockInit.ORE_DENDRITE, new ItemStack(ItemInit.INGOT_DENDRITE, 1), 2.5f);
		GameRegistry.addSmelting(BlockInit.ORE_ORICHALCUM, new ItemStack(ItemInit.INGOT_ORICHALCUM, 1), 2.8f);
		GameRegistry.addSmelting(BlockInit.ORE_AERITE, new ItemStack(ItemInit.INGOT_AERITE, 1), 2.8f);
		GameRegistry.addSmelting(BlockInit.ORE_PALLADIUM, new ItemStack(ItemInit.INGOT_PALLADIUM, 1), 3.5f);
		GameRegistry.addSmelting(BlockInit.ORE_SEDNUM, new ItemStack(ItemInit.INGOT_SEDNUM, 1), 3.8f);
		GameRegistry.addSmelting(BlockInit.ORE_COLOVITE, new ItemStack(ItemInit.INGOT_COLOVITE, 1), 3.8f);
		GameRegistry.addSmelting(BlockInit.ORE_PLATINUM, new ItemStack(ItemInit.INGOT_PLATINUM, 1), 5.0f);
		GameRegistry.addSmelting(BlockInit.ORE_BREYCALT, new ItemStack(ItemInit.INGOT_BREYCALT, 1), 4.5f);
		GameRegistry.addSmelting(BlockInit.ORE_FOTITE, new ItemStack(ItemInit.INGOT_FOTITE, 1), 5.8f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.DOLOSTONE, 1, 1), new ItemStack(BlockInit.DOLOSTONE, 1, 0), 0.1f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.MARBLE, 1, 1), new ItemStack(BlockInit.MARBLE, 1, 0), 0.2f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LIMESTONE, 1, 1), new ItemStack(BlockInit.LIMESTONE, 1, 0), 0.2f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.BASALT, 1, 1), new ItemStack(BlockInit.BASALT, 1, 0), 0.3f);
	}
	
}
