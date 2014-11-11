package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.world.OreGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorld
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
