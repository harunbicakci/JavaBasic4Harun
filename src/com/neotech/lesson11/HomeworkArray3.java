package com.neotech.lesson11;

public class HomeworkArray3 {

	public static void main(String[] args) {

//		2) Create an array on integers and calculate
//		the sum of all elements in an array.
		
		int[] numbers = {30, 50, 98, 78, 85};
		int sum = 0;
		
		for (int a = 0; a < numbers.length; a++) {
			sum += numbers[a];
		}
		System.out.println("The sum of numbers are: " + sum);
		System.out.println("The average of numbers are ==> " + (sum/numbers.length));
		

	}

}
