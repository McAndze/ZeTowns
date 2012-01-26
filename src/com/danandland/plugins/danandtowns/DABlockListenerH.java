package com.danandland.plugins.danandtowns;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class DABlockListenerH extends DABlockListener{
	
	public DABlockListenerH(DanAndTowns instance){
		super(instance);
	}

	@Override
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

	@Override
	public void onBlockPlace(BlockPlaceEvent event) {
		
	}
	
	
}
