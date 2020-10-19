package com.ust.oops;

public class RoadBicycle extends Bicycle {

	
	public RoadBicycle(int maxSpeed) {
		super(maxSpeed);
	}
	
	public void speedUp(){
		this.maxSpeed += 2;
	}
	
	@Override
	public void brakeDown() {
		this.maxSpeed -=2;
	}

	@Override
	public String toString() {
		return "RoadBicycle [maxSpeed=" + maxSpeed + "]";
	}
	
	
	
}
