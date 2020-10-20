package com.ust.oops;

public abstract class MotorBike extends Bicycle {

	int enginePower;

	public MotorBike(int maxSpeed, int enginePower) {
		super(maxSpeed);
		this.enginePower = enginePower;
	}
	
	public void engineStart(){
		System.out.println("Engine starting with power: " + this.enginePower);
	}
	
	
}
