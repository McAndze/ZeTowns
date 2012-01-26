package com.danandland.plugins.danandtowns;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.java.JavaPlugin;

public class DanAndTowns extends JavaPlugin {
	public static final String name = "DanAndTowns";
	public static final String tag = "DAT";
	
	
	private DAPlayerListenerH highPlayerListener;
	private DABlockListenerH highBlockListener;

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEnable() {
		this.highPlayerListener = new DAPlayerListenerH(this);
		this.highBlockListener = new DABlockListenerH(this);
		
		this.getServer().getPluginManager().registerEvent(Event.Type.PLAYER_INTERACT, highPlayerListener, Priority.High, this);
		this.getServer().getPluginManager().registerEvent(Event.Type.BLOCK_BREAK, highBlockListener, Priority.High, this);
	}

}
