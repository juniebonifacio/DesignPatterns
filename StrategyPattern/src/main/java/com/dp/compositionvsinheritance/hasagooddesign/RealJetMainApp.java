package com.dp.compositionvsinheritance.hasagooddesign;

public class RealJetMainApp {

	public static void main(String[] args) {
		System.out.println("This is the Strategy Pattern. Use HAS-A over IS-A.");
		Jet jet = new Jet();

		jet.setGoAlgorithm(new GoByDrivingAlgorithm());
		jet.go();
		
		jet.setGoAlgorithm(new GoByFlyingFastAlgorithm());
		jet.go();
		
		jet.setGoAlgorithm(new GoByDrivingAlgorithm());
		jet.go();
	}

}
