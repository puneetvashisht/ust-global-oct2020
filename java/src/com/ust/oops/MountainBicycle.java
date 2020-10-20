package com.ust.oops;

public class MountainBicycle extends Bicycle {
	
	public MountainBicycle(int maxSpeed) {
		super(maxSpeed);
	}

	
	@Override
	public void speedUp() {
		this.maxSpeed += 1;
	}
	
	@Override
	public void brakeDown() {
		this.maxSpeed -=1;
	}
//	public void speedUp(){
//		
//		
//	}

	
	@Override
	public String toString() {
		return "MountainBicycle [maxSpeed=" + maxSpeed + "]";
	}


	

	
	
}
