package tlclassless.undaunted.adventures;

import net.minecraft.util.registry.*;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class undauntedAdventures implements ModInitializer
{
    // an instance of our new item
    public static final Item YETI_TOOTH = new Item(new Item.Settings().group(ItemGroup.MISC));
 
    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("undauntedadventures", "yeti_tooth"), YETI_TOOTH);
	} 
}
