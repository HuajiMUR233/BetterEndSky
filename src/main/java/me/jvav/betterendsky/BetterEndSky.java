package me.jvav.betterendsky;

import net.minecraft.world.level.Level;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.fabricmc.api.ClientModInitializer;

public class BetterEndSky implements ClientModInitializer {
    public static final String MOD_ID = "betterendsky";

    @Override
    public void onInitializeClient() {
        DimensionRenderingRegistry.registerSkyRenderer(Level.END, new BetterEndSkyRenderer());
    }
}
