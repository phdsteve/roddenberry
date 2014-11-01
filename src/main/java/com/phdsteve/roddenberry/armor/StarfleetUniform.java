package com.phdsteve.roddenberry.armor;

import com.phdsteve.roddenberry.creativetab.CreativeTabRoddenberry;
import com.phdsteve.roddenberry.init.ModArmors;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class StarfleetUniform extends ItemArmor
{
    public StarfleetUniform(ArmorMaterial armorMaterial, int renderIndex, int armorType)
    {
        super(armorMaterial, renderIndex, armorType);
        this.setCreativeTab(CreativeTabRoddenberry.RODDENBERRY_TAB);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModArmors.starfleetRedTunic)
        {
            return "roddenberry:textures/models/armor/starfleetRedTunic_1.png";
        }
        else if(stack.getItem() == ModArmors.starfleetYellowTunic)
        {
            return "roddenberry:textures/models/armor/starfleetYellowTunic_1.png";
        }
        else if(stack.getItem() == ModArmors.starfleetBlueTunic)
        {
            return "roddenberry:textures/models/armor/starfleetBlueTunic_1.png";
        }
        else if(stack.getItem() == ModArmors.starfleetBlackPants)
        {
            return "roddenberry:textures/models/armor/starfleetBlackPants_2.png";
        }
        else if(stack.getItem() == ModArmors.starfleetBlackBoots)
        {
            return "roddenberry:textures/models/armor/starfleetBlackBoots_1.png";
        }
        else
        {
            return null;
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModArmors.starfleetRedTunic)
        {
            this.itemIcon = reg.registerIcon("roddenberry:starfleetRedTunic");
        }
        else if(this == ModArmors.starfleetYellowTunic)
        {
            this.itemIcon = reg.registerIcon("roddenberry:starfleetYellowTunic");
        }
        else if(this == ModArmors.starfleetBlueTunic)
        {
            this.itemIcon = reg.registerIcon("roddenberry:starfleetBlueTunic");
        }
        else if(this == ModArmors.starfleetBlackPants)
        {
            this.itemIcon = reg.registerIcon("roddenberry:starfleetBlackPants");
        }
        else if(this == ModArmors.starfleetBlackBoots)
        {
            this.itemIcon = reg.registerIcon("roddenberry:starfleetBlackBoots");
        }
    }
}
