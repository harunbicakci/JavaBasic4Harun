package com.neotech.lesson09;

import java.util.Scanner;

public class PayOffExampleForLoop {
	public static void main(String[] args) {
		
//		▪ Write a program that reads a range of integers (start and end
//		point), provided by a user and then from that range prints the
//		sum of the even and odd integers.
		
		// Lets say 1 and 6 -->
		// Even numbers: 2-4-6=12
		// Odd numbers: 1-3-5=9
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int a = scan.nextInt(), b = scan.nextInt(); a<=b; a++) {
			if ( a <= b ) {
				if (a % 2 == 0) {
				sumEven += a;
				} else if (a % 2 == 1) {
				sumOdd += a;
				}
			} else if ( a >= b ) {
				if (a % 2 == 0) {
				sumEven += a;
				a--;
				} else if ( a % 2 == 1) {
					sumOdd += a;
					a--;
				} else {
					System.out.println("Numbers are equal.");
				}
			}
		}
		System.out.println("Sum of even numbers is: " + sumEven + "\nSum of odd numbers is: " + sumOdd);
	}
}
