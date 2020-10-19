package com.ust.oops;

public class PlaneEngine extends Engine {
	
	int thrust;
	


	public PlaneEngine(String make, int power, int thrust) {
		super(make, power);
		this.thrust = thrust;
	}

	public int getThrust() {
		return thrust;
	}

	public void setThrust(int thrust) {
		this.thrust = thrust;
	}

	@Override
	public String toString() {
		return "PlaneEngine [thrust=" + thrust + ", make=" + make + ", power=" + power + "]";
	} 
	
	
	
	

}
