package com.danandland.plugins.danandtowns.area;

import org.bukkit.Location;

public interface Area {
	public enum Permission{
		BUILD, DESTROY, ITEM, SWITCH
	}
	
	public abstract boolean isLocationInArea(Location location);
}
