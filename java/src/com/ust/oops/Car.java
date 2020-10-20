package com.ust.oops;

public class Car extends Vehicle{
	
	int enginePower;
	String color;
	public Car(int speed, int enginePower, String color, Engine engine) {
		super(speed, engine);
		this.enginePower = enginePower;
		this.color = color;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Car [enginePower=" + enginePower + ", color=" + color + ", speed=" + speed + ", engine=" + engine + "]";
	}
//	@Override
//	public void start() {
//		// start car engine
//		System.out.println(this.engine);
//		
//		// print car properties
//		System.out.println(this);
//		
//	}
	
	


	
	
	

}
