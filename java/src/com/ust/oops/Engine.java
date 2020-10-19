package com.ust.oops;

public class Engine {
	
	String make;
	int power;
	public Engine(String make, int power) {
		super();
		this.make = make;
		this.power = power;
	}
	public Engine() {
		super();
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [make=" + make + ", power=" + power + "]";
	}
	
	
	
	

}
