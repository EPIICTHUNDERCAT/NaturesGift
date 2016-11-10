package com.EPIICTHUNDERCAT.NaturesGift.util;

import com.EPIICTHUNDERCAT.NaturesGift.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NGSoundHandler {
	public static final SoundEvent AGARIC_HURT_SOUND = create("agaric_hurt_sound");
	public static final SoundEvent AGARIC_AMBIANT = create("agaric_ambient");
	public static final SoundEvent AGARIC_DEATH_SOUND = create("agaric_death_sound");
	
	
	
	public static SoundEvent create(String name) {
        ResourceLocation resource = new ResourceLocation(Reference.ID, name);
        SoundEvent event = new SoundEvent(resource);
        GameRegistry.register(event, resource);
        return event;
    }


}
