package com.phdsteve.roddenberry.handler;

import com.phdsteve.roddenberry.init.ModBlocks;
import com.phdsteve.roddenberry.init.ModItems;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if (fuel.getItem() == ModItems.dustDolamide)
        {
            return 1600;
        }
        else if (fuel.getItem() == ModItems.ingotDolamideRefined)
        {
            return 3200;
        }

        //TODO: Add Refined Dolamide Block to fuels list. Return fuel time of 32000.

        else
        {
            return 0;
        }
    }
}
