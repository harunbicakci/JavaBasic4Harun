package com.neotech.lesson10;

public class Task2 {
	public static void main(String[] args) {
		// get input from the user, then based on that print this structure
				// for ex: input = 6
//				1
//				22
//				333
//				4444
//				55555
//				666666
//				55555
//				4444
//				333
//				22
//				1
		
		for (int a = 1; a <=6; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		for (int c = 5; c >= 1; c--) {
			for (int d = 1; d <=c; d++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
