package com.neotech.lesson12;

public class Homework2 {
	public static void main(String[] args) {
		
//		2. Create an array on integers and
//		calculate the sum of all integer
//		elements in an array.
		
		int[] numbers = {68, 44, 56, 88, 100};
		double sum = 0;
		double avr;
		
		
		for ( int number : numbers) {
			sum += number;	
		}
		avr = sum/numbers.length;
		System.out.println("The sum of the numbers in array is: " + sum);
		System.out.println("The average of numbers in array is: " + avr);
	}
}
