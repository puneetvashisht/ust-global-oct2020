package com.ust.oops;

public class RegularBike extends MotorBike {

	public RegularBike(int maxSpeed, int enginePower) {
		super(maxSpeed, enginePower);
	}

	@Override
	public void speedUp() {
		this.maxSpeed += 10;
		
	}
	
	@Override
	public void brakeDown() {
		this.maxSpeed -=10;
	}

	@Override
	public String toString() {
		return "RegularBike [enginePower=" + enginePower + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	

}
