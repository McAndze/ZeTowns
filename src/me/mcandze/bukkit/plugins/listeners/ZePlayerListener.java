package me.mcandze.bukkit.plugins.listeners;

import me.mcandze.bukkit.plugins.ZeTowns;
import me.mcandze.bukkit.plugins.area.TwoPointArea;
import me.mcandze.bukkit.plugins.resident.Resident;
import me.mcandze.bukkit.plugins.resident.TwoPointAreaMarking;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class ZePlayerListener implements Listener{
	public ZeTowns instance;
	
	public ZePlayerListener(ZeTowns instance){
		this.instance = instance;
	}
	
	private Location testLocation = null;
	private Location testLocation2 = null;

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if (resident == null){
			resident = new Resident(player.getName());
		}
		Material matInHand = event.getMaterial();
		
		
		if (matInHand.getId() == TwoPointAreaMarking.MARKING_ITEM /*TESTING*/&& area == null /*TESTING\*/){
			if(resident.getAreaMarking().mark(event)){
				/**
				 * TESTING
				 */
				if ((area = (TwoPointArea)resident.getAreaMarking().getArea()) != null){
					player.sendMessage("§6[" + ZeTowns.tag + "]§f Area created!");
				}
				/**
				 * \TESTING
				 */
				return;
			}
		} else /*TESTING*/if (area != null/*TESTING\*/){
			/**
			 * TESTING
			 */
			if (event.hasBlock()){
				Block block = event.getClickedBlock();
				if (area.isLocationInArea(block.getLocation())){
					player.sendMessage("§6[" + ZeTowns.tag + "]§f Location in area!");
				} else {
					player.sendMessage("§6[" + ZeTowns.tag + "]§f Location not in area!");
				}
			}
			/**
			 * \TESTING
			 */
		}
	}
	
	/**
	 * TESTING
	 */
	public static Resident resident = null;
	public static TwoPointArea area = null;
	/**
	 * \TESTING
	 */
	
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
