package com.scrabosoft.scraboskibidi.item;
import com.scrabosoft.scraboskibidi.ScraboSkibidi;
import com.scrabosoft.scraboskibidi.entity.ModEntities;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScraboSkibidi.MODID);
    
    public static final RegistryObject<Item> TOILET_SPAWN_EGG = ITEMS.register("toilet_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.TOILET, 0x7E9680, 0xC5D1C5, new Item.Properties()));

  public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }           
}
