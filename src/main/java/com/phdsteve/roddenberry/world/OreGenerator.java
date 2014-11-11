package com.phdsteve.roddenberry.world;

import com.phdsteve.roddenberry.block.ore.*;
import com.phdsteve.roddenberry.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGenerator implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateNether(World world, Random random, int i, int j)
    {
    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
        for(int n = 0; n < OreCopper.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreCopper.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreCopper, OreCopper.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreDiburnium.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreDiburnium.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreDiburnium, OreDiburnium.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreDilithium.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreDilithium.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreDilithium, OreDilithium.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreDolamide.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreDolamide.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreDolamide, OreDolamide.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreDuranium.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreDuranium.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreDuranium, OreDuranium.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreLatinum.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreLatinum.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreLatinum, OreLatinum.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreTitanium.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreTitanium.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreTitanium, OreTitanium.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }

        for(int n = 0; n < OreTritanium.numberPerChunk; n = n + 1)
        {
            int randomPosX = chunkX + random.nextInt(16);
            int randomPosY = random.nextInt(OreTritanium.maxGenHeight);
            int randomPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreTritanium, OreTritanium.blocksPerVein)).generate(world, random, randomPosX, randomPosY, randomPosZ);
        }
    }

    private void generateEnd(World world, Random random, int i, int j)
    {
    }
}
