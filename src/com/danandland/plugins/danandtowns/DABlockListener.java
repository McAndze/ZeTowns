package com.danandland.plugins.danandtowns;

import org.bukkit.event.block.BlockListener;

public class DABlockListener extends BlockListener {
	public DanAndTowns instance;
	
	public DABlockListener(DanAndTowns instance){
		this.instance = instance;
	}
}
