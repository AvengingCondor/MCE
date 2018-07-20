package avengingcondor.mce.init;

import java.util.ArrayList;
import java.util.List;

import avengingcondor.mce.objects.armor.ArmorBase;
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
	public static final Item AXE_STEEL = new ToolAxe("axe_steel", TOOL_STEEL, 7.5f, -3.1f);
	public static final Item PICKAXE_STEEL = new ToolPickaxe("pickaxe_steel", TOOL_STEEL);
	public static final Item HOE_STEEL = new ToolHoe("hoe_steel", TOOL_STEEL);
	public static final Item SHOVEL_STEEL = new ToolShovel("shovel_steel", TOOL_STEEL);
	public static final Item SWORD_STEEL = new ToolSword("sword_steel", TOOL_STEEL);
	public static final Item AXE_COBALT = new ToolAxe("axe_cobalt", TOOL_COBALT, 8f, -3.1f);
	public static final Item PICKAXE_COBALT = new ToolPickaxe("pickaxe_cobalt", TOOL_COBALT);
	public static final Item HOE_COBALT = new ToolHoe("hoe_cobalt", TOOL_COBALT);
	public static final Item SHOVEL_COBALT = new ToolShovel("shovel_cobalt", TOOL_COBALT);
	public static final Item SWORD_COBALT = new ToolSword("sword_cobalt", TOOL_COBALT);
	public static final Item AXE_XOLGITE = new ToolAxe("axe_xolgite", TOOL_XOLGITE, 8f, -3.1f);
	public static final Item PICKAXE_XOLGITE = new ToolPickaxe("pickaxe_xolgite", TOOL_XOLGITE);
	public static final Item HOE_XOLGITE = new ToolHoe("hoe_xolgite", TOOL_XOLGITE);
	public static final Item SHOVEL_XOLGITE = new ToolShovel("shovel_xolgite", TOOL_XOLGITE);
	public static final Item SWORD_XOLGITE = new ToolSword("sword_xolgite", TOOL_XOLGITE);
	public static final Item AXE_OROGATE = new ToolAxe("axe_orogate", TOOL_OROGATE, 8.5f, -3.1f);
	public static final Item PICKAXE_OROGATE = new ToolPickaxe("pickaxe_orogate", TOOL_OROGATE);
	public static final Item HOE_OROGATE = new ToolHoe("hoe_orogate", TOOL_OROGATE);
	public static final Item SHOVEL_OROGATE = new ToolShovel("shovel_orogate", TOOL_OROGATE);
	public static final Item SWORD_OROGATE = new ToolSword("sword_orogate", TOOL_OROGATE);
	
	
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
}
