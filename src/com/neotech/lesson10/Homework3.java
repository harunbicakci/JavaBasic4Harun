package com.neotech.lesson10;

public class Homework3 {
	public static void main(String[] args) {
		
		// Print numbers from 1-50 except those that are divisible by 3 (3,6,9...48)
		
		// 1st method - While Loop
		int i = 1;
		while (i <= 50) {
			if ( i % 3 == 0) {
				i++;
				continue;
			} else {
				System.out.print(i + " ");
				
			}
			i++; // you can put this i++ also in else condition
		}
		System.out.println("*****************************");
		// 2nd method - Do-While Loop
		
		int j = 1;
		do {
			if ( j % 3 == 0) {
				j++;
				continue;
			}
			System.out.print(j + " ");
			j++;
		} while (j <= 50);
		
		System.out.println("*****************************");
		// 3rd method - For Loop
		
		for ( int k = 1; k <= 50; k++) {
			if ( k % 3 == 0) {
				continue;
			} else {
				System.out.print(k + " ");
			}
			
		}
	}
}
