package com.neotech.lesson25;

public abstract class Vehicle {

	String color;
	
	Vehicle(String color){
		this.color = color;
	}
	
	public void drive() {
		System.out.println("Vehicle drives!");
	}
	
	public void stop() {
		System.out.println("Vehicle stops!");
	}
	
	public abstract void start();
	
	public abstract void brake();
}

abstract class Car extends Vehicle{
	
	String carType;
	
	Car(String color, String carType){
		super(color);
		this.carType = carType;
	}
	
	//implement abstract method brake()
	public void brake() {
		System.out.println(carType + " have brakes!");
	}
	
	// we can create other abstract methods here
	// public abstract void carDetails();	
}

class Tesla extends Car{

	Tesla(String color, String carType) {
		super(color, carType);
		
	}

	// implementing the abstract method
	@Override
	public void start() {
		System.out.println(carType + " starts remotely!");
	}
	
	// adding a new method
	public void display() {
		System.out.println("We have a " + color + " " + carType);
	}
}

class Toyota extends Car {

	Toyota(String color, String carType) {
		super(color, carType);
		
	}

	@Override
	public void start() {
		System.out.println("");
	}
}