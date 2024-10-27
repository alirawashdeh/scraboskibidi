package com.scrabosoft.scraboskibidi.entity;
import com.scrabosoft.scraboskibidi.entity.custom.ToiletEntity;

import com.scrabosoft.scraboskibidi.ScraboSkibidi;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
     public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
      DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ScraboSkibidi.MODID);
      
      public static final RegistryObject<EntityType<ToiletEntity>> TOILET =
             ENTITY_TYPES.register("toilet", () -> EntityType.Builder.of(ToiletEntity::new, MobCategory.CREATURE)
            .sized( 2.5f, 2.5f).build("toilet"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
