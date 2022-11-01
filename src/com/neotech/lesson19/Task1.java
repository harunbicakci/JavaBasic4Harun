package com.neotech.lesson19;

public class Task1 {

//	▪ Create a method that will accept an array as
//	parameters and will return a sum of all elements from
//	that array. Method should be visibly only within same
//	package and accessible by the creating an instance
//	of the class.

	// method:
	// return type (output): int (the sum)
	// parameters (input): int[] (array of integers)
	// access modifier: default
	// static method: no, you have to create an instance
					// you have to create an object
	
	int sum(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
}
