package com.neotech.lesson13;

public class Homework1306 {
	public static void main(String[] args) {
		
		// Write a Java program to find second largest number in the array.
		// Find the max and min number in array.
		
		int[] numbers = {45, 78, 24, 88, 34, 56, 98, 62};
		
		int max = numbers[0];
		int min = numbers[0];
		int secondMax = numbers[0];
		
		for ( int i = 0; i < numbers.length; i++) {
			if ( max < numbers[i] ) {
				max = numbers[i];
			} else if ( min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("The max number in array is --> " + max);
		System.out.println("The min number in array is --> " + min);
		
		for ( int number : numbers) {
			if ( number > secondMax && max > number) {
				secondMax = number;
			}
		}
		System.out.println("The second max number in array is --> " + secondMax);
	}
}
