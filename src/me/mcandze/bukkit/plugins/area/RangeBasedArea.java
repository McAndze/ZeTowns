package me.mcandze.bukkit.plugins.area;

import org.bukkit.Location;

public class RangeBasedArea implements Area {
	
	private int range;
	private Location location;
	
	public RangeBasedArea(Location location, int range){
		this.location = location;
		this.range = range;
	}
	
	@Override
	public boolean isLocationInArea(Location location) {
		return ProtectionMethods.in2DRange(location, this.location, range);
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	

}
