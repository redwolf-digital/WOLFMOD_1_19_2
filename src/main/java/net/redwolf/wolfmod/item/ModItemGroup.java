package net.redwolf.wolfmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.redwolf.wolfmod.WolfMod;

public class ModItemGroup {
    public static final ItemGroup COPPERTOOL = FabricItemGroupBuilder.build(new Identifier(WolfMod.MOD_ID, "coppertool"), () -> new ItemStack(ModItems.COPPER_SWORD));
    public static final ItemGroup WOLFDECORATION = FabricItemGroupBuilder.build(new Identifier(WolfMod.MOD_ID, "wolfdecoration"), () -> new ItemStack(Items.WATER_BUCKET));

}
