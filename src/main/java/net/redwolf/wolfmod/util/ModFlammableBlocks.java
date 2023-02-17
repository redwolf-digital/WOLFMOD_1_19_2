package net.redwolf.wolfmod.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.redwolf.wolfmod.block.ModBlocks;

public class ModFlammableBlocks {

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.BLOSSOM_LEAVES, 30, 60);
        registry.add(ModBlocks.BROWN_LEAVES, 30, 60);
        registry.add(ModBlocks.DARK_AMBER_LEAVES, 30, 60);
        registry.add(ModBlocks.AMBER_LEAVES, 30, 60);
        registry.add(ModBlocks.MAPLE_LEAVES, 30, 60);
        registry.add(ModBlocks.ORANGE_LEAVES, 30, 60);
        registry.add(ModBlocks.YELLOW_LEAVES, 30, 60);



    }

}
