package com.phdsteve.roddenberry.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class RoddenberryWorld
{
    public static void mainRegistry()
    {
        initWorldGen();
    }

    public static void initWorldGen()
    {
        registerWorldGen(new OreGenerator(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbablility)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbablility);
    }
}
