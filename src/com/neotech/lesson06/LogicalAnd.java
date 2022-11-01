package com.neotech.lesson06;

public class LogicalAnd {
	public static void main(String[] args) {
		
		// 	Declare a number
		// 	if the number is between 1-10 --> number is small.
		//	if the number is between 10-100 --> number is medium.
		//	if the number is between 100-1000 --> number is large.
		
		// declare a number 
		int number = 100; 
		
		if (number >= 1 && number <=10) {
			System.out.println("Number is small.");
		} else if ( number >= 11 && number <= 100) {
			System.out.println("Number is medium.");
		} else if ( number >= 101 && number <= 1000) {
			System.out.println("Number is large.");
		} else {
			System.out.println("Invalid number!!!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
