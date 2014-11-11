package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class OreLatinum extends BlockRoddenberry
{
    public OreLatinum()
    {
        super();
        this.setBlockName("latinumOre");
        this.setBlockTextureName("roddenberry:oreLatinum");

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5.0F);
    }

    public static int numberPerChunk = 1;
    public static int maxGenHeight = 64;
    public static int minGenHeight = 0;
    public static int blocksPerVein = 2;
}
