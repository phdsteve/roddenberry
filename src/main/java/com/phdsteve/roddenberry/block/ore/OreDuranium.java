package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;

public class OreDuranium extends BlockRoddenberry
{
    public OreDuranium()
    {
        super();
        this.setBlockName("duraniumOre");
        this.setBlockTextureName("roddenberry:oreDuranium");

        this.setHarvestLevel("pickaxe", 4);
        this.setHardness(4.0F);
    }

    public static int numberPerChunk = 6;
    public static int maxGenHeight = 40;
    public static int minGenHeight = 16;
    public static int blocksPerVein = 5;
}
