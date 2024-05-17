package net.Ramon.cimolichthys.item;

import net.Ramon.cimolichthys.Cimolichthys;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.net.CacheRequest;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cimolichthys.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CIMOLICHTHYS_TAB = CREATIVE_MODE_TABS.register("cimolichthys_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.cimolichthys_meat.get()))
                    .title(Component.translatable("creativetab.cimolichthys_tab"))
                    .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.cimolichthys_meat.get());
                    pOutput.accept(ModItems.cooked_cimolichthys.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
