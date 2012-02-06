package me.mcandze.bukkit.plugins.area;

import org.bukkit.Location;

public class TwoPointArea implements Area {
	
	private Location location1;
	private Location location2;
	
	public TwoPointArea(Location location1, Location location2){
		this.location1 = location1;
		this.location2 = location2;
	}

	@Override
	public boolean isLocationInArea(Location question) {
		return ProtectionMethods.inBetween2Points2D(question, location1, location2);
	}

}
