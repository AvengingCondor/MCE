package avengingcondor.mce.util.handlers;

import avengingcondor.mce.init.BlockInit;
import avengingcondor.mce.init.ItemInit;
import avengingcondor.mce.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	@SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
    	ResourceLocation ironPick = new ResourceLocation("minecraft:iron_pickaxe");
    	ResourceLocation ironHelm = new ResourceLocation("minecraft:iron_helmet");
    	ResourceLocation ironChest = new ResourceLocation("minecraft:iron_chestplate");
    	ResourceLocation ironLegs = new ResourceLocation("minecraft:iron_leggings");
    	ResourceLocation ironBoots = new ResourceLocation("minecraft:iron_boots");
    	
    	ResourceLocation diamondPick = new ResourceLocation("minecraft:diamond_pickaxe");
    	ResourceLocation diamondAxe = new ResourceLocation("minecraft:diamond_axe");
    	ResourceLocation diamondHoe = new ResourceLocation("minecraft:diamond_hoe");
    	ResourceLocation diamondShovel = new ResourceLocation("minecraft:diamond_shovel");
    	ResourceLocation diamondSword = new ResourceLocation("minecraft:diamond_sword");
    	ResourceLocation diamondHelm = new ResourceLocation("minecraft:diamond_helmet");
    	ResourceLocation diamondChest = new ResourceLocation("minecraft:diamond_chestplate");
    	ResourceLocation diamondLegs = new ResourceLocation("minecraft:diamond_leggings");
    	ResourceLocation diamondBoots = new ResourceLocation("minecraft:diamond_boots");
    	
    	ResourceLocation goldPick = new ResourceLocation("minecraft:golden_pickaxe");
    	ResourceLocation goldAxe = new ResourceLocation("minecraft:golden_axe");
    	ResourceLocation goldHoe = new ResourceLocation("minecraft:golden_hoe");
    	ResourceLocation goldShovel = new ResourceLocation("minecraft:golden_shovel");
    	ResourceLocation goldSword = new ResourceLocation("minecraft:golden_sword");
    	ResourceLocation goldHelm = new ResourceLocation("minecraft:golden_helmet");
    	ResourceLocation goldChest = new ResourceLocation("minecraft:golden_chestplate");
    	ResourceLocation goldLegs = new ResourceLocation("minecraft:golden_leggings");
    	ResourceLocation goldBoots = new ResourceLocation("minecraft:golden_boots");
    	
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        modRegistry.remove(ironPick);
        modRegistry.remove(ironHelm);
        modRegistry.remove(ironChest);
        modRegistry.remove(ironLegs);
        modRegistry.remove(ironBoots);
        
        modRegistry.remove(diamondPick);
        modRegistry.remove(diamondAxe);
        modRegistry.remove(diamondHoe);
        modRegistry.remove(diamondShovel);
        modRegistry.remove(diamondSword);
        modRegistry.remove(diamondHelm);
        modRegistry.remove(diamondChest);
        modRegistry.remove(diamondLegs);
        modRegistry.remove(diamondBoots);
        
        modRegistry.remove(goldPick);
        modRegistry.remove(goldAxe);
        modRegistry.remove(goldHoe);
        modRegistry.remove(goldShovel);
        modRegistry.remove(goldSword);
        modRegistry.remove(goldHelm);
        modRegistry.remove(goldChest);
        modRegistry.remove(goldLegs);
        modRegistry.remove(goldBoots);
    }
}
