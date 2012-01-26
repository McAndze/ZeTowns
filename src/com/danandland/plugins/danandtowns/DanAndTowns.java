package com.danandland.plugins.danandtowns;

import org.bukkit.plugin.java.JavaPlugin;

import com.danandland.plugins.danandtowns.listeners.DABlockListener;
import com.danandland.plugins.danandtowns.listeners.DAPlayerListener;

public class DanAndTowns extends JavaPlugin {
	public static final String name = "DanAndTowns";
	public static final String tag = "DAT";
	
	
	private DAPlayerListener highPlayerListener;
	private DABlockListener highBlockListener;

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEnable() {
		this.highPlayerListener = new DAPlayerListener(this);
		this.highBlockListener = new DABlockListener(this);
	}

}
