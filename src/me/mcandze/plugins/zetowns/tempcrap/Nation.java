package me.mcandze.plugins.zetowns.tempcrap;

import java.util.Set;

import me.mcandze.plugins.zetowns.ZeTowns;


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
