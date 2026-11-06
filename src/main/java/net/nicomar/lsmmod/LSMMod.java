package net.nicomar.lsmmod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(LSMMod.MOD_ID)
public class LSMMod {
    public static final String MOD_ID = "lsmmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LSMMod(IEventBus modEventBus, ModContainer modContainer) {
    }
}
