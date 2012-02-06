package me.mcandze.bukkit.plugins.resident;

import me.mcandze.bukkit.plugins.tempcrap.Town;

public class Resident extends DATPlayer{
	
	public Resident(String player){
		super(player);
	}
	
	// MAYOR VARIABLES
	public boolean ownsTown(){
		if (mayorOf == null){
			return false;
		} else {
			return true;
		}
	}
	// The town that the resident is mayor of.
	private Town mayorOf = null;
	
	// Town that player is in. Will be the same as mayorOf, if resident.ownsTown();
	private Town town = null;
	public boolean isInATown(){
		if (town == null){
			return false;
		} else {
			return true;
		}
	}
	
	
	
	///////////////////////////////////////////////////////////////
	
	
}
