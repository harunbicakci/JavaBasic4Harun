package com.neotech.lesson10;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		
//		Ask the user to enter an integer and build the following pattern:
//			 *********
//			  *******
//			   *****
//			    ***
//			     *

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = scan.nextInt();
		
		for ( int a = num; a >= 1; a--) {
			for ( int b = 0; b <= a; b++) {
				System.out.print(" "); //  space
			}
			for (int c = num; c <= (2 * a) - 1; c++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}
