package com.neotech.lesson04;

public class Task1 {
	// Create a int variable named number1, assign the value of 500.
		// Store/assign number1 into a byte name number2
		// Re-assign the number1 into number2.
		// Print the value of number2. Check if it is 500
		// What if the initial value was 50?
		
		public static void main(String[] args) {
			
			int number1 = 50;
			
			byte number2 = (byte) number1; // narrowing, manually
			
			System.out.println(number2);
			
			number1 = number2;
			System.out.println(number1);
			
			
			double x = 25;
			double y = 4;
			double d = x/y;
			
			int div = (int) d;
			System.out.println(div);
			
		}
}
