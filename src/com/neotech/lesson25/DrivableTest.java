package com.neotech.lesson25;

public class DrivableTest {

	public static void main(String[] args) {
		
	
	// I can NOT create an object
	// Drivable d1 = new Drivable();
	
	
	Drivable d2 = new Cars(); // up-casting
	d2.drive();

	System.out.println(Drivable.DRIVE_FAST);
	
	// cannot change final variable of the interface
	// Drivable.DRIVE_FAST = false;
	
	Vehicles v1 = new Cars(); 
	// v1.drive(); there is no realtion between Vehicles and Drivable
	v1.start();
	v1.stop();
	
	Cars c1 = new Cars();
	c1.drive();
	c1.start();
	c1.stop();
	
	}
}