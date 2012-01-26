package com.danandland.plugins.danandtowns.resident;

import org.bukkit.event.player.PlayerInteractEvent;

import com.danandland.plugins.danandtowns.area.Area;

public interface AreaMarking {
	public abstract boolean isValid();
	public abstract Area getArea();
	public abstract boolean mark(PlayerInteractEvent event);
}
