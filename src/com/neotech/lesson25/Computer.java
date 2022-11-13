package com.neotech.lesson25;

public class Computer {

//	Homework: 
//    ▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//    ▪ Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
//    ▪ Define some methods specific to the child classes.
//    ▪ Create objects of the child classes and store them in an array.
//    ▪ Loop through each object and execute available methods.

	String brand;

// By not using the default constructor we force users
// to to enter the brand when they create an object!!!
	public Computer(String brand) {
		this.brand = brand;
	}

	public void run() {
		System.out.println(brand + " computer can run the system!");
	}

}

class Apple extends Computer {

	public Apple(String brand) {
		super(brand);
	}

// override the run() method
	public void run() {
		System.out.println(brand + " computer runs fasters!");
	}

	public void safe() {
		System.out.println(brand + " is very safe!");
	}

}

class Lenovo extends Computer {

	public Lenovo(String brand) {
		super(brand);
	}

	@Override
	public void run() {
		System.out.println(brand + " computer runs even fasters!");
	}

	public void save() {
		System.out.println(brand + " computer saves a lot of data!");
	}

}

class HP extends Computer {

	String color;

	HP(String brand, String color) {
		super(brand);
		this.color = color;
	}

	@Override
	public void run() {
		System.out.println(brand + " computer runs slow!");
	}

	public void save() {
		System.out.println(brand + " computer does not have a big storage!");
	}

}

class Dell extends Computer {
	
	public Dell(String brand){
		super(brand);
	}
// Let's not override the run() method

}
