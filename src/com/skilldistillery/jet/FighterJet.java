package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady {
	public FighterJet() {
		
	}
	
	public FighterJet (String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fight () {
		System.out.println("The fighter jet, " + this.getModel() + ", has decided to have a food fight. SPAGHETTI EVERYWHERE.");
	}
}
