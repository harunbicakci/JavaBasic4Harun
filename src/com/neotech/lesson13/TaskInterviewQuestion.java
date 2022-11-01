package com.neotech.lesson13;

public class TaskInterviewQuestion {

	public static void main(String[] args) {
	
		// find the largest number in array
		
		int[] numbers = {45, 34, 87, 33, 15, 92, 13, 55};
		
		// 1st way
		int largest = numbers[0];
		
		for ( int i = 1; i < numbers.length; i++) {
			if ( largest < numbers[i]) {
				largest = numbers[i];
			}	
		}
		System.out.println("The largest number is: " + largest);
	}
}
