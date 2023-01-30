package net.redwolf.wolfmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.redwolf.wolfmod.WolfMod;

public class ModItems {
    //add item here
    //Tool
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 1, -3f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new ModPickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_AXE = registerItem("copper_axe", new ModAxeItem(ModToolMaterial.COPPER, 5, -3.2f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new ModHoeItem(ModToolMaterial.COPPER, -2, -1f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));

    //Armor
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_LEGGINGE = registerItem("copper_leggings", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WolfMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WolfMod.LOGGER.debug("Registering Mod Items for " + WolfMod.MOD_ID);
    }
}
