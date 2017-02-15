package com.dp.compositionvsinheritance.hasagooddesign;

public class FormulaOne extends Vehicle {

	public FormulaOne() {
		setGoAlgorithm(new GoByDrivingFastAlgorithm());
	}
}
