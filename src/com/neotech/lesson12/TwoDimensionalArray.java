package com.neotech.lesson12;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] numbers = new int[2][4]; // [rows], [columns]

		// fill in the first row
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		// fill in the second row
		numbers[1][0] = 50;
		numbers[1][1] = 60;
		numbers[1][2] = 70;
		numbers[1][3] = 80;

		// lets print 60 on the screen
		System.out.println("Lets print 60");
		System.out.println(numbers[1][1]);

		System.out.println("Lets print 80");
		System.out.println(numbers[1][3]);

		System.out.println("----------------");
		// create a two dimensional array and set values
		int[][] nums = { { 3, 4, 5, 6 }, // row index 0
				{ 7, 8, 9, 10 }, // row index 1
				{ 11, 12, 13, 14 } }; // row index 2

		// lets print 13
		System.out.println("Lets print 13");
		System.out.println(nums[2][2]);

		// lets find what on row 3: gives a error since there is no row with
		// index = 3
		System.out.println(nums[3][0]);

		
	}
}
