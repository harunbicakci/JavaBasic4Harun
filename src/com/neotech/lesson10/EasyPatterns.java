package com.neotech.lesson10;

public class EasyPatterns {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		
		for (int a = 0; a < 5; a++) {
		System.out.print("*");
		}
		System.out.println();
		for (int a = 0; a < 4; a++) {
			System.out.print("*");
			}
		System.out.println();
		for (int a = 0; a < 3; a++) {
			System.out.print("*");
			}
		System.out.println();
		for (int a = 0; a < 2; a++) {
			System.out.print("*");
			}
		System.out.println();
		for (int a = 0; a < 1; a++) {
			System.out.print("*");
			}
		System.out.println("\n---------------------");
		//	lets use nested loops here
		// good solution
		
		for (int row = 5; row > 0; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
