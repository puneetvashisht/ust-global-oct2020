package com.ust;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(5);
//		v.speed = -10;
//		v.setSpeed(-10);
		
		System.out.println(v.toString());
		v.speedUp();
//		System.out.println(v);
		
		
		Car car = new Car(300, 1200, "red");
		
//		System.out.println(car);
		
		//Upcasting default
		Vehicle v1 = car;
		
		//Downcast explicit
		Car c = (Car) v1;
		
		
		Vehicle vehicleArr[] = {v, car};
		
		for(Vehicle obj : vehicleArr){
			System.out.println(obj);
		}

	}

}
