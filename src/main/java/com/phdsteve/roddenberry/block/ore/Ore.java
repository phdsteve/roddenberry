package com.phdsteve.roddenberry.block.ore;

import com.phdsteve.roddenberry.block.BlockRoddenberry;
import net.minecraft.block.Block;

public abstract class Ore extends BlockRoddenberry
{
    public Ore(int harvestLevel, float hardness)
    {
        this.setStepSound(Block.soundTypeStone);
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setHardness(hardness);
   }

    /**
     * Gets the number of veins of ore there should be in a chunk.
     *
     * @param dimension
     *            The dimension of the world its in.
     * @return The number of veins
     */
    public abstract int getNumberPerChunk(int dimension);

    /**
     * The max height at which to generate.
     *
     * @param dimension
     *            The dimension of the world its in.
     * @return The max height at which to generate
     */
    public abstract int getMaxGenHeight(int dimension);

    /**
     * Gets the Minimum height at which to generate
     *
     * @param dimension
     *            The dimension of the world being generated.
     * @return The Minimum height
     */
    public abstract int getMinGenHeight(int dimension);

    /**
     * How many blocks per vein there should be(about)
     *
     * @param dimension
     *            The dimension of the world its in.
     * @return How many blocks on average to generate
     */
    public abstract int blocksPerVein(int dimension);
}
