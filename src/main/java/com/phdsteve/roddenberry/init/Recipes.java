package com.phdsteve.roddenberry.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        // Armor
//        GameRegistry.addRecipe(new ItemStack(ModItems.starfleetBlackBoots), "b b", "b b", 'b', new ItemStack(Blocks.wool, 1, 15));
//        GameRegistry.addRecipe(new ItemStack(ModItems.starfleetBlackPants), "bbb", "b b", "b b", 'b', new ItemStack(Blocks.wool, 1, 15));
//        GameRegistry.addRecipe(new ItemStack(ModItems.starfleetBlueTunic), "g g", "bub", "bbb", 'g', new ItemStack(Blocks.wool, 1, 7), 'b', new ItemStack(Blocks.wool, 1, 15), 'u', new ItemStack(Blocks.wool, 1, 11));
//        GameRegistry.addRecipe(new ItemStack(ModItems.starfleetRedTunic), "g g", "brb", "bbb", 'g', new ItemStack(Blocks.wool, 1, 7), 'b', new ItemStack(Blocks.wool, 1, 15), 'r', new ItemStack(Blocks.wool, 1, 14));
//        GameRegistry.addRecipe(new ItemStack(ModItems.starfleetYellowTunic), "g g", "byb", "bbb", 'g', new ItemStack(Blocks.wool, 1, 7), 'b', new ItemStack(Blocks.wool, 1, 15), 'y', new ItemStack(Blocks.wool, 1, 4));

        // Items
//        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));

        // Blocks
//        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)));
    }
}
