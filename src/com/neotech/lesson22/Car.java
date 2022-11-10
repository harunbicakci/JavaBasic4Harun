package com.neotech.lesson22;

public class Car {


	/*
	 * Write a Java program called Car. 
	 * Specify features and behaviors of the Car class. 
	 * Create SportsCar and FamilyCar subclasses of the Car class with their
	 * own features and behaviors. 
	 * Next, create a LuxurySportsCar that will inherit the SportsCar and also 
	 * will have its own features and behaviors. 
	 * Create objects from each class and test them.
	 */
	
	String make, model;
	
	
	//Car class constructors:
		// their name is same as the class name
		// they have no return type
	Car()
	{
		System.out.println("Car Default Constructor");
	}
	
	Car(String make, String model)
	{
		this.make = make;
		this.model = model;
	}
	
	void driving()
	{
		System.out.println("Car is driving!");
	}
	
}
