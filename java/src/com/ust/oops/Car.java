package com.ust.oops;

public class Car extends Vehicle{
	
	int enginePower;
	String color;
	public Car(int speed, int enginePower, String color) {
		super(speed);
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
		return "Car [enginePower=" + enginePower + ", color=" + color + ", speed=" + getSpeed() + "]";
	}
	
	


	
	
	

}
