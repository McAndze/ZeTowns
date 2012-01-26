package com.danandland.plugins.danandtowns.listeners;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.danandland.plugins.danandtowns.DAPlayerListenerH;
import com.danandland.plugins.danandtowns.DanAndTowns;

public class DABlockListener implements Listener{
	private DanAndTowns instance;
	public DABlockListener(DanAndTowns instance){
		this.instance = instance;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onBlockBreak(BlockBreakEvent event) {
		Block evBlock = event.getBlock();
		Player player;
		boolean hasPlayer = (player=event.getPlayer()) != null;
		
		if (event.getPlayer() != null){
			// Check if block is in an area.
			if (DAPlayerListenerH.area != null){
				if (DAPlayerListenerH.area.isLocationInArea(evBlock.getLocation())){
					if (DAPlayerListenerH.resident != null){
						instance.getServer().getPlayerExact(DAPlayerListenerH.resident.player).sendMessage("No protection (normally).");
					}
					event.setCancelled(true);
				}
			}
		}
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onBlockPlace(BlockPlaceEvent event) {
		
	}
	
	
}
