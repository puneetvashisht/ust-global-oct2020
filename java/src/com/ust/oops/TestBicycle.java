package com.ust.oops;

public class TestBicycle {
	
	public static void main(String[] args) {
		
		Bicycle mountainBicycle = new MountainBicycle(5);
		Bicycle roadBicycle = new RoadBicycle(10);
//		Bicycle b = new Bicycle(20);
		
		Bicycle sportsBike = new SportsBike(50, 3000);
		Bicycle regularBike = new RegularBike(20, 300);
		

		// Polymorphism is side benefit of using inheritance
		Bicycle bicycles[] = {mountainBicycle, roadBicycle, sportsBike, regularBike};
		
		for(Bicycle bicycle: bicycles){
			
			
			System.out.println(bicycle);
			bicycle.speedUp();
			System.out.println(bicycle);
			bicycle.brakeDown();
			System.out.println(bicycle);
			
			if(bicycle instanceof MotorBike){
				MotorBike motorBike = (MotorBike) bicycle;
				motorBike.engineStart();
			}
			
			
		}
	}

}
