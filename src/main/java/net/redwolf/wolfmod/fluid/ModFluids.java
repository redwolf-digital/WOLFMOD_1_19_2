package net.redwolf.wolfmod.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.redwolf.wolfmod.WolfMod;
import net.redwolf.wolfmod.item.ModItemGroup;

public class ModFluids {
    public static FlowableFluid STILL_HOT_SPRING_WATER;
    public static FlowableFluid FLOWING_HOT_SPRING_WATER;
    public static Block HOT_SPRING_WATER_BLOCK;
    public static Item HOT_SPRING_WATER_BUCKET;


    public static void register() {
        STILL_HOT_SPRING_WATER = Registry.register(Registry.FLUID, new Identifier(WolfMod.MOD_ID, "hot_spring_water"), new HotSpringWater.Still());
        FLOWING_HOT_SPRING_WATER = Registry.register(Registry.FLUID, new Identifier(WolfMod.MOD_ID, "flowing_hot_spring_water"), new HotSpringWater.Flowing());

        HOT_SPRING_WATER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(WolfMod.MOD_ID, "hot_spring_water_block"), new FluidBlock(ModFluids.STILL_HOT_SPRING_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        HOT_SPRING_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(WolfMod.MOD_ID, "hot_spring_water_bucket"), new BucketItem(ModFluids.STILL_HOT_SPRING_WATER, new FabricItemSettings().group(ModItemGroup.WOLFDECORATION).recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
