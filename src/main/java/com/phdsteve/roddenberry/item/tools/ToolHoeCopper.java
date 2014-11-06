package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemHoe;

public class ToolHoeCopper extends ItemHoe
{
    public ToolHoeCopper(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("copperHoe");
        this.setTextureName("roddenberry:copperHoe");
    }
}
