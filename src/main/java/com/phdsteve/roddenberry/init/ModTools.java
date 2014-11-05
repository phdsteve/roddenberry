package com.phdsteve.roddenberry.init;

import com.phdsteve.roddenberry.item.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools
{
    // Tool materials
    public static Item.ToolMaterial enumToolMaterialCopper = EnumHelper.addToolMaterial("COPPER", 2, 256, 6.0F, 2.0F, 14);
    public static Item.ToolMaterial enumToolMaterialTitanium = EnumHelper.addToolMaterial("TITANIUM", 4, 1536, 8.0F, 4.0F, 16);
    public static Item.ToolMaterial enumToolMaterialDuranium = EnumHelper.addToolMaterial("DURANIUM", 5, 2048, 9.0F, 5.0F, 20);
    public static Item.ToolMaterial enumToolMaterialTritanium = EnumHelper.addToolMaterial("TRITANIUM", 6, 4096, 11.0F, 6.0F, 24);

    // Copper tools
    public static ToolPickaxeCopper pickaxeCopper = new ToolPickaxeCopper(enumToolMaterialCopper);
    public static ToolShovelCopper shovelCopper = new ToolShovelCopper(enumToolMaterialCopper);
    public static ToolAxeCopper axeCopper = new ToolAxeCopper(enumToolMaterialCopper);
    public static ToolHoeCopper hoeCopper = new ToolHoeCopper(enumToolMaterialCopper);
    public static ToolSwordCopper swordCopper = new ToolSwordCopper(enumToolMaterialCopper);

    // Titanium tools
    public static ToolPickaxeTitanium pickaxeTitanium = new ToolPickaxeTitanium(enumToolMaterialTitanium);
    public static ToolShovelTitanium shovelTitanium = new ToolShovelTitanium(enumToolMaterialTitanium);
    public static ToolAxeTitanium axeTitanium = new ToolAxeTitanium(enumToolMaterialTitanium);
    public static ToolHoeTitanium hoeTitanium = new ToolHoeTitanium(enumToolMaterialTitanium);
    public static ToolSwordTitanium swordTitanium = new ToolSwordTitanium(enumToolMaterialTitanium);

    // Duranium tools
    public static ToolPickaxeDuranium pickaxeDuranium = new ToolPickaxeDuranium(enumToolMaterialDuranium);
    public static ToolShovelDuranium shovelDuranium = new ToolShovelDuranium(enumToolMaterialDuranium);
    public static ToolAxeDuranium axeDuranium = new ToolAxeDuranium(enumToolMaterialDuranium);
    public static ToolHoeDuranium hoeDuranium = new ToolHoeDuranium(enumToolMaterialDuranium);
    public static ToolSwordDuranium swordDuranium = new ToolSwordDuranium(enumToolMaterialDuranium);

    // Tritanium tools
    public static ToolPickaxeTritanium pickaxeTritanium = new ToolPickaxeTritanium(enumToolMaterialTritanium);
    public static ToolShovelTritanium shovelTritanium = new ToolShovelTritanium(enumToolMaterialTritanium);
    public static ToolAxeTritanium axeTritanium = new ToolAxeTritanium(enumToolMaterialTritanium);
    public static ToolHoeTritanium hoeTritanium = new ToolHoeTritanium(enumToolMaterialTritanium);
    public static ToolSwordTritanium swordTritanium = new ToolSwordTritanium(enumToolMaterialTritanium);

    public static void init()
    {
        // Copper tools
        GameRegistry.registerItem(pickaxeCopper, "copperPickaxe");
        GameRegistry.registerItem(shovelCopper, "copperShovel");
        GameRegistry.registerItem(axeCopper, "copperAxe");
        GameRegistry.registerItem(hoeCopper, "copperHoe");
        GameRegistry.registerItem(swordCopper, "copperSword");

        // Titanium tools
        GameRegistry.registerItem(pickaxeTitanium, "titaniumPickaxe");
        GameRegistry.registerItem(shovelTitanium, "titaniumShovel");
        GameRegistry.registerItem(axeTitanium, "titaniumAxe");
        GameRegistry.registerItem(hoeTitanium, "titaniumHoe");
        GameRegistry.registerItem(swordTitanium, "titaniumSword");

        // Duranium tools
        GameRegistry.registerItem(pickaxeDuranium, "duraniumPickaxe");
        GameRegistry.registerItem(shovelDuranium, "duraniumShovel");
        GameRegistry.registerItem(axeDuranium, "druaniumAxe");
        GameRegistry.registerItem(hoeDuranium, "duraniumHoe");
        GameRegistry.registerItem(swordDuranium, "duraniumSword");

        // Tritanium tools
        GameRegistry.registerItem(pickaxeTritanium, "tritaniumPickaxe");
        GameRegistry.registerItem(shovelTritanium, "tritaniumShovel");
        GameRegistry.registerItem(axeTritanium, "tritaniumAxe");
        GameRegistry.registerItem(hoeTritanium, "tritaniumHoe");
        GameRegistry.registerItem(swordTritanium, "tritaniumSword");
    }
}
