package avengingcondor.mce.util.compat;

import avengingcondor.mce.init.BlockInit;
import avengingcondor.mce.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class oreDictionaryCompat 
{
	public static void registerOres()
	{
		//Only doing real life metals that might actually be in other mods for now, not sure if theres a point in oredicting stuff that will definitely only be in this mod
		//ores
		OreDictionary.registerOre("oreCopper", BlockInit.ORE_COPPER);
		OreDictionary.registerOre("oreTin", BlockInit.ORE_TIN);
		OreDictionary.registerOre("oreZinc", BlockInit.ORE_ZINC);
		OreDictionary.registerOre("oreManganese", BlockInit.ORE_MANGANESE);
		OreDictionary.registerOre("oreCobalt", BlockInit.ORE_COBALT);
		OreDictionary.registerOre("oreSilver", BlockInit.ORE_SILVER);
		OreDictionary.registerOre("oreNickel", BlockInit.ORE_NICKEL);
		OreDictionary.registerOre("orePalladium", BlockInit.ORE_PALLADIUM);
		OreDictionary.registerOre("orePlatinum", BlockInit.ORE_PLATINUM);
		
		//ingots
		OreDictionary.registerOre("ingotCopper", ItemInit.INGOT_COPPER);
		OreDictionary.registerOre("ingotTin", ItemInit.INGOT_TIN);
		OreDictionary.registerOre("ingotBronze", ItemInit.INGOT_BRONZE);
		OreDictionary.registerOre("ingotZinc", ItemInit.INGOT_ZINC);
		OreDictionary.registerOre("ingotBrass", ItemInit.INGOT_BRASS);
		OreDictionary.registerOre("ingotManganese", ItemInit.INGOT_MANGANESE);
		OreDictionary.registerOre("ingotSteel", ItemInit.INGOT_STEEL);
		OreDictionary.registerOre("ingotCobalt", ItemInit.INGOT_COBALT);
		OreDictionary.registerOre("ingotSilver", ItemInit.INGOT_SILVER);
		OreDictionary.registerOre("ingotNickel", ItemInit.INGOT_NICKEL);
		OreDictionary.registerOre("ingotRoseGold", ItemInit.INGOT_ROSEGOLD);
		OreDictionary.registerOre("ingotPalladium", ItemInit.INGOT_PALLADIUM);
		OreDictionary.registerOre("ingotPlatinum", ItemInit.INGOT_PLATINUM);
		
		//other blocks
	}
}
