package com.ust.oops;

public class SportsBike extends MotorBike {

	public SportsBike(int maxSpeed, int enginePower) {
		super(maxSpeed, enginePower);
	}

	@Override
	public void speedUp() {
		this.maxSpeed += 20;
		
	}
	
	@Override
	public void brakeDown() {
		this.maxSpeed -=20;
	}

	@Override
	public String toString() {
		return "SportsBike [enginePower=" + enginePower + ", maxSpeed=" + maxSpeed + "]";
	}
	
	

}
