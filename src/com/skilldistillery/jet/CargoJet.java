package com.skilldistillery.jet;

public class CargoJet extends Jet implements CargoCarrier {
	
//  constructors
	public CargoJet() {
		
	}
	
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		System.out.println("We are loading up this " + this.getModel() + " cargo jet in one...\t two...\t three...!");
	}
	
}
