package com.neotech.lesson22;

public class Homework3 {
//	Homework 3:
//	    Create a class with 3 overloaded private methods.
//	    Then call each overloaded methods with specific arguments and observe the results.

	private void method(String name, long ssn) {
		System.out.println( name + "`s SSN number is " + ssn + ".");
	}
	private void method(double price, int count) {
		System.out.println("You can order over " + count + " pieces of same color tshirts for $" + price + ".");
	}
	private void method(String name, String country) {
		System.out.println("%70 of the class is from " + country + ", including " + name + ".");
	}
	
	public static void main(String[] args) {
		Homework3 user = new Homework3();
		user.method("Harun", 123456789L);
		user.method(29.95, 40);
		user.method("Harun", "Turkey");
	}
}
