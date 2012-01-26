package com.danandland.plugins.danandtowns.resident;

import java.util.Set;
import java.util.TreeSet;

import org.bukkit.entity.Player;

public class DATPlayer {
	public static int MAX_POWER = 10;
	public static int MIN_POWER = -10;
	
	/*protected*/public String player;
	private Set<Player> friends;
	private int power;
	
	// Area marking
	protected AreaMarking areaMarking;
	
	public DATPlayer(String player){
		this.player = player;
		this.areaMarking = new TwoPointAreaMarking();
		this.friends = new TreeSet<Player>();
		/**
		 * TESTING
		 */
		this.power = MAX_POWER;
		/**
		 * TESTING\
		 */
	}

	public AreaMarking getAreaMarking() {
		return areaMarking;
	}
}
