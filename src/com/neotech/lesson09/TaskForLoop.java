package com.neotech.lesson09;

public class TaskForLoop {
	public static void main(String[] args) {
	
//		Print numbers from 1 to 100 in 1 line with space
//		Print numbers from 100 to 1
//		Print even numbers from 20 to 1 (2 ways)
//		Print odd numbers between 20 and 50 (2 ways)

		// 1st Example
		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println("");
		
		// 2nd Example
		for (int b = 100; b>=1; b--) {
			System.out.print(b + " ");	
		}
		System.out.println("");
		
		// 3rd Example
		for ( int c = 20; c >= 1; c--) {
			if ( c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println("");
		
		// 4th Example 1st way
		for ( int d = 20; d <= 50; d++) {
			if( d % 2 == 1) {
				System.out.print(d + " ");
			}
		}
		System.out.println("");
		
		// 4th Example 2nd way
		for ( int e = 21; e <= 50; e += 2) {
			System.out.print(e + " ");
		}
	}
}
