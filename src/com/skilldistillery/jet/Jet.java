package com.skilldistillery.jet;

public abstract class Jet {
//	fields
	private String model;
	private double speed;
	private int range;
	private long price;
	
//	no arg constructor
	public Jet() {
		
	}
//	constructor 
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	
//	Getters/Setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
//	toString method 
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	public void fly() {
		double time = range/speed;
		System.out.printf("Here is a %s with a %f MPH speed. It can fly for %f hours "
				+ "before it needs to be refuled. Once refueled, it has a range of %d miles.\n",
				this.getModel(), 
				this.getSpeed(), 
				time,
				this.getRange());
	}
	
	public void getSpeedInMach() {
		double mach = this.speed/761;
	}

}

