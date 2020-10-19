package com.ust;

public class Vehicle extends Object{
	//state/fields
	private int speed;
	
	//Constructor
	public Vehicle(int speed){
		if(speed>=0){
			this.speed = speed;
		}	
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
