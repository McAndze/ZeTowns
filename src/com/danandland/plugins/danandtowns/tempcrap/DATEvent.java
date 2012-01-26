package com.danandland.plugins.danandtowns.tempcrap;

import org.bukkit.World;

import com.danandland.plugins.danandtowns.area.Area;
import com.danandland.plugins.danandtowns.resident.Resident;

public class DATEvent {
	private World world;
	private Resident resident;
	private Area area;
	
	public World getWorld() {
		return world;
	}
	
	/**
	 * Careful with the setters.
	 * @param world
	 */
	public void setWorld(World world) {
		this.world = world;
	}
	public Resident getResident() {
		return resident;
	}
	
	/**
	 * Careful with the setters.
	 * @param resident
	 */
	public void setResident(Resident resident) {
		this.resident = resident;
	}
	public Area getArea() {
		return area;
	}
	/**
	 * Careful with the setters.
	 * @param area
	 */
	public void setArea(Area area) {
		this.area = area;
	}
	
}
