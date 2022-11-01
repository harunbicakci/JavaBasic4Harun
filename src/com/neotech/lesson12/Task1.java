package com.neotech.lesson12;

public class Task1 {
	public static void main(String[] args) {
		
		// create an array of integers and calculate the sum of all elements in the array
		// use different loops
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int total = 0;
		int avr;
		for( int number : numbers) {
			total += number;
			}
		System.out.println("The total of numbers is: " + total);
		
	}
}
