package com.danandland.plugins.danandtowns;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.ItemStack;

public class DAPlayerListener extends PlayerListener{
	
	public DanAndTowns instance;
	
	public DAPlayerListener(DanAndTowns instance){
		this.instance = instance;
	}
	
	/**
	 * 
	 * @param event
	 * @param type 
	 * @return null if no block or air is involved, or if action does not equal action parsed.
	 */
	public Block getBlockInteracted(PlayerInteractEvent event, Material type, Action action){
		Material inHandType = event.getItem().getType();
		Action eventAction = event.getAction();
		
		
		// Return null if there is no block involved.
		if (!event.hasBlock()){
			return null;
		}
		
		
		/*
		 * if type equals null, the type doesn't matter.
		 */
		if (type.equals(null)){
			// Action doesn't matter?
			if (action == null){
				return event.getClickedBlock();
			} else if (eventAction.equals(action)){
				return event.getClickedBlock();
			}
		// Correct material?	
		} else if (inHandType.equals(type)){
			// Action doesn't matter?
			if (action == null){
				return event.getClickedBlock();
			} else if (eventAction.equals(action)){
				return event.getClickedBlock();
			}
		}
		
		// Couldn't find block, return null.
		return null;
	}

}
