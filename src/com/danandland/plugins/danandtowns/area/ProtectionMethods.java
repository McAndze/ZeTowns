package com.danandland.plugins.danandtowns.area;

import org.bukkit.Location;

public class ProtectionMethods {
	/**
	 * Checks if the distance between two locations are less than or equal to 'range', and return
	 * true if so.
	 * @param question The location to test.
	 * @param relation The Location to test against.
	 * @param range The maximum range between them, to return true.
	 * @return true if distance is 'range' or less.
	 */
	// TESTED AND APPROVED BY MCANDZE
	public static boolean in2DRange(Location question, Location relation, double range){
		
		if (!question.getWorld().equals(relation.getWorld())){
			return false;
		}
		double qX = Math.pow(question.getX() - relation.getX(), 2);
		double qZ = Math.pow(question.getZ() - relation.getZ(), 2);
		if (Math.sqrt(qX + qZ) <= range){
			System.out.println(Math.sqrt(qX-qZ) + ":" + range);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if a location is between two other locations on the X and Z axis.
	 * @param question the Location to test
	 * @param rel1 One corner of the area
	 * @param rel2 The second corner of the area
	 * @return true of question is within the X and Z points of rel1 and rel2.
	 */
	// TESTED AND APPROVED BY MCANDZE
	public static boolean inBetween2Points2D(Location question, Location rel1, Location rel2){
		// Worlds must be the same for this to work.
		if (!(question.getWorld().equals(rel1.getWorld())
				&& question.getWorld().equals(rel2.getWorld()))){
			return false;
		}
		
		double highestX;
		double lowestX;
		
		double highestZ;
		double lowestZ;
		
		// Get the highest and the lowest x value of the relations
		double rel1X = rel1.getX();
		double rel2X = rel2.getX();
		Double drel1X = new Double(rel1X);
		Double drel2X = new Double(rel2X);
		if (drel1X.compareTo(drel2X) >= 0){
			highestX = drel1X;
			lowestX = drel2X;
		} else {
			highestX = drel2X;
			lowestX = drel1X;
		}
		
		// Do the same with Z
		double rel1Z = rel1.getZ();
		double rel2Z = rel2.getZ();
		Double drel1Z = new Double(rel1Z);
		Double drel2Z = new Double(rel2Z);
		if (drel1Z.compareTo(drel2Z) >= 0){
			highestZ = drel1Z;
			lowestZ = drel2Z;
		} else {
			highestZ = drel2Z;
			lowestZ = drel1Z;
		}
		boolean statusX;
		boolean statusZ;
		
		double qX = question.getX();
		double qZ = question.getZ();
		if (qX >= lowestX && qX <= highestX){
			/**
			 * DEBUG
			 */
			System.out.println(qX+":"+lowestX+":"+highestX);
			/**
			 * DEBUG\
			 */
			statusX = true;
		} else {
			statusX = false;
		}
		if (qZ >= lowestZ && qZ <= highestZ){
			/**
			 * DEBUG
			 */
			System.out.println(qZ+":"+lowestZ+":"+highestZ);
			/**
			 * DEBUG\
			 */
			statusZ = true;
		} else {
			statusZ = false;
		}
		// status is true if statusZ and statusX are true.
		boolean status = statusZ && statusX ? true: false;
		return status;
	}
}
