package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemHoe;

public class ToolHoeTritanium extends ItemHoe
{
    public ToolHoeTritanium(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("tritaniumHoe");
        this.setTextureName("roddenberry:tritaniumHoe");
    }
}
