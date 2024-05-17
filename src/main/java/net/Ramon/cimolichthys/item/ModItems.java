package net.Ramon.cimolichthys.item;

import net.Ramon.cimolichthys.Cimolichthys;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cimolichthys.MOD_ID);

    public static final RegistryObject<Item> cimolichthys_meat = ITEMS.register("cimolichthys_meat",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>   cooked_cimolichthys = ITEMS.register("cooked_cimolichthys",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
