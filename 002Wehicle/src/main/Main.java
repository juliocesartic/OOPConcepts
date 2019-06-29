package main;
import domain.*;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Defining the RoadBicycle we can see all the public methods of the ancestors
		 */
		RoadBicycle myRoadBicycle = new RoadBicycle();
		myRoadBicycle.setMaximReachableVelocity(90);// kilometers/hour
		myRoadBicycle.setMaximTolerableMass(160);// Kilograms
		myRoadBicycle.setWheelsNumber(2);
		myRoadBicycle.setVelocityNumbers(12);// 2 Plates and 6 pine nuts
		myRoadBicycle.setUsefulForCompete(false); // No for compete
		myRoadBicycle.setProfessionalAmateur(false);// No only amateur
		
		//Show to the console
		
		System.out.println("Julio's bicycle information:");
		System.out.println("MaximReachableVelocity:" + myRoadBicycle.getMaximReachableVelocity() + "Km/h");
		System.out.println("MaximTolerableMass:" + myRoadBicycle.getMaximTolerableMass() + "Kg");
		System.out.println("WheelsNumber:" + myRoadBicycle.getVelocityNumbers());
		
		if(myRoadBicycle.isUsefulForCompete()) {
			System.out.println("This bicycle is Useful For Compete");
		}
		else {
			System.out.println("This bicycle is not Useful For Compete");
		}
		
		
		if(myRoadBicycle.isProfessionalAmateur()) {
			System.out.println("This bicycle is professional");
		}
		else {
			System.out.println("This bicycle is for amateur");
		}
		
		
	}
	
	
	
	
	
}
