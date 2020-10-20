package com.ust.oops;

public abstract class Vehicle extends Object{
	//state/fields
	int speed;
	
	Engine engine;
	
	//Constructor
	public Vehicle(int speed){
		if(speed>=0){
			this.speed = speed;
		}	
	}
	
	public Vehicle(int speed, Engine engine){
		if(speed>=0){
			this.speed = speed;
		}	
		this.engine = engine;
	}
	
	
	public  void start(){
		// start plane engine
				System.out.println(this.engine);
				// print plane properties
				System.out.println(this);
				
	}
	
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		if(speed>=0){
			this.speed = speed;
		}
	}



	//behaviour/methods
	public void speedUp(){
		this.speed ++;
	}



	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + "]";
	}
	
	
	
//	 public String toString() {
//	        return "Vehicle with speed: " + this.speed; 
//	    }



}
