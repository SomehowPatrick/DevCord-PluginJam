package com.github.somehowpatrick.gamejam.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDropItemEvent;

public class GameWorldListener implements Listener {

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        event.setCancelled((event.getEntity() instanceof Player));
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onDropItem(EntityDropItemEvent event) {
        event.setCancelled(true);
    }
}
