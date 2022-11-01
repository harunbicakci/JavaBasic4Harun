package com.neotech.lesson10;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {

//		Homework 2:
//		Ask the user to enter an integer and build the following pattern:
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number for pattern.");
		int num = scan.nextInt();

		for (int a = 1; a <= num; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		for (int c = num - 1; c >= 1; c--) {
			for (int d = 1; d <= c; d++) {
				System.out.print(d);
			}
			System.out.println();
		}

	}
}
