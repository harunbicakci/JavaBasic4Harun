package com.neotech.lesson13;

public class Homework1307 {
	public static void main(String[] args) {
		
		// Write a Java program to find second largest number in the 2D array.
		// Find the max and min number in array.
		
		int[][] numbers = {
				{34, 56, 13, 26, 78, 46},
				{48, 8, 23, 66, 15, 68, 95, 56, 58},
				{12, 78, 38, 89, 78}
		};
		int maxNo = numbers[0][0];
		int minNo = numbers[0][0];
		int secondMax = numbers [0][0];
		
		for ( int row = 0; row < numbers.length; row++) {
			for ( int col = 0; col < numbers[row].length; col++) {
			if ( numbers[row][col] >maxNo) {
					maxNo = numbers[row][col];
				} else if ( numbers[row][col] < minNo) {
					minNo = numbers[row][col];
				}
			}
		}
		
		for ( int[] singleRow : numbers) {
			for ( int number : singleRow) {
				if ( secondMax < number && number < maxNo ) {
					secondMax = number;
				}
			}
		}
		System.out.println("Max number in 2D array is --> " + maxNo);
		System.out.println("Min number in 2D array is --> " + minNo);
		System.out.println("Second max number in 2D array is --> " + secondMax);
	}
}
