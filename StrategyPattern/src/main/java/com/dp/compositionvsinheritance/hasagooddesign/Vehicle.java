package com.dp.compositionvsinheritance.hasagooddesign;

public abstract class Vehicle {

	private GoAlgorithm goAlgorithm;
	
	public Vehicle() {
		// no-arg constructor
	}
	
	public void setGoAlgorithm(GoAlgorithm theGoAlgorithm){
		goAlgorithm = theGoAlgorithm;
	}
	
	public void go() {
		goAlgorithm.go();
	}
}
