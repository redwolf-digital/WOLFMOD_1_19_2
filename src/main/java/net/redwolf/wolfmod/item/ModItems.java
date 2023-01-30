package net.redwolf.wolfmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.redwolf.wolfmod.WolfMod;

public class ModItems {
    //add item here
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 1, -3f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new ModPickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.COPPERTOOL).maxCount(1)));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new Item(new FabricItemSettings().group(ModItemGroup.COPPERTOOL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WolfMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WolfMod.LOGGER.debug("Registering Mod Items for " + WolfMod.MOD_ID);
    }
}
