package com.danandland.plugins.danandtowns.tempcrap;

import java.util.Set;

import com.danandland.plugins.danandtowns.DanAndTowns;

public class Nation {
	// Plugin
	private DanAndTowns instance;
	
	private String name;
	// Towns in this nation.
	private Set<Town> towns;
	private Set<Nation> enemies;
	
	
	public Nation(DanAndTowns instance, String name){
		this.instance = instance;
		this.name = name;
	}
}
