package me.mcandze.bukkit.plugins;

import me.mcandze.bukkit.plugins.area.TwoPointArea;
import me.mcandze.bukkit.plugins.listeners.ZePlayerListener;
import me.mcandze.bukkit.plugins.resident.Resident;
import me.mcandze.bukkit.plugins.resident.TwoPointAreaMarking;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;


public class ZePlayerListenerH extends ZePlayerListener {
	
	public ZePlayerListenerH(ZeTowns instance) {
		super(instance);
	}
	
	private Location testLocation = null;
	private Location testLocation2 = null;

	@Override
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
}