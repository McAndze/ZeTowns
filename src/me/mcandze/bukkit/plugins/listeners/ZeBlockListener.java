package me.mcandze.bukkit.plugins.listeners;

import me.mcandze.bukkit.plugins.ZePlayerListenerH;
import me.mcandze.bukkit.plugins.ZeTowns;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;


public class ZeBlockListener implements Listener{
	private ZeTowns instance;
	public ZeBlockListener(ZeTowns instance){
		this.instance = instance;
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onBlockBreak(BlockBreakEvent event) {
		Block evBlock = event.getBlock();
		Player player;
		boolean hasPlayer = (player=event.getPlayer()) != null;
		
		if (event.getPlayer() != null){
			// Check if block is in an area.
			if (ZePlayerListenerH.area != null){
				if (ZePlayerListenerH.area.isLocationInArea(evBlock.getLocation())){
					if (ZePlayerListenerH.resident != null){
						instance.getServer().getPlayerExact(ZePlayerListenerH.resident.player).sendMessage("No protection (normally).");
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
