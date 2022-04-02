package com.github.somehowpatrick.gamejam;

import com.github.somehowpatrick.gamejam.listener.GameWorldListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class GameJamPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        setup();
        this.getLogger().info("GameJamPlugin started!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("GameJamPlugin stopped!");
    }

    private void setup() {
        saveDefaultConfig();

        var manager = Bukkit.getPluginManager();
        manager.registerEvents(new GameWorldListener(), this);
    }
}
