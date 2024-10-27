package com.scrabosoft.scraboskibidi.event;

import com.scrabosoft.scraboskibidi.ScraboSkibidi;
import com.scrabosoft.scraboskibidi.entity.client.ModModelLayers;
import com.scrabosoft.scraboskibidi.entity.client.ToiletModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ScraboSkibidi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.TOILET_LAYER, ToiletModel::createBodyLayer);
    }
}
