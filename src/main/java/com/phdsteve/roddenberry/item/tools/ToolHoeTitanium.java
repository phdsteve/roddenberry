package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemHoe;

public class ToolHoeTitanium extends ItemHoe
{
    public ToolHoeTitanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("titaniumHoe");
        this.setTextureName("roddenberry:titaniumHoe");
    }
}
