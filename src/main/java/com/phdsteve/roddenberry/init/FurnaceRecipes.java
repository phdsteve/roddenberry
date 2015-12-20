package com.phdsteve.roddenberry.init;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.ItemStack;

public class FurnaceRecipes
{
    public static void init()
    {
        // Ores
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreCopper), new ItemStack(ModItems.ingotCopper), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreDiburnium), new ItemStack(ModItems.ingotDiburnium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreDilithium), new ItemStack(ModItems.gemDilithium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreDolamide), new ItemStack(ModItems.ingotDolamideRefined), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreDuranium), new ItemStack(ModItems.ingotDuranium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreTitanium), new ItemStack(ModItems.ingotTitanium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.oreTritanium), new ItemStack(ModItems.ingotTritanium), 0.1F);

        // Dusts
        GameRegistry.addSmelting(new ItemStack(ModItems.dustCopper), new ItemStack(ModItems.ingotCopper), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.dustDiburnium), new ItemStack(ModItems.ingotDiburnium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.dustDolamide), new ItemStack(ModItems.ingotDolamideRefined), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.dustDuranium), new ItemStack(ModItems.ingotDuranium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.dustTitanium), new ItemStack(ModItems.ingotTitanium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(ModItems.dustTritanium), new ItemStack(ModItems.ingotTritanium), 0.1F);
    }
}
