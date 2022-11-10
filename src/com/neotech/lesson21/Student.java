package com.neotech.lesson21;

public class Student {
	// Write program as a Student class
	// that has instance variables name and address.
	// Create a constructor that will initialize those variables.
	// Print name & address of given student using displayInfo method.

	// instance variables
	String name, address;

	// 1st constructor method to for initialization
	public Student() {

	}

	// 2nd constructor method
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// 3rd constructor method
	public Student(String name) {
		this.name = name;
	}

	public void displayInfo() {
		String name = "Aykut";
		System.out.println("Name: " + name);
		System.out.println("Name -->" + this.name + " Address -->" + this.address);
	}
}
