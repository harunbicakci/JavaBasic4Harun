package com.neotech.lesson24;

public class Computer {

//	Homework:
//	    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//	    Define some common behavior (methods) and 
//		some fields in the parent class, and override some of the methods in the child classes.
//	    Define some methods specific to the child classes.
//	   	Create objects of the child classes and store them in an array.
//	    Loop through each object and execute available methods.

	public void operator() {
		System.out.println("Computers have different type of operators.");
	}
}

class Apple extends Computer{
	
	public void operator() {
		System.out.println("Apple has IOS operation system.");
	}
}

class Lenovo extends Computer{

	public void operator() {
		System.out.println("Lenovo uses Windows.");
	}
}

class HP extends Computer{

	public void operator() {
		System.out.println("Some HP computers have Linux.");
	}
}

class Dell extends Computer{

	public void operator() {
		System.out.println("Dell prefers to use Windows.");
	}
}