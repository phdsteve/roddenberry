package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemAxe;

public class ToolAxeDuranium extends ItemAxe
{
    public ToolAxeDuranium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("duraniumAxe");
        this.setTextureName("roddenberry:duraniumAxe");
    }
}
