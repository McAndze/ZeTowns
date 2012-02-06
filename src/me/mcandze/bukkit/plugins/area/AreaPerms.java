package me.mcandze.bukkit.plugins.area;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class AreaPerms {
	public enum Permission{
		BUILD, DESTROY, ITEM, SWITCH
	}
	
	// f = friend/resident | r = resident/friend | a = ally | o = outsider | p = 
	private String buildPerms;
	private String destroyPerms;
	private String itemPerms;
	private String switchPerms;
	
	
	
	
	/*
	 * STATIC
	 */
	// f = friend
	
	public static HashMap<World, HashMap<AreaPerms.Permission, Boolean>> worldOverrides = 
		new HashMap<World, HashMap<AreaPerms.Permission, Boolean>>();
	
	/**
	 * TESTING
	 */
	public static void initialize(){
		World world = Bukkit.getServer().getWorld("world");
		HashMap<AreaPerms.Permission, Boolean> map = new HashMap<AreaPerms.Permission, Boolean>();
		map.put(AreaPerms.Permission.SWITCH, new Boolean(true));
	}
	/**
	 * TESTING\
	 */
}
