package com.dp.compositionvsinheritance.hasagooddesign;

public class StreetRacer extends Vehicle {

	public StreetRacer() {
		// no-arg constructor
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
	
}
