package com.neotech.lesson05;

public class ElseIfCondition {
	public static void main(String[] args) {
		
		double d1 = 15.5;
		double d2 = 15; // typecasting, widening --> declaring a integer into double, automatically
		
		// d1 > d2	--> 3 possibilities
		// d1 == d2
		// d1 < d2 
		
		if (d1 > d2) {
			System.out.println("The number " + d1 + " is larger than " + d2 + ".");
		} else if (d1 == d2) {
			System.out.println("The numbers " + d1 + " and " + d2 + " are equal.");
		} else {
			System.out.println("The number " + d1 + " is smaller than " + d2 + ".");
		}
		
		System.out.println("****************");
		
		int a = 5;
		int b = 7;
		
		// possible situations:
		// 1. a == b 
		// 2. a < b same as b > a
		// 3. a > b same as b < a
		
		if ( a == b) {
			System.out.println("Number " + a + " is equal to " + b + ".");
		}else if ( a > b) {
			System.out.println("Number " + a + " is larger than " + b + ".");
		}else {
			System.out.println("Number " + a + " is smaller than " + b + ".");
		}
		
		
		
	}
}
