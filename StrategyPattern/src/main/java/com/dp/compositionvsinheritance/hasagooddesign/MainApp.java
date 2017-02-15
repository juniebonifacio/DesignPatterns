package com.dp.compositionvsinheritance.hasagooddesign;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("This is the Strategy Pattern. Use HAS-A over IS-A.");
		
		StreetRacer streetRacer = new StreetRacer();
		FormulaOne formulaOne = new FormulaOne();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();
		
		streetRacer.go();
		formulaOne.go();
		helicopter.go();
		jet.go();
		
	}
}
