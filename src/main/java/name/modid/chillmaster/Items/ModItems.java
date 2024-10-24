package name.modid.chillmaster.Items;

import name.modid.chillmaster.Swayandtools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SPORK = registerItem(new Item(new Item.Settings()));

    private static Item registerItem(Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Swayandtools.MOD_ID, "spork"), item);
    }

    public static void registerModItems(){
        Swayandtools.LOGGER.info("Registering Mod Items for " + Swayandtools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(SPORK));
    }
}
