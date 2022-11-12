package com.neotech.lesson23;

public class Student {
//	Homework 2:
//	    ▪ Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
//	    ▪ Define common behavior within the parent class and override some of the methods in the child classes
//	    ▪ Define some methods specific to the child classes
//	    ▪ Write an example of achieving run time polymorphism
	
	void attendingClasses() {
		System.out.println("All students has to attend %95 of classes.");
	}
	void study() {
		System.out.println("Students must study hard.");
	}	
	void hobbies() {
		System.out.println("Its better if students have different hobbies.");
	}
}
class NeotechStudent extends Student{
	void attendingClasses() {
		System.out.println("Neotech students has to attend classes, or watch the videos later.");
	}
	void sdlcClasses() {
		System.out.println("For Neotech stutends SDLC Classes also important to become a tester.");
	}
}
class CollegeStudent extends Student{
	void study() {
		System.out.println("Students must do all their homeworks.");
	}
	void universityGoal() {
		System.out.println("For college students its better to have a dream university.");
	}
}
class SchoolStudent extends Student{
	void hobbies() {
		System.out.println("For students different hobbies means different friendships.");
	}
	void sports() {
		System.out.println("School students need to get involved with different sports.");
	}
}