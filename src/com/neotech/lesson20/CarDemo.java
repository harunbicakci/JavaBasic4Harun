package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {
		
		//how did we create and initialize an object
		Car c = new Car();
		c.make = "Toyota";
		c.model = "Camry";
		c.year = 2020;
		
		c.printDetails();
		
		//with parametrized constructor
		Car c2 = new Car("BMW", "M5", 2021);
		c2.printDetails();
		
		//if we create a parameterized constructor but we dont include a default constructor
		//we are intentionally leaving only one way to create an object
		Car c3 = new Car("MB", "E350", 2021);
		

	}

}
