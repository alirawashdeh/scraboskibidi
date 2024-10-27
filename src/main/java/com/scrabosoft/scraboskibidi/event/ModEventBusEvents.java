package com.scrabosoft.scraboskibidi.event;

import com.scrabosoft.scraboskibidi.ScraboSkibidi;
import com.scrabosoft.scraboskibidi.entity.ModEntities;
import com.scrabosoft.scraboskibidi.entity.custom.ToiletEntity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ScraboSkibidi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TOILET.get(), ToiletEntity.createAttributes().build());
    }
}
