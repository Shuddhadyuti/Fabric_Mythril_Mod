package net.kalpadyuti.yeetlytech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kalpadyuti.yeetlytech.Yeetlytech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Yeetlytech.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Yeetlytech.LOGGER.info("Registering Mod Items for " + Yeetlytech.MOD_ID);
    }
}
