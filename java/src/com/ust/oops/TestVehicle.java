package com.ust.oops;

public class TestVehicle {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle(5);
////		v.speed = -10;
////		v.setSpeed(-10);
//		
//		System.out.println(v.toString());
//		v.speedUp();
////		System.out.println(v);
//		
//		
//		Car car = new Car(300, 1200, "red");
//		
////		System.out.println(car);
//		
//		//Upcasting default
//		Vehicle v1 = car;
//		
//		//Downcast explicit
//		Car c = (Car) v1;
		
		Engine carEngine = new Engine("ford", 2500);
		Car car = new Car(300, 1200, "red", carEngine);
		
		Engine planeEngine = new PlaneEngine("boeing", 10000, 23000);
		Plane plane = new Plane(1000, 10000,  planeEngine);
		Vehicle vehicleArr[] = { car, plane};
		
		for(Vehicle obj : vehicleArr){
//			System.out.println(obj);
			obj.start();
		}

	}

}
