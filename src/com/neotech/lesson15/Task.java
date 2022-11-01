package com.neotech.lesson15;

public class Task {
//	method1: Create a method that will take 2 parameters as numbers
//		and prints which number is larger.
//	method2: Create a method that will take a number and prints whether
//		the number is even or odd.
//	method3: Create a method that will say Hello in a different language
//		based on the country that will passed when method is executed.

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger then " + b + ".");
		}else if ( a < b) {
			System.out.println(b + " is larger then " + a + ".");
		}else {
			System.out.println("Numbers are equal.");
		}
	}
	void evenOdd( int a) {
		if ( a % 2 == 0) {
			System.out.println(a + " is an even number.");
		}else {
			System.out.println(a + " is an odd number.");
		}	
	}
	void hello (String language) {
		if (language.equals("English")) {
			System.out.println("Hello!");
		}else if (language.equals("Spanish")) {
			System.out.println("Hola!");
		}else if (language.equals("Turkish")) {
			System.out.println("Merhaba!");
		}
	}
	public static void main(String[] args) {
		Task task1 = new Task();
		
		task1.larger(6, 8);
		task1.evenOdd(73);
		task1.hello("Spanish");
	}
}
