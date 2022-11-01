package com.neotech.lesson15;

public class Calculator {

	// we want to add two numbers
	
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	void multiply ( int a, int b) {
		System.out.println( a * b);
	}
	
	void divide (double a, double b) {
		System.out.println("The division of " + a + " and " + b + " is:" + (a/b));
	}
	
	
	
}
