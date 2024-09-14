package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //After you create and register the item/subject the next step is to load it into the IEventBus
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    //Next you should go to where you IEventBus register is located which should be under ExampleMod Class in the ExampleMod file
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
    //Now once we have defined the Item we have made the item, but it has not Texture and no name yet.
    //Hope on into ExampleMod and find the addCreative class and
    //add the Item you have just created to the Tab of your choice there will be more instructions over there
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));

   // public static final RegistryObject<Item> BREAD = new RegistryObject<Item>();
}
