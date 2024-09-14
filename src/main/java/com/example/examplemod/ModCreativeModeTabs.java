package com.example.examplemod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);

public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab", () -> CreativeModeTab.builder()
        .title(Component.translatable("creativetab.tutorial_tab"))
        .icon(() -> new ItemStack(Items.BREAD))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.TESTITEM.get());
           // pOutput.accept(Blocks.BREAD_BLOCK.get());
            pOutput.accept(Items.BREAD);
        })
        .build());

public static void register(IEventBus eventBus)
{
 CREATIVE_MODE_TABS.register(eventBus);
}


}
