package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;
import com.phdsteve.roddenberry.init.ModItems;

import net.minecraft.item.Item;

import java.util.Random;

public class OreDolamide extends BlockRoddenberry
{
    public OreDolamide()
    {
        super();
        this.setBlockName("dolamideOre");
        this.setBlockTextureName("roddenberry:oreDolamide");

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(1.0F);
    }

    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ModItems.dustDolamide;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        return 2 + 2 * fortune;
    }

    public static int numberPerChunk = 3;
    public static int maxGenHeight = 48;
    public static int minGenHeight = 24;
    public static int blocksPerVein = 4;
}
