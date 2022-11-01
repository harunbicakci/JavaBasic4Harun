package com.neotech.lesson13;

public class Homework_SecondLargestNumberInArray {
	public static void main(String[] args) {
		
		// Write a java program to find the second largest number in 2 D Array.
		// Also Max and min number in the array.
		
		int[][] numbers = {
				{ 56, 78, 23, 35},
				{ 66, 46, 34, 89},
				{ 67, 90, 12, 67}
		};
		
		int maxNo = numbers[0][0];
		int minNo = numbers[0][0];
		int secondMax = numbers[0][0];
		
		for ( int i = 0; i < numbers.length; i++) {
			for ( int j = 0; j < numbers[i].length; j++) {
				if ( maxNo < numbers[i][j]) {
					maxNo = numbers[i][j];
				} if ( minNo > numbers[i][j]) {
					minNo = numbers[i][j];
				}
			}
		}
		System.out.println("The largest number in 2D Array is: " + maxNo);
		System.out.println("The smallest number in 2D Array is: " + minNo);
		
		for ( int[] single : numbers) {
			for ( int number : single) {
				if ( number < maxNo && number > secondMax) {
					secondMax = number;
				}
			}
		}
		System.out.println("And the second largest number is: " + secondMax);
		
	}
}
