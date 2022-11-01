package com.neotech.lesson14;

public class Student {
	// features:
	// firstName, lastName, studentId, school, gender, 
	
	String firstName, lastName, school;
	int studentId;
	char gender;
	char grade;
	
	// behaviors:
	// study(), doHomework(),
	
	void study() {
		System.out.println(firstName + " " + lastName + " is studying.");
	}
	
	void doHomework() {
		System.out.println(firstName + " is doing homework!");
	}
	
	
	
	
	
	
}
