package com.neotech.lesson18;

public class Dog {
	
	// instance /object variables
	String name;
	int age; 
	
	// static variable --> they dont change
	static String breed = "husky";
	static int paws = 4;
	
	void displayDogInfo () {
		System.out.println("Name: " + name + 
				" age: " + age + 
				" breed: " + breed +
				" paws: " + paws);
	}
	
}
