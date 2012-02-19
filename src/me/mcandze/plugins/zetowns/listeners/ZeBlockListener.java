package me.mcandze.plugins.zetowns.listeners;

import me.mcandze.plugins.zetowns.ZeTowns;

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
		
		
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onBlockPlace(BlockPlaceEvent event) {
		
	}
	
	
}
