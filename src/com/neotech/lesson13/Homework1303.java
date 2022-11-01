package com.neotech.lesson13;

public class Homework1303 {

	public static void main(String[] args) {
		
//		3. Create a 2D array or integer type and
//		store numbers in 3 rows and 3 columns.
//		Print the sum of all numbers.
	
		int[][]numbers = {
				{1855987, 2898123, 2345728},
				{1876923, 2659823, 1987345},
				{2000234, 2190723, 2341674},
		};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				sum += numbers[i][j];
			}
		}
		System.out.println("The sum of the numbers is --> " + sum);

		System.out.println("***********************\n");
		sum = 0;
		
		for ( int[] row : numbers) {
			for (int number : row) {
				sum += number;
			}
		}
		System.out.println(sum + " is the sum.");
	
	}
}
