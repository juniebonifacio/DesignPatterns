package com.dp.compositionvsinheritance.hasagooddesign;

public class Helicopter extends Vehicle {

	public Helicopter() {
		// no-arg constructor
		setGoAlgorithm(new GoByFlyingAlgorithm());
	}
}
