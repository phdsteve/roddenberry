package com.phdsteve.roddenberry.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes
{
    public static void init()
    {
        // Armor
        GameRegistry.addRecipe(new ItemStack(ModArmors.starfleetBlackBoots), "b b", "b b", 'b', new ItemStack(Blocks.wool, 1, 15));
        GameRegistry.addRecipe(new ItemStack(ModArmors.starfleetBlackPants), "bbb", "b b", "b b", 'b', new ItemStack(Blocks.wool, 1, 15));
        GameRegistry.addRecipe(new ItemStack(ModArmors.starfleetBlueTunic), "g g", "bub", "bbb", 'g', new ItemStack(Blocks.wool, 1, 7), 'b', new ItemStack(Blocks.wool, 1, 15), 'u', new ItemStack(Blocks.wool, 1, 11));
        GameRegistry.addRecipe(new ItemStack(ModArmors.starfleetRedTunic), "g g", "brb", "bbb", 'g', new ItemStack(Blocks.wool, 1, 7), 'b', new ItemStack(Blocks.wool, 1, 15), 'r', new ItemStack(Blocks.wool, 1, 14));
        GameRegistry.addRecipe(new ItemStack(ModArmors.starfleetYellowTunic), "g g", "byb", "bbb", 'g', new ItemStack(Blocks.wool, 1, 7), 'b', new ItemStack(Blocks.wool, 1, 15), 'y', new ItemStack(Blocks.wool, 1, 4));

        // Blocks
//        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
//        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf)));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockCopper), "iii", "iii", "iii", 'i', new ItemStack(ModItems.ingotCopper));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDiburnium), "iii", "iii", "iii", 'i', new ItemStack(ModItems.ingotDiburnium));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDolamideRefined), "iii", "iii", "iii", 'i', new ItemStack(ModItems.ingotDolamideRefined));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDuranium), "iii", "iii", "iii", 'i', new ItemStack(ModItems.ingotDuranium));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTitanium), "iii", "iii", "iii", 'i', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTritanium), "iii", "iii", "iii", 'i', new ItemStack(ModItems.ingotTritanium));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDilithium), "ggg", "ggg", "ggg", 'g', new ItemStack(ModItems.gemDilithium));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLatinum), "bbb", "bbb", "bbb", 'b', new ItemStack(ModItems.latinumBar));

        // Items
//        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper, 9), new ItemStack(ModBlocks.blockCopper));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotDiburnium, 9), new ItemStack(ModBlocks.blockDiburnium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotDolamideRefined, 9), new ItemStack(ModBlocks.blockDolamideRefined));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotDuranium, 9), new ItemStack(ModBlocks.blockDuranium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTitanium, 9), new ItemStack(ModBlocks.blockTitanium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTritanium, 9), new ItemStack(ModBlocks.blockTritanium));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemDilithium, 9), new ItemStack(ModBlocks.blockDilithium));
        GameRegistry.addRecipe(new ItemStack(ModItems.latinumStrip), "sss", "sss", "sss", 's', new ItemStack(ModItems.latinumSlip));
        GameRegistry.addRecipe(new ItemStack(ModItems.latinumBar), "sss", "sss", "sss", 's', new ItemStack(ModItems.latinumStrip));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.latinumBar, 9), new ItemStack(ModBlocks.blockLatinum));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.latinumStrip, 9), new ItemStack(ModItems.latinumBar));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.latinumSlip, 9), new ItemStack(ModItems.latinumStrip));

        // Tools
        GameRegistry.addRecipe(new ItemStack(ModTools.axeCopper), "ii", "is", " s", 'i', new ItemStack(ModItems.ingotCopper), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.hoeCopper), "ii", " s", " s", 'i', new ItemStack(ModItems.ingotCopper), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.pickaxeCopper), "iii", " s ", " s ", 'i', new ItemStack(ModItems.ingotCopper), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.shovelCopper), "i", "s", "s",  'i', new ItemStack(ModItems.ingotCopper), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.swordCopper), "i", "i", "s", 'i', new ItemStack(ModItems.ingotCopper), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.axeTitanium), "ii", "is", " s", 'i', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.hoeTitanium), "ii", " s", " s", 'i', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.pickaxeTitanium), "iii", " s ", " s ", 'i', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.shovelTitanium), "i", "s", "s",  'i', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.swordTitanium), "i", "i", "s", 'i', new ItemStack(ModItems.ingotTitanium), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModTools.axeDuranium), "ii", "is", " s", 'i', new ItemStack(ModItems.ingotDuranium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.hoeDuranium), "ii", " s", " s", 'i', new ItemStack(ModItems.ingotDuranium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.pickaxeDuranium), "iii", " s ", " s ", 'i', new ItemStack(ModItems.ingotDuranium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.shovelDuranium), "i", "s", "s",  'i', new ItemStack(ModItems.ingotDuranium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.swordDuranium), "i", "i", "s", 'i', new ItemStack(ModItems.ingotDuranium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.axeTritanium), "ii", "is", " s", 'i', new ItemStack(ModItems.ingotTritanium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.hoeTritanium), "ii", " s", " s", 'i', new ItemStack(ModItems.ingotTritanium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.pickaxeTritanium), "iii", " s ", " s ", 'i', new ItemStack(ModItems.ingotTritanium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.shovelTritanium), "i", "s", "s",  'i', new ItemStack(ModItems.ingotTritanium), 's', new ItemStack(ModItems.ingotTitanium));
        GameRegistry.addRecipe(new ItemStack(ModTools.swordTritanium), "i", "i", "s", 'i', new ItemStack(ModItems.ingotTritanium), 's', new ItemStack(ModItems.ingotTitanium));
    }
}
