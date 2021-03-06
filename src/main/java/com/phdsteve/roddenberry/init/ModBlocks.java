package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.block.BlockRoddenberry;
import com.phdsteve.roddenberry.block.fuel.*;
import com.phdsteve.roddenberry.block.gems.*;
import com.phdsteve.roddenberry.block.metals.*;
import com.phdsteve.roddenberry.block.ore.*;
import com.phdsteve.roddenberry.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    // Fuels
    public static BlockRoddenberry blockDolamideRefined = new BlockDolamideRefined();

    // Gems
    public static BlockRoddenberry blockDilithium = new BlockDilithium();

    // Metals
    public static BlockRoddenberry blockCopper = new BlockCopper();
    public static BlockRoddenberry blockDiburnium = new BlockDiburnium();
    public static BlockRoddenberry blockDuranium = new BlockDuranium();
    public static BlockRoddenberry blockLatinum = new BlockLatinum();
    public static BlockRoddenberry blockTitanium = new BlockTitanium();
    public static BlockRoddenberry blockTritanium = new BlockTritanium();

    // Miscellaneous

    // Ores
    public static BlockRoddenberry oreCopper = new OreCopper();
    public static BlockRoddenberry oreDiburnium = new OreDiburnium();
    public static BlockRoddenberry oreDilithium = new OreDilithium();
    public static BlockRoddenberry oreDolamide = new OreDolamide();
    public static BlockRoddenberry oreDuranium = new OreDuranium();
    public static BlockRoddenberry oreLatinum = new OreLatinum();
    public static BlockRoddenberry oreTitanium = new OreTitanium();
    public static BlockRoddenberry oreTritanium = new OreTritanium();

    public static void init()
    {
        // Fuels
        GameRegistry.registerBlock(blockDolamideRefined, "refinedDolamideBlock");

        // Gems
        GameRegistry.registerBlock(blockDilithium, "dilithiumBlock");

        // Metals
        GameRegistry.registerBlock(blockCopper, "copperBlock");
        GameRegistry.registerBlock(blockDiburnium, "diburniumBlock");
        GameRegistry.registerBlock(blockDuranium, "duraniumBlock");
        GameRegistry.registerBlock(blockLatinum, "latinumBlock");
        GameRegistry.registerBlock(blockTitanium, "titaniumBlock");
        GameRegistry.registerBlock(blockTritanium, "tritaniumBlock");

        // Miscellaneous

        // Ores
        GameRegistry.registerBlock(oreCopper, "copperOre");
        GameRegistry.registerBlock(oreDiburnium, "diburniumOre");
        GameRegistry.registerBlock(oreDilithium, "dilithiumOre");
        GameRegistry.registerBlock(oreDolamide, "dolamideOre");
        GameRegistry.registerBlock(oreDuranium, "duraniumOre");
        GameRegistry.registerBlock(oreLatinum, "latinumOre");
        GameRegistry.registerBlock(oreTitanium, "titaniumOre");
        GameRegistry.registerBlock(oreTritanium, "tritaniumOre");
    }
}
