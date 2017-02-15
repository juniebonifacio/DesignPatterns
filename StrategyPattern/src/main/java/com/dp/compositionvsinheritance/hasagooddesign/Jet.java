package com.dp.compositionvsinheritance.hasagooddesign;

public class Jet extends Vehicle {

	public Jet() {
		// no-arg constructor
		setGoAlgorithm(new GoByFlyingFastAlgorithm());
	}
}
