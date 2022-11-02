package com.neotech.lesson20;

public class Car {

	String make, model;
	int year;
	
	// non-argument constructor
	Car(){
		System.out.println("I am a default constractor!");
	}
	
	Car(String carMake, String carModel, int carYear){
		System.out.println("We are creating a object with parameters");
		make = carMake;
		model = carModel;
		year = carYear;
	}
	
	void printDetails() {
		System.out.println("I have a " + year + " " + make + " " + model + " and it is great!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
