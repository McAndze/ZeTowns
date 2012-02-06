package me.mcandze.bukkit.plugins.resident;

import me.mcandze.bukkit.plugins.ZeTowns;
import me.mcandze.bukkit.plugins.area.Area;
import me.mcandze.bukkit.plugins.area.TwoPointArea;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class TwoPointAreaMarking implements AreaMarking{
	public static int MARKING_ITEM = Material.WOOD_HOE.getId();
	
	private Location location1 = null;
	private Location location2 = null;
	
	@Override
	public boolean isValid(){
		if (location1 != null && location2 != null){
			return true;
		}
		return false;
	}
	
	public Area getArea(){
		if (!isValid()){
			return null;
		}											// May not need cloning?
		TwoPointArea toReturn = new TwoPointArea(location1.clone(), location2.clone());
		this.reset();
		return toReturn;
	}
	
	public void reset(){
		location1 = null;
		location2 = null;
	}
	
	// Returns true if player actually marks. Should check first if ItemStack equals MARKING_ITEM
	@Override
	public boolean mark(PlayerInteractEvent event){
		if (!event.hasBlock()){
			return false;
		}
		Player player = event.getPlayer();
		Block block = event.getClickedBlock();
		Action action = event.getAction();
		if (action.equals(Action.LEFT_CLICK_BLOCK)){
			location1 = block.getLocation();
			player.sendMessage("§6[" + ZeTowns.tag + "]§f First point marked.");
			event.setCancelled(true);
			return true;
		} else if (action.equals(Action.RIGHT_CLICK_BLOCK)){
			location2 = block.getLocation();
			player.sendMessage("§6[" + ZeTowns.tag + "]§f Second point marked.");
			event.setCancelled(true);
			return true;
		}
		
		return false;
	}
}
