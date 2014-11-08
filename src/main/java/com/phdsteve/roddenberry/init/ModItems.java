package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.item.*;
import com.phdsteve.roddenberry.item.fuels.ItemDolamideRaw;
import com.phdsteve.roddenberry.item.fuels.ItemDolamideRefined;
import com.phdsteve.roddenberry.item.gems.*;
import com.phdsteve.roddenberry.item.metals.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    // Fuels
    public static final ItemRoddenberry ingotDolamideRefined = new ItemDolamideRefined();
    public static final ItemRoddenberry dustDolamide = new ItemDolamideRaw();

    // Gems
    public static final ItemRoddenberry gemDilithium = new ItemGemDilithium();

    // Metals
    public static final ItemRoddenberry ingotCopper = new ItemIngotCopper();
    public static final ItemRoddenberry ingotDiburnium = new ItemIngotDiburnium();
    public static final ItemRoddenberry ingotDuranium = new ItemIngotDuranium();
    public static final ItemRoddenberry ingotTitanium = new ItemIngotTitanium();
    public static final ItemRoddenberry ingotTritanium = new ItemIngotTritanium();

    public static final ItemRoddenberry dustCopper = new ItemDustCopper();
    public static final ItemRoddenberry dustDiburnium = new ItemDustDiburnium();
    public static final ItemRoddenberry dustDuranium = new ItemDustDuranium();
    public static final ItemRoddenberry dustTitanium = new ItemDustTitanium();
    public static final ItemRoddenberry dustTritanium = new ItemDustTritanium();

    // Miscellaneous
    public static final ItemRoddenberry latinumBar = new ItemLatinumBar();
    public static final ItemRoddenberry latinumSlip = new ItemLatinumSlip();
    public static final ItemRoddenberry latinumStrip = new ItemLatinumStrip();
    public static final ItemRoddenberry starfleetInsignia = new ItemStarfleetInsignia();
    public static final ItemRoddenberry mapleLeaf = new ItemMapleLeaf();

    //Game Registry
    public static void init()
    {
        // Fuels
        GameRegistry.registerItem(ingotDolamideRefined, "refinedDolamideIngot");
        GameRegistry.registerItem(dustDolamide, "rawDolamide");

        // Gems
        GameRegistry.registerItem(gemDilithium, "dilithiumCrystal");

        // Metals
        GameRegistry.registerItem(ingotCopper, "copperIngot");
        GameRegistry.registerItem(ingotDiburnium, "diburniumIngot");
        GameRegistry.registerItem(ingotDuranium, "duraniumIngot");
        GameRegistry.registerItem(ingotTitanium, "titaniumIngot");
        GameRegistry.registerItem(ingotTritanium, "tritaniumIngot");

        GameRegistry.registerItem(dustCopper, "copperDust");
        GameRegistry.registerItem(dustDiburnium, "diburniumDust");
        GameRegistry.registerItem(dustDuranium, "duraniumDust");
        GameRegistry.registerItem(dustTitanium, "titaniumDust");
        GameRegistry.registerItem(dustTritanium, "tritaniumDust");

        // Miscellaneous
        GameRegistry.registerItem(latinumBar, "latinumBar");
        GameRegistry.registerItem(latinumSlip, "latinumSlip");
        GameRegistry.registerItem(latinumStrip, "latinumStrip");
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(starfleetInsignia, "starfleetInsignia");

    }
}
