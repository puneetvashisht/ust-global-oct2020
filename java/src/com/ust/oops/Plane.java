package com.ust.oops;

public class Plane extends Vehicle {
	
	int altitude;

	public Plane(int speed, int altitude, Engine engine) {
		super(speed);
		this.altitude = altitude;
		this.engine = engine;
	}
	
//	@Override
//	public void start() {
//		// start plane engine
//		System.out.println(this.engine);
//		// print plane properties
//		System.out.println(this);
//		
//	}

	@Override
	public String toString() {
		return "Plane [altitude=" + altitude + ", speed=" + speed + ", engine=" + engine + "]";
	}

	
	
	
	
	

}
