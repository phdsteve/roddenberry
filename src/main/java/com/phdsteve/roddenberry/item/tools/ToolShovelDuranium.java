package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemSpade;

public class ToolShovelDuranium extends ItemSpade
{
    public ToolShovelDuranium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("duraniumShovel");
    }
}
