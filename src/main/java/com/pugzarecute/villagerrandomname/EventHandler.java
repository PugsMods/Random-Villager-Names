package com.pugzarecute.villagerrandomname;

import com.electronwill.nightconfig.toml.TomlParser;
import net.minecraft.entity.EntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Mod.EventBusSubscriber(modid = VillagerRandomName.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
    @SubscribeEvent
    public static void onEntitySpawn(EntityJoinWorldEvent event){
        if(event.getEntity().getType() == EntityType.VILLAGER){
            if(!event.getEntity().hasCustomName()){
                String[] nawme = {"Kritzkon","Raone","Fenris","Dolle","Synlek","Frank","Harold","Violager","Héloer",""};
                ITextComponent name = ITextComponent.getTextComponentOrEmpty("UIEHFUIWE");
                //TODO: COLORS //name.getStyle().setColor()
                event.getEntity().setCustomName(name);
            }
        }
    }
}
