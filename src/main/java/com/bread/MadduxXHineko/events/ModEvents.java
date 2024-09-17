package com.bread.MadduxXHineko.events;

import com.bread.MadduxXHineko.breadblockmod.BreadBlockMod;
import com.bread.MadduxXHineko.breadblockmod.block.ModBlocks;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = BreadBlockMod.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void addcustomTrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.FARMER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event .getTrades();

                // Add a trade to the list of trades for the first level (apprentice)
                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                        // The trade involves trading 8 emeralds...
                        new ItemCost(Items.EMERALD, 20),
                        // ...in exchange for 1 Bread Block (a custom block from your mod)
                        new ItemStack(ModBlocks.BREADBLOCK.get(), 1),
                        // Maximum number of trades the villager can offer (e.g., 3 trades)
                        3,
                        // Villager XP gained when this trade is completed
                        8,
                        // The price multiplier (increases cost after repeated trades)
                        0.075f
                ));
                //You can also add more trade for farmer in here
        }
        //if(event.getType() == VillagerProfession.LIBRARIAN){
         //   Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event .getTrades();
          //  ItemStack enchantedBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance((Holder<Enchantment>) Enchantments.MENDING,2));
        //}
    }
}
