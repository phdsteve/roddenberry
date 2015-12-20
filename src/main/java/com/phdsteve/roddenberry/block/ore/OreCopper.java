package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class OreCopper extends BlockRoddenberry
{
    public OreCopper()
    {
        super();
        this.setBlockName("copperOre");
        this.setBlockTextureName("Roddenberry:oreCopper");

        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(3.0F);
    }

    public static int numberPerChunk = 4;
    public static int maxGenHeight = 64;
    public static int minGenHeight = 32;
    public static int blocksPerVein = 8;
}
