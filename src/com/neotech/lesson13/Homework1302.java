package com.neotech.lesson13;

public class Homework1302 {

	public static void main(String[] args) {

//		2. Create a 2D array or integer type where
//		you will store odd and even numbers in 3
//		rows and 4 columns. Develop a program
//		which will identify/print the even
//		numbers only.
		
		int[][] numbers = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
		};
		
		for ( int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <numbers[2].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.println("The number " + numbers[i][j] + " is even number." );
				}
			}
		}
		System.out.println("***********************\n");
		
		for (int []row :numbers) {
			for ( int number : row) {
				if (number % 2 == 0) {
					System.out.println(number + " is even number.");
				}
			}
		}
		
		
	}
}
