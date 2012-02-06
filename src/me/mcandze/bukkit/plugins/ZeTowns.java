package me.mcandze.bukkit.plugins;

import me.mcandze.bukkit.plugins.listeners.ZeBlockListener;
import me.mcandze.bukkit.plugins.listeners.ZePlayerListener;

import org.bukkit.plugin.java.JavaPlugin;


public class ZeTowns extends JavaPlugin {
	public static final String name = "ZeTowns";
	public static final String tag = "ZET";
	
	
	private ZePlayerListener highPlayerListener;
	private ZeBlockListener highBlockListener;

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEnable() {
		this.highPlayerListener = new ZePlayerListener(this);
		this.highBlockListener = new ZeBlockListener(this);
	}

}
