package com.danandland.plugins.danandtowns.resident;

public class DATPlayer {
	/*protected*/public String player;
	
	// Area marking
	protected AreaMarking areaMarking;
	
	public DATPlayer(String player){
		this.player = player;
		this.areaMarking = new TwoPointAreaMarking();
	}

	public AreaMarking getAreaMarking() {
		return areaMarking;
	}
}
