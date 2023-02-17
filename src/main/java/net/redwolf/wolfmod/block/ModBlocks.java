package net.redwolf.wolfmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.redwolf.wolfmod.WolfMod;
import net.redwolf.wolfmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block BLOSSOM_LEAVES = registerBlock("blossom_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);
    public static final Block BROWN_LEAVES = registerBlock("brown_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);
    public static final Block DARK_AMBER_LEAVES = registerBlock("dark_amber_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);
    public static final Block AMBER_LEAVES = registerBlock("amber_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);
    public static final Block YELLOW_LEAVES = registerBlock("yellow_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.WOLFDECORATION);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(WolfMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(WolfMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlock() {
        WolfMod.LOGGER.debug("register ModBlock " + WolfMod.MOD_ID);
    }

}
