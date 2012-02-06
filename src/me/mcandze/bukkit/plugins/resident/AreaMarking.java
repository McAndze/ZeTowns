package me.mcandze.bukkit.plugins.resident;

import me.mcandze.bukkit.plugins.area.Area;

import org.bukkit.event.player.PlayerInteractEvent;


public interface AreaMarking {
	public abstract boolean isValid();
	public abstract Area getArea();
	public abstract boolean mark(PlayerInteractEvent event);
}
