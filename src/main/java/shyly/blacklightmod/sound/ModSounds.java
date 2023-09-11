package shyly.blacklightmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import shyly.blacklightmod.BlackLightMod;

public class ModSounds {

    public static SoundEvent GLIDER = registerSoundEvent("glider");
    public static SoundEvent DRUTUTT = registerSoundEvent("drututt");


    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(BlackLightMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT,id,SoundEvent.of(id));
    }
}
