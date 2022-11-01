package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		// lets create some cars for our shop

				Car car1 = new Car();
				car1.make = "Toyota";
				car1.model = "Camry";
				car1.color = "Black";
				car1.year = 2019;
				car1.mileage = 25000;
				car1.maxSpeed = 200;

				System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year + " " + car1.mileage + " "
						+ car1.maxSpeed);

				car1.drive();
				car1.stop();
				car1.transportPeople();

				Car car2 = new Car();
				car2.make = "Honda";
				car2.model = "Accord";
				car2.color = "Blue";
				car2.year = 2020;
				car2.mileage = 15000;
				car2.maxSpeed = 250;

				System.out.println(car2.make + " " + car2.model + " " + car2.color + " " + car2.year + " " + car2.mileage + " "
						+ car2.maxSpeed);
		
				car2.drive();
				car2.stop();
				car2.transportPeople();

				Car car3 = new Car();
				car3.make = "Ford";
				car3.drive();
	}
}
