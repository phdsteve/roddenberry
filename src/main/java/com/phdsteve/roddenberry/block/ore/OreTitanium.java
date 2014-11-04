package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.init.ModBlocks;
import net.minecraft.item.Item;

import java.util.Random;

public class OreTitanium extends Ore
{
    public OreTitanium()
    {
        super(1, 1.0F);
        this.setBlockName("titaniumOre");
        this.setBlockTextureName("roddenberry:oreTitanium");
    }

    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.oreTitanium);
    }

    @Override
    public int getNumberPerChunk(int dimension)
    {
        return 0;
    }

    @Override
    public int getMaxGenHeight(int dimension)
    {
        return 0;
    }

    @Override
    public int getMinGenHeight(int dimension)
    {
        return 0;
    }

    @Override
    public int blocksPerVein(int dimension)
    {
        return 0;
    }
}
