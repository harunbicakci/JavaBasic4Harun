package com.neotech.lesson10;

public class Task3 {
	public static void main(String[] args) {
		
/*
		
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
			
			 */
		
		for (int row = 1; row <= 5; row++) {
			for (int spaces = 4; spaces >=row; spaces--) {
				System.out.print(" ");
			} for ( int stars = 1; stars <= row; stars++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
