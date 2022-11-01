package com.neotech.lesson14;

public class Dog {
//	Create a class Dog
//    features: breed, size, color and age
//    behaviors: eat(), run(), breed()
	
	String breed, size, color;
	int age;
	
	void eat() {
		System.out.println(breed + " " + size + " eats a lot!");
	}
	
	void run() {
		System.out.println(breed + " at age " + age + " likes to run all day long.");
	}
	
	void barks() {
		System.out.println(breed + " at age " + age + " barks like crazy :)");
	}
}
