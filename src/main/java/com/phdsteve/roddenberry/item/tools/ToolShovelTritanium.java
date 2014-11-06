package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemSpade;

public class ToolShovelTritanium extends ItemSpade
{
    public ToolShovelTritanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("tritaniumShovel");
        this.setTextureName("roddenberry:tritaniumShovel");
    }
}
