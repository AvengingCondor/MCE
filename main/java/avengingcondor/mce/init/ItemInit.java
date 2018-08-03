package avengingcondor.mce.init;

import java.util.ArrayList;
import java.util.List;

import avengingcondor.mce.objects.armor.ArmorBase;
import avengingcondor.mce.objects.items.IncompleteAlloy;
import avengingcondor.mce.objects.items.ItemBase;
import avengingcondor.mce.objects.tools.ToolAxe;
import avengingcondor.mce.objects.tools.ToolHoe;
import avengingcondor.mce.objects.tools.ToolPickaxe;
import avengingcondor.mce.objects.tools.ToolShovel;
import avengingcondor.mce.objects.tools.ToolSword;
import avengingcondor.mce.util.Reference;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//ingots
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_TIN = new ItemBase("ingot_tin");
	public static final Item INGOT_BRONZE = new ItemBase("ingot_bronze");
	public static final Item INGOT_ZINC = new ItemBase("ingot_zinc");
	public static final Item INGOT_BRASS = new ItemBase("ingot_brass");
	public static final Item INGOT_MANGANESE = new ItemBase("ingot_manganese");
	public static final Item INGOT_STEEL = new ItemBase("ingot_steel");
	public static final Item INGOT_COBALT = new ItemBase("ingot_cobalt");
	public static final Item INGOT_SILVER = new ItemBase("ingot_silver");
	public static final Item INGOT_NYMPHIUM = new ItemBase("ingot_nymphium");
	public static final Item INGOT_XOLGITE = new ItemBase("ingot_xolgite");
	public static final Item INGOT_NICKEL = new ItemBase("ingot_nickel");
	public static final Item INGOT_OROGATE = new ItemBase("ingot_orogate");
	public static final Item INGOT_PERSITE = new ItemBase("ingot_persite");
	public static final Item INGOT_NEZMINE = new ItemBase("ingot_nezmine");
	public static final Item INGOT_ROSEGOLD = new IncompleteAlloy("ingot_rosegold");
	public static final Item INGOT_LORITE = new ItemBase("ingot_lorite");
	public static final Item INGOT_EPRESE = new ItemBase("ingot_eprese");
	public static final Item INGOT_DUON = new IncompleteAlloy("ingot_duon");
	public static final Item INGOT_HYDRIS = new ItemBase("ingot_hydris");
	public static final Item INGOT_MITHRIL = new ItemBase("ingot_mithril");
	public static final Item INGOT_GILDRIUM = new ItemBase("ingot_gildrium");
	public static final Item INGOT_DENDRITE = new ItemBase("ingot_dendrite");
	public static final Item INGOT_HALIC = new IncompleteAlloy("ingot_halic");
	public static final Item INGOT_BERYX = new ItemBase("ingot_beryx");
	public static final Item INGOT_ORICHALCUM = new ItemBase("ingot_orichalcum");
	public static final Item INGOT_AERITE = new ItemBase("ingot_aerite");
	public static final Item INGOT_PALLADIUM = new ItemBase("ingot_palladium");
	public static final Item INGOT_WHITEGOLD = new ItemBase("ingot_whitegold");
	public static final Item INGOT_MANIUM = new IncompleteAlloy("ingot_manium");
	public static final Item INGOT_ALVIUM = new ItemBase("ingot_alvium");
	public static final Item INGOT_SEDNUM = new ItemBase("ingot_sednum");
	public static final Item INGOT_COLOVITE = new ItemBase("ingot_colovite");
	public static final Item INGOT_NESYN = new IncompleteAlloy("ingot_nesyn");
	public static final Item INGOT_PLATINUM = new ItemBase("ingot_platinum");
	public static final Item INGOT_KRONITE = new ItemBase("ingot_kronite", EnumRarity.UNCOMMON);
	public static final Item INGOT_BREYCALT = new ItemBase("ingot_breycalt");
	public static final Item INGOT_SELINE = new IncompleteAlloy("ingot_seline");
	public static final Item INGOT_MAKRINE = new ItemBase("ingot_makrine", EnumRarity.UNCOMMON);
	public static final Item INGOT_FOTITE = new ItemBase("ingot_fotite");
	public static final Item INGOT_PRIMIGON = new IncompleteAlloy("ingot_primigon");
	public static final Item INGOT_PROMETHITE = new IncompleteAlloy("ingot_promethite");
	public static final Item INGOT_PROMETHIUM = new ItemBase("ingot_promethium", EnumRarity.UNCOMMON);
	
	//material
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 4.7f, 1.0f, 10).setRepairItem(new ItemStack(ItemInit.INGOT_COPPER));
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 8, new int[] {2,3,3,1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f).setRepairItem(new ItemStack(ItemInit.INGOT_COPPER));
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("tool_bronze", 3, 214, 5.5f, 1.5f, 15).setRepairItem(new ItemStack(ItemInit.INGOT_BRONZE));
	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("armor_bronze", Reference.MODID + ":bronze", 12, new int[] {2,3,3,1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f).setRepairItem(new ItemStack(ItemInit.INGOT_BRONZE));
	public static final ToolMaterial TOOL_IRON_MCE = EnumHelper.addToolMaterial("tool_iron_mce", 4, 251, 6.0f, 2f, 14).setRepairItem(new ItemStack(Items.IRON_INGOT));
	public static final ArmorMaterial ARMOR_IRON_MCE = EnumHelper.addArmorMaterial("armor_iron_mce", "minecraft:iron", 15, new int[] {2,3,3,1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f).setRepairItem(new ItemStack(Items.IRON_INGOT));
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 5, 500, 6.2f, 2.0f, 10).setRepairItem(new ItemStack(ItemInit.INGOT_STEEL));
	public static final ArmorMaterial ARMOR_STEEL = EnumHelper.addArmorMaterial("armor_steel", Reference.MODID + ":steel", 20, new int[] {2,3,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f).setRepairItem(new ItemStack(ItemInit.INGOT_STEEL));
	public static final ToolMaterial TOOL_COBALT = EnumHelper.addToolMaterial("tool_cobalt", 6, 723, 6.8f, 2.5f, 15).setRepairItem(new ItemStack(ItemInit.INGOT_COBALT));
	public static final ArmorMaterial ARMOR_COBALT = EnumHelper.addArmorMaterial("armor_cobalt", Reference.MODID + ":cobalt", 24, new int[] {2, 3, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f).setRepairItem(new ItemStack(ItemInit.INGOT_COBALT));
	public static final ToolMaterial TOOL_XOLGITE = EnumHelper.addToolMaterial("tool_xolgite", 7, 900, 7.0f, 2.5f, 18).setRepairItem(new ItemStack(ItemInit.INGOT_XOLGITE));
	public static final ArmorMaterial ARMOR_XOLGITE = EnumHelper.addArmorMaterial("armor_xolgite", Reference.MODID + ":xolgite", 30, new int[] {2,3,5,2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f).setRepairItem(new ItemStack(ItemInit.INGOT_XOLGITE));
	public static final ToolMaterial TOOL_OROGATE = EnumHelper.addToolMaterial("tool_orogate", 8, 1250, 7.5f, 3.0f, 12).setRepairItem(new ItemStack(ItemInit.INGOT_OROGATE));
	public static final ArmorMaterial ARMOR_OROGATE = EnumHelper.addArmorMaterial("armor_orogate", Reference.MODID + ":orogate", 30, new int[] {2, 3, 5, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f).setRepairItem(new ItemStack(ItemInit.INGOT_OROGATE));
	public static final ToolMaterial TOOL_PERSITE = EnumHelper.addToolMaterial("tool_persite", 9, 1716, 8.5f, 3.5f, 14).setRepairItem(new ItemStack(ItemInit.INGOT_PERSITE));
	public static final ArmorMaterial ARMOR_PERSITE = EnumHelper.addArmorMaterial("armor_persite", Reference.MODID + ":persite", 35, new int[] {3, 4, 6, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0f).setRepairItem(new ItemStack(ItemInit.INGOT_PERSITE));
	public static final ToolMaterial TOOL_LORITE = EnumHelper.addToolMaterial("tool_lorite", 10, 1800, 9.0f, 3.5f, 20).setRepairItem(new ItemStack(ItemInit.INGOT_LORITE));
	public static final ArmorMaterial ARMOR_LORITE = EnumHelper.addArmorMaterial("armor_lorite", Reference.MODID + ":lorite", 35, new int[] {3, 4, 6, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0f).setRepairItem(new ItemStack(ItemInit.INGOT_LORITE));
	public static final ToolMaterial TOOL_HYDRIS = EnumHelper.addToolMaterial("tool_hydris", 11, 2200, 9.0f, 4.0f, 16).setRepairItem(new ItemStack(ItemInit.INGOT_HYDRIS));
	public static final ArmorMaterial ARMOR_HYDRIS = EnumHelper.addArmorMaterial("armor_hydris", Reference.MODID + ":hydris", 42, new int[] {3, 4, 6, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0f).setRepairItem(new ItemStack(ItemInit.INGOT_HYDRIS));
	public static final ToolMaterial TOOL_MITHRIL = EnumHelper.addToolMaterial("tool_mithril", 12, 2176, 10.5f, 6.0f, 25).setRepairItem(new ItemStack(ItemInit.INGOT_MITHRIL));
	public static final ArmorMaterial ARMOR_MITHRIL = EnumHelper.addArmorMaterial("armor_mithril", Reference.MODID + ":mithril", 42, new int[] {3, 4, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0f).setRepairItem(new ItemStack(ItemInit.INGOT_MITHRIL));
	public static final ToolMaterial TOOL_GILDRIUM = EnumHelper.addToolMaterial("tool_gildrium", 13, 2345, 11f, 8.0f, 22).setRepairItem(new ItemStack(ItemInit.INGOT_GILDRIUM));
	public static final ArmorMaterial ARMOR_GILDRIUM = EnumHelper.addArmorMaterial("armor_gildrium", Reference.MODID + ":gildrium", 42, new int[] {3, 5, 7, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0f).setRepairItem(new ItemStack(ItemInit.INGOT_GILDRIUM));
	public static final ToolMaterial TOOL_BERYX = EnumHelper.addToolMaterial("tool_beryx", 14, 2532, 11.5f, 9.0f, 14).setRepairItem(new ItemStack(ItemInit.INGOT_BERYX));
	public static final ArmorMaterial ARMOR_BERYX = EnumHelper.addArmorMaterial("armor_beryx", Reference.MODID + ":beryx", 45, new int[] {3, 5, 7, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0f).setRepairItem(new ItemStack(ItemInit.INGOT_BERYX));
	public static final ToolMaterial TOOL_ORICHALCUM = EnumHelper.addToolMaterial("tool_orichalcum", 15, 2808, 12f, 10.0f, 16).setRepairItem(new ItemStack(ItemInit.INGOT_ORICHALCUM));
	public static final ArmorMaterial ARMOR_ORICHALCUM = EnumHelper.addArmorMaterial("armor_orichalcum", Reference.MODID + ":orichalcum", 45, new int[] {3, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0f).setRepairItem(new ItemStack(ItemInit.INGOT_ORICHALCUM));
	public static final ToolMaterial TOOL_ALVIUM = EnumHelper.addToolMaterial("tool_alvium", 16, 3102, 13f, 13.0f, 14).setRepairItem(new ItemStack(ItemInit.INGOT_ALVIUM));
	public static final ArmorMaterial ARMOR_ALVIUM = EnumHelper.addArmorMaterial("armor_alvium", Reference.MODID + ":alvium", 48, new int[] {3, 5, 7, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0f).setRepairItem(new ItemStack(ItemInit.INGOT_ALVIUM));
	public static final ToolMaterial TOOL_KRONITE = EnumHelper.addToolMaterial("tool_kronite", 17, 3280, 14f, 14.0f, 14).setRepairItem(new ItemStack(ItemInit.INGOT_KRONITE));
	public static final ArmorMaterial ARMOR_KRONITE = EnumHelper.addArmorMaterial("armor_kronite", Reference.MODID + ":kronite", 50, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f).setRepairItem(new ItemStack(ItemInit.INGOT_KRONITE));
	public static final ToolMaterial TOOL_MAKRINE = EnumHelper.addToolMaterial("tool_makrine", 18, 3820, 14.5f, 15.0f, 10).setRepairItem(new ItemStack(ItemInit.INGOT_MAKRINE));
	public static final ArmorMaterial ARMOR_MAKRINE = EnumHelper.addArmorMaterial("armor_makrine", Reference.MODID + ":makrine", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f).setRepairItem(new ItemStack(ItemInit.INGOT_MAKRINE));
	public static final ToolMaterial TOOL_PROMETHIUM = EnumHelper.addToolMaterial("tool_promethium", 19, 5000, 16f, 16.0f, 15).setRepairItem(new ItemStack(ItemInit.INGOT_PROMETHIUM));
	public static final ArmorMaterial ARMOR_PROMETHIUM = EnumHelper.addArmorMaterial("armor_promethium", Reference.MODID + ":promethium", 60, new int[] {4, 7, 10, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5f).setRepairItem(new ItemStack(ItemInit.INGOT_PROMETHIUM));
	
	//tools
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER, 7.0f, -3.2f);//lower(or raise I guess cause negative) second number by .1 each tier until they're at 3.0, maybe fuck with these later if I want, first number is the damage dealt by the axe-1
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	public static final Item AXE_BRONZE = new ToolAxe("axe_bronze", TOOL_BRONZE, 7.0f, -3.2f);
	public static final Item PICKAXE_BRONZE = new ToolPickaxe("pickaxe_bronze", TOOL_BRONZE);
	public static final Item HOE_BRONZE = new ToolHoe("hoe_bronze", TOOL_BRONZE);
	public static final Item SHOVEL_BRONZE = new ToolShovel("shovel_bronze", TOOL_BRONZE);
	public static final Item SWORD_BRONZE = new ToolSword("sword_bronze", TOOL_BRONZE);
	public static final Item PICKAXE_IRON_MCE = new ToolPickaxe("pickaxe_iron_mce", TOOL_IRON_MCE);
	public static final Item AXE_STEEL = new ToolAxe("axe_steel", TOOL_STEEL, 8.0f, -3.1f);
	public static final Item PICKAXE_STEEL = new ToolPickaxe("pickaxe_steel", TOOL_STEEL);
	public static final Item HOE_STEEL = new ToolHoe("hoe_steel", TOOL_STEEL);
	public static final Item SHOVEL_STEEL = new ToolShovel("shovel_steel", TOOL_STEEL);
	public static final Item SWORD_STEEL = new ToolSword("sword_steel", TOOL_STEEL);
	public static final Item AXE_COBALT = new ToolAxe("axe_cobalt", TOOL_COBALT, 8.5f, -3.1f);
	public static final Item PICKAXE_COBALT = new ToolPickaxe("pickaxe_cobalt", TOOL_COBALT);
	public static final Item HOE_COBALT = new ToolHoe("hoe_cobalt", TOOL_COBALT);
	public static final Item SHOVEL_COBALT = new ToolShovel("shovel_cobalt", TOOL_COBALT);
	public static final Item SWORD_COBALT = new ToolSword("sword_cobalt", TOOL_COBALT);
	public static final Item AXE_XOLGITE = new ToolAxe("axe_xolgite", TOOL_XOLGITE, 8.5f, -3.1f);
	public static final Item PICKAXE_XOLGITE = new ToolPickaxe("pickaxe_xolgite", TOOL_XOLGITE);
	public static final Item HOE_XOLGITE = new ToolHoe("hoe_xolgite", TOOL_XOLGITE);
	public static final Item SHOVEL_XOLGITE = new ToolShovel("shovel_xolgite", TOOL_XOLGITE);
	public static final Item SWORD_XOLGITE = new ToolSword("sword_xolgite", TOOL_XOLGITE);
	public static final Item AXE_OROGATE = new ToolAxe("axe_orogate", TOOL_OROGATE, 9.0f, -3.1f);
	public static final Item PICKAXE_OROGATE = new ToolPickaxe("pickaxe_orogate", TOOL_OROGATE);
	public static final Item HOE_OROGATE = new ToolHoe("hoe_orogate", TOOL_OROGATE);
	public static final Item SHOVEL_OROGATE = new ToolShovel("shovel_orogate", TOOL_OROGATE);
	public static final Item SWORD_OROGATE = new ToolSword("sword_orogate", TOOL_OROGATE);
	public static final Item AXE_PERSITE = new ToolAxe("axe_persite", TOOL_PERSITE, 9.0f, -3.0f);
	public static final Item PICKAXE_PERSITE = new ToolPickaxe("pickaxe_persite", TOOL_PERSITE);
	public static final Item HOE_PERSITE = new ToolHoe("hoe_persite", TOOL_PERSITE);
	public static final Item SHOVEL_PERSITE = new ToolShovel("shovel_persite", TOOL_PERSITE);
	public static final Item SWORD_PERSITE = new ToolSword("sword_persite", TOOL_PERSITE);
	public static final Item AXE_LORITE = new ToolAxe("axe_lorite", TOOL_LORITE, 9.5f, -3.0f);
	public static final Item PICKAXE_LORITE = new ToolPickaxe("pickaxe_lorite", TOOL_LORITE);
	public static final Item HOE_LORITE = new ToolHoe("hoe_lorite", TOOL_LORITE);
	public static final Item SHOVEL_LORITE = new ToolShovel("shovel_lorite", TOOL_LORITE);
	public static final Item SWORD_LORITE = new ToolSword("sword_lorite", TOOL_LORITE);
	public static final Item AXE_HYDRIS = new ToolAxe("axe_hydris", TOOL_HYDRIS, 9.5f, -3.0f);
	public static final Item PICKAXE_HYDRIS = new ToolPickaxe("pickaxe_hydris", TOOL_HYDRIS);
	public static final Item HOE_HYDRIS = new ToolHoe("hoe_hydris", TOOL_HYDRIS);
	public static final Item SHOVEL_HYDRIS = new ToolShovel("shovel_hydris", TOOL_HYDRIS);
	public static final Item SWORD_HYDRIS = new ToolSword("sword_hydris", TOOL_HYDRIS);
	public static final Item AXE_MITHRIL = new ToolAxe("axe_mithril", TOOL_MITHRIL, 10.0f, -3.0f);
	public static final Item PICKAXE_MITHRIL = new ToolPickaxe("pickaxe_mithril", TOOL_MITHRIL);
	public static final Item HOE_MITHRIL = new ToolHoe("hoe_mithril", TOOL_MITHRIL);
	public static final Item SHOVEL_MITHRIL = new ToolShovel("shovel_mithril", TOOL_MITHRIL);
	public static final Item SWORD_MITHRIL = new ToolSword("sword_mithril", TOOL_MITHRIL);
	public static final Item AXE_GILDRIUM = new ToolAxe("axe_gildrium", TOOL_GILDRIUM, 10.0f, -3.0f);
	public static final Item PICKAXE_GILDRIUM = new ToolPickaxe("pickaxe_gildrium", TOOL_GILDRIUM);
	public static final Item HOE_GILDRIUM = new ToolHoe("hoe_gildrium", TOOL_GILDRIUM);
	public static final Item SHOVEL_GILDRIUM = new ToolShovel("shovel_gildrium", TOOL_GILDRIUM);
	public static final Item SWORD_GILDRIUM = new ToolSword("sword_gildrium", TOOL_GILDRIUM);
	public static final Item AXE_BERYX = new ToolAxe("axe_beryx", TOOL_BERYX, 11.0f, -3.0f);
	public static final Item PICKAXE_BERYX = new ToolPickaxe("pickaxe_beryx", TOOL_BERYX);
	public static final Item HOE_BERYX = new ToolHoe("hoe_beryx", TOOL_BERYX);
	public static final Item SHOVEL_BERYX = new ToolShovel("shovel_beryx", TOOL_BERYX);
	public static final Item SWORD_BERYX = new ToolSword("sword_beryx", TOOL_BERYX);
	public static final Item AXE_ORICHALCUM = new ToolAxe("axe_orichalcum", TOOL_ORICHALCUM, 11.0f, -3.0f);
	public static final Item PICKAXE_ORICHALCUM = new ToolPickaxe("pickaxe_orichalcum", TOOL_ORICHALCUM);
	public static final Item HOE_ORICHALCUM = new ToolHoe("hoe_orichalcum", TOOL_ORICHALCUM);
	public static final Item SHOVEL_ORICHALCUM = new ToolShovel("shovel_orichalcum", TOOL_ORICHALCUM);
	public static final Item SWORD_ORICHALCUM = new ToolSword("sword_orichalcum", TOOL_ORICHALCUM);
	public static final Item AXE_ALVIUM = new ToolAxe("axe_alvium", TOOL_ALVIUM, 12.0f, -3.0f);
	public static final Item PICKAXE_ALVIUM = new ToolPickaxe("pickaxe_alvium", TOOL_ALVIUM);
	public static final Item HOE_ALVIUM = new ToolHoe("hoe_alvium", TOOL_ALVIUM);
	public static final Item SHOVEL_ALVIUM = new ToolShovel("shovel_alvium", TOOL_ALVIUM);
	public static final Item SWORD_ALVIUM = new ToolSword("sword_alvium", TOOL_ALVIUM);
	public static final Item AXE_KRONITE = new ToolAxe("axe_kronite", TOOL_KRONITE, 14.0f, -3.0f, EnumRarity.UNCOMMON);
	public static final Item PICKAXE_KRONITE = new ToolPickaxe("pickaxe_kronite", TOOL_KRONITE, EnumRarity.UNCOMMON);
	public static final Item HOE_KRONITE = new ToolHoe("hoe_kronite", TOOL_KRONITE, EnumRarity.UNCOMMON);
	public static final Item SHOVEL_KRONITE = new ToolShovel("shovel_kronite", TOOL_KRONITE, EnumRarity.UNCOMMON);
	public static final Item SWORD_KRONITE = new ToolSword("sword_kronite", TOOL_KRONITE, EnumRarity.UNCOMMON);
	public static final Item AXE_MAKRINE = new ToolAxe("axe_makrine", TOOL_MAKRINE, 14.0f, -3.0f, EnumRarity.UNCOMMON);
	public static final Item PICKAXE_MAKRINE = new ToolPickaxe("pickaxe_makrine", TOOL_MAKRINE, EnumRarity.UNCOMMON);
	public static final Item HOE_MAKRINE = new ToolHoe("hoe_makrine", TOOL_MAKRINE, EnumRarity.UNCOMMON);
	public static final Item SHOVEL_MAKRINE = new ToolShovel("shovel_makrine", TOOL_MAKRINE, EnumRarity.UNCOMMON);
	public static final Item SWORD_MAKRINE = new ToolSword("sword_makrine", TOOL_MAKRINE, EnumRarity.UNCOMMON);
	public static final Item AXE_PROMETHIUM = new ToolAxe("axe_promethium", TOOL_PROMETHIUM, 14.0f, -3.0f, EnumRarity.UNCOMMON);
	public static final Item PICKAXE_PROMETHIUM = new ToolPickaxe("pickaxe_promethium", TOOL_PROMETHIUM, EnumRarity.UNCOMMON);
	public static final Item HOE_PROMETHIUM = new ToolHoe("hoe_promethium", TOOL_PROMETHIUM, EnumRarity.UNCOMMON);
	public static final Item SHOVEL_PROMETHIUM = new ToolShovel("shovel_promethium", TOOL_PROMETHIUM, EnumRarity.UNCOMMON);
	public static final Item SWORD_PROMETHIUM = new ToolSword("sword_promethium", TOOL_PROMETHIUM, EnumRarity.UNCOMMON);
	
	
	//armor
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_BRONZE = new ArmorBase("boots_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_BRONZE = new ArmorBase("leggings_bronze", ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_BRONZE = new ArmorBase("chestplate_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_BRONZE = new ArmorBase("helmet_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_IRON_MCE = new ArmorBase("boots_iron_mce", ARMOR_IRON_MCE, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_IRON_MCE = new ArmorBase("leggings_iron_mce", ARMOR_IRON_MCE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_IRON_MCE = new ArmorBase("chestplate_iron_mce", ARMOR_IRON_MCE, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_IRON_MCE = new ArmorBase("helmet_iron_mce", ARMOR_IRON_MCE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_STEEL = new ArmorBase("boots_steel", ARMOR_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_STEEL = new ArmorBase("leggings_steel", ARMOR_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_STEEL = new ArmorBase("chestplate_steel", ARMOR_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_STEEL = new ArmorBase("helmet_steel", ARMOR_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_COBALT = new ArmorBase("boots_cobalt", ARMOR_COBALT, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_COBALT = new ArmorBase("leggings_cobalt", ARMOR_COBALT, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_COBALT = new ArmorBase("chestplate_cobalt", ARMOR_COBALT, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_COBALT = new ArmorBase("helmet_cobalt", ARMOR_COBALT, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_XOLGITE = new ArmorBase("boots_xolgite", ARMOR_XOLGITE, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_XOLGITE = new ArmorBase("leggings_xolgite", ARMOR_XOLGITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_XOLGITE = new ArmorBase("chestplate_xolgite", ARMOR_XOLGITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_XOLGITE = new ArmorBase("helmet_xolgite", ARMOR_XOLGITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_OROGATE = new ArmorBase("boots_orogate", ARMOR_OROGATE, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_OROGATE = new ArmorBase("leggings_orogate", ARMOR_OROGATE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_OROGATE = new ArmorBase("chestplate_orogate", ARMOR_OROGATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_OROGATE = new ArmorBase("helmet_orogate", ARMOR_OROGATE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_PERSITE = new ArmorBase("boots_persite", ARMOR_PERSITE, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_PERSITE = new ArmorBase("leggings_persite", ARMOR_PERSITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_PERSITE = new ArmorBase("chestplate_persite", ARMOR_PERSITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_PERSITE = new ArmorBase("helmet_persite", ARMOR_PERSITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_LORITE = new ArmorBase("boots_lorite", ARMOR_LORITE, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_LORITE = new ArmorBase("leggings_lorite", ARMOR_LORITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_LORITE = new ArmorBase("chestplate_lorite", ARMOR_LORITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_LORITE = new ArmorBase("helmet_lorite", ARMOR_LORITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_HYDRIS = new ArmorBase("boots_hydris", ARMOR_HYDRIS, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_HYDRIS = new ArmorBase("leggings_hydris", ARMOR_HYDRIS, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_HYDRIS = new ArmorBase("chestplate_hydris", ARMOR_HYDRIS, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_HYDRIS = new ArmorBase("helmet_hydris", ARMOR_HYDRIS, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_MITHRIL = new ArmorBase("boots_mithril", ARMOR_MITHRIL, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_MITHRIL = new ArmorBase("leggings_mithril", ARMOR_MITHRIL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_MITHRIL = new ArmorBase("chestplate_mithril", ARMOR_MITHRIL, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_MITHRIL = new ArmorBase("helmet_mithril", ARMOR_MITHRIL, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_GILDRIUM = new ArmorBase("boots_gildrium", ARMOR_GILDRIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_GILDRIUM = new ArmorBase("leggings_gildrium", ARMOR_GILDRIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_GILDRIUM = new ArmorBase("chestplate_gildrium", ARMOR_GILDRIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_GILDRIUM = new ArmorBase("helmet_gildrium", ARMOR_GILDRIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_BERYX = new ArmorBase("boots_beryx", ARMOR_BERYX, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_BERYX = new ArmorBase("leggings_beryx", ARMOR_BERYX, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_BERYX = new ArmorBase("chestplate_beryx", ARMOR_BERYX, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_BERYX = new ArmorBase("helmet_beryx", ARMOR_BERYX, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_ORICHALCUM = new ArmorBase("boots_orichalcum", ARMOR_ORICHALCUM, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_ORICHALCUM = new ArmorBase("leggings_orichalcum", ARMOR_ORICHALCUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_ORICHALCUM = new ArmorBase("chestplate_orichalcum", ARMOR_ORICHALCUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_ORICHALCUM = new ArmorBase("helmet_orichalcum", ARMOR_ORICHALCUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_ALVIUM = new ArmorBase("boots_alvium", ARMOR_ALVIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item LEGGINGS_ALVIUM = new ArmorBase("leggings_alvium", ARMOR_ALVIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHESTPLATE_ALVIUM = new ArmorBase("chestplate_alvium", ARMOR_ALVIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item HELMET_ALVIUM = new ArmorBase("helmet_alvium", ARMOR_ALVIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item BOOTS_KRONITE = new ArmorBase("boots_kronite", ARMOR_KRONITE, 1, EntityEquipmentSlot.FEET, EnumRarity.UNCOMMON);
	public static final Item LEGGINGS_KRONITE = new ArmorBase("leggings_kronite", ARMOR_KRONITE, 2, EntityEquipmentSlot.LEGS, EnumRarity.UNCOMMON);
	public static final Item CHESTPLATE_KRONITE = new ArmorBase("chestplate_kronite", ARMOR_KRONITE, 1, EntityEquipmentSlot.CHEST, EnumRarity.UNCOMMON);
	public static final Item HELMET_KRONITE = new ArmorBase("helmet_kronite", ARMOR_KRONITE, 1, EntityEquipmentSlot.HEAD, EnumRarity.UNCOMMON);
	public static final Item BOOTS_MAKRINE = new ArmorBase("boots_makrine", ARMOR_MAKRINE, 1, EntityEquipmentSlot.FEET, EnumRarity.UNCOMMON);
	public static final Item LEGGINGS_MAKRINE = new ArmorBase("leggings_makrine", ARMOR_MAKRINE, 2, EntityEquipmentSlot.LEGS, EnumRarity.UNCOMMON);
	public static final Item CHESTPLATE_MAKRINE = new ArmorBase("chestplate_makrine", ARMOR_MAKRINE, 1, EntityEquipmentSlot.CHEST, EnumRarity.UNCOMMON);
	public static final Item HELMET_MAKRINE = new ArmorBase("helmet_makrine", ARMOR_MAKRINE, 1, EntityEquipmentSlot.HEAD, EnumRarity.UNCOMMON);
	public static final Item BOOTS_PROMETHIUM = new ArmorBase("boots_promethium", ARMOR_PROMETHIUM, 1, EntityEquipmentSlot.FEET, EnumRarity.UNCOMMON);
	public static final Item LEGGINGS_PROMETHIUM = new ArmorBase("leggings_promethium", ARMOR_PROMETHIUM, 2, EntityEquipmentSlot.LEGS, EnumRarity.UNCOMMON);
	public static final Item CHESTPLATE_PROMETHIUM = new ArmorBase("chestplate_promethium", ARMOR_PROMETHIUM, 1, EntityEquipmentSlot.CHEST, EnumRarity.UNCOMMON);
	public static final Item HELMET_PROMETHIUM = new ArmorBase("helmet_promethium", ARMOR_PROMETHIUM, 1, EntityEquipmentSlot.HEAD, EnumRarity.UNCOMMON);
}
