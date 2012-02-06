package me.mcandze.bukkit.plugins.tempcrap;

import java.util.Set;

import me.mcandze.bukkit.plugins.ZeTowns;


public class Nation {
	// Plugin
	private ZeTowns instance;
	
	private String name;
	// Towns in this nation.
	private Set<Town> towns;
	private Set<Nation> enemies;
	
	
	public Nation(ZeTowns instance, String name){
		this.instance = instance;
		this.name = name;
	}
}
