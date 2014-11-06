package com.phdsteve.roddenberry.item.tools;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;

public class ToolSwordCopper extends ItemSword
{
    public ToolSwordCopper(ToolMaterial toolMaterial)
    {
        super(toolMaterial);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
        this.setUnlocalizedName("copperSword");
        this.setTextureName("roddenberry:copperSword");
    }
}
