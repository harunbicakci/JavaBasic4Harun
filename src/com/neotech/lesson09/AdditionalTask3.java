package com.neotech.lesson09;

import java.util.Scanner;

public class AdditionalTask3 {
	public static void main(String[] args) {
		
//		▪ Write a program that reads a range of integers (start and end
//				point), provided by a user and then from that range prints the
//				sum of the even and odd integers.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two different numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Your numbers are " + a +" and " + b + ". ");
		int sumEven = 0;
		int sumOdd = 0;		
		if ( a < b) {
			while (a <= b) {
				if ( a % 2 == 0) {
					sumEven += a;
				} else if ( a % 2 == 1) {
					sumOdd += a;
				}
				a++;
			}
		} else if ( a > b) {
			while ( b <= a) {
				if ( b % 2 == 0) {
					sumEven += b;
				} else if ( b % 2 == 1) {
					sumOdd += b;
				}
				b++;
			}
		}
		System.out.println("Sum of the even numbers you entered is: " + sumEven);
		System.out.println("Sum of the odd numbers you entered is: " + sumOdd);
	}
}
