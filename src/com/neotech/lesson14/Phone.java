package com.neotech.lesson14;

public class Phone {
	
//Homework 1:
//    Create a Class “Phone”. Create 3 Objects of it: 
//    	iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String model, brand;
	int memory, version;
	
	void makeCalls () {
		System.out.println(brand + " " + model + " allows you to make phone calls anytime.");
	};
	
	void textMessage () {
		System.out.println(brand + " " + model + " with version " + version + " enables you to send text messages." );
	};
	
	void internetConnection () {
		System.out.println(model + " with memory of " + memory + " gives high speed internet.");
		if ( model.equals("Nokia")) {
			System.out.println("If Nokia would have produce new age phones, it would be one of the best designs ever.");
		}
	};
}
