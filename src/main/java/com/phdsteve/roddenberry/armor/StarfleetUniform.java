package com.phdsteve.roddenberry.armor;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import com.phdsteve.roddenberry.init.ModArmors;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class StarfleetUniform extends ItemArmor
{
    public StarfleetUniform(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armorType)
    {
        super(armorMaterial, renderIndex, armorType);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem().equals(ModArmors.starfleetRedTunic))
        {
            return "roddenberry:textures/models/armor/starfleetRedUniform_1.png";
        }
        // Yellow tunic
        // Blue tunic
/*        else if(stack.getItem().equals(ModArmors.starfleetBlackPants))
        {
            return "roddenberry:textures/models/armor/starfleetBlackPants_2.png";
        }
        else if(stack.getItem().equals(ModArmors.starfleetBlackBoots))
        {
            return "roddenberry:textures/models/armor/starfleetBlackBoots_1.png";
        } */
        else
        {
            return null;
        }
    }
}
