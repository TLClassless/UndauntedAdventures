package tlclassless.undaunted.adventures;

import net.minecraft.util.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class UndauntedAdventures implements ModInitializer
{
    // an instance of our new item
    public static final Item YETI_TOOTH = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item DRAGON_EYE = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item YETI_TOOTH_NECKLACE = new Item(new Item.Settings().group(ItemGroup.MISC));
 
    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("undauntedadventures", "yeti_tooth"), YETI_TOOTH);
    }
    {
        Registry.register(Registry.ITEM, new Identifier("undauntedadventures", "dragon_eye"), DRAGON_EYE);
    }  
    {
        Registry.register(Registry.ITEM, new Identifier("undauntedadventures", "yeti_tooth_necklace"), YETI_TOOTH_NECKLACE);
    }
}
