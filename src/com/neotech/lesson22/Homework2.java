package com.neotech.lesson22;

public class Homework2 {
//	Homework 2:
//	    Create a class with 3 overloaded static methods.
//	    Then call each overloaded methods with specific arguments and observe the results.

	static void method1(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}
	
	static void method1(int num1, int num2) {
		System.out.println("The sum of numbers " + num1 + " and " + num2 + " is " + (num1+num2) + ".");
	}
	static void method1(String name, String country, int age) {
		System.out.println(name + " from " + country + " is " + age + " years old.");
	}
	
	public static void main(String[] args) {
		
		Homework2.method1("Harun", 39);
		Homework2.method1(19, 23);
		Homework2.method1("Harun", "Turkey", 39);
	}
}
