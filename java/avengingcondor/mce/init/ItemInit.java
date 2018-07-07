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
	
	//material
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 4.7f, 1.0f, 10).setRepairItem(new ItemStack(ItemInit.INGOT_COPPER));
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 8, new int[] {2,3,3,1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f).setRepairItem(new ItemStack(ItemInit.INGOT_COPPER));
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("tool_bronze", 3, 214, 5.5f, 1.5f, 15).setRepairItem(new ItemStack(ItemInit.INGOT_BRONZE));
	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("armor_bronze", Reference.MODID + ":bronze", 12, new int[] {2,3,3,1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f).setRepairItem(new ItemStack(ItemInit.INGOT_BRONZE));
	public static final ToolMaterial TOOL_IRON_MCE = EnumHelper.addToolMaterial("tool_iron_mce", 4, 251, 6.0f, 2f, 14).setRepairItem(new ItemStack(Items.IRON_INGOT));
	public static final ArmorMaterial ARMOR_IRON_MCE = EnumHelper.addArmorMaterial("armor_iron_mce", "minecraft:iron", 15, new int[] {2,3,3,1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f).setRepairItem(new ItemStack(Items.IRON_INGOT));
	
	//tools
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER, 7.0f, -3.2f);//lower(or raise I guess cause negative) second number by .1 each tier until they're at 3.0, maybe fuck with these later if I want, first number is the damage dealt by the axe-1
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	public static final Item AXE_BRONZE = new ToolAxe("axe_bronze", TOOL_BRONZE, 7.0f, -3.2f);//lower(or raise I guess cause negative) second number by .1 each tier until they're at 3.0, maybe fuck with these later if I want, first number is the damage dealt by the axe-1
	public static final Item PICKAXE_BRONZE = new ToolPickaxe("pickaxe_bronze", TOOL_BRONZE);
	public static final Item HOE_BRONZE = new ToolHoe("hoe_bronze", TOOL_BRONZE);
	public static final Item SHOVEL_BRONZE = new ToolShovel("shovel_bronze", TOOL_BRONZE);
	public static final Item SWORD_BRONZE = new ToolSword("sword_bronze", TOOL_BRONZE);
	public static final Item PICKAXE_IRON_MCE = new ToolPickaxe("pickaxe_iron_mce", TOOL_IRON_MCE);
	
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

}
