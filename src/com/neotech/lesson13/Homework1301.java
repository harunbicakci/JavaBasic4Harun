package com.neotech.lesson13;

public class Homework1301 {
	public static void main(String[] args) {
		
//		1. Create a 2D array of integer type with 3
//		rows and 4 columns and print all values
//		of the whole array.

		int[][] nums = {
				{78, 83, 98, 67},
				{88, 92, 70, 86},
				{65, 45, 55, 85}
		};
		
		for (int i = 0; i < nums.length; i++) {
			for ( int j = 0; j < nums[1].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		
		for ( int[] num : nums) {
			for ( int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		}
	}
}
