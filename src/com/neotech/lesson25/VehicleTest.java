package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {
		
		// its not possible to instantiate
		// Vehicle v = new Vehicle("Red");
		// Car c = new Car("Red", "Tesla");
		
		Vehicle v1 = new Tesla("Red", "Tesla"); // Up-Casting
		v1.start();
		v1.stop();
		v1.drive();
		v1.brake();
		
		// v1.display(); does not exists in vehicle class
		// v1.display();
		
		System.out.println("---------------------------");
		
		Toyota toyota1 = new Toyota("Black", "Camry");
		Vehicle toyota2 = new Toyota("Grey", "Rav4");
		
		toyota1.start();
		toyota2.start();
		
		System.out.println("---------------------------");
		
		Tesla tesla1 = new Tesla("Red", "Model S");
		Vehicle tesla2 = new Tesla("Yellow", "Model 3");
		
		tesla1.display();
		// no we can NOT, bc tesla class does not have display() method
		// tesla2.display();
		
		
		
	}
}
