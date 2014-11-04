package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.block.BlockFlag;
import com.phdsteve.roddenberry.block.BlockRoddenberry;
import com.phdsteve.roddenberry.block.ore.OreCopper;
import com.phdsteve.roddenberry.block.ore.*;
import com.phdsteve.roddenberry.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static BlockRoddenberry flag = new BlockFlag();

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
        GameRegistry.registerBlock(flag, "flag");

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
