package com.neotech.lesson06;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		
//		Homework
//
//		▪ Write a program to find largest of three double values using
//		if-else..if and logical operators provided by a user (numbers
//		must be distinct)
//		▪ Write a program to find largest number among three numbers
//		using nested if provided by a user (numbers must be distinct)
		Scanner scan = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Please enter 3 different numbers:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		System.out.println("You entered " + a + ", " + b + " and " + c + ".");
		
		if (a > b) {
			if (a > c) {
				System.out.println("The largest number you entered is: " + a + ".");
			} else {
				System.out.println("The largest number you entered is: " + c + ".");
			}
		} else {
			if (b > c) {
				System.out.println("The largest number you entered is: " + b + ".");
			} else {
				System.out.println("The largest number you entered is: " + c + ".");
			}
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Please enter 3 numbers.");
		int q, w, e;
		q = scan.nextInt();
		w = scan.nextInt();
		e = scan.nextInt();
		System.out.println("The numbers you entered are: " + q + ", " + w + " and " + e + ".");
		
		if (q > w && q > e) {
			System.out.println("The largest number you entered is: " + q );
		} if (w > q && w > e ) {
			System.out.println("The largest number you entered is: " + w );
		} if ( e > q && e > w) {
			System.out.println("The largest number you entered is: " + e );
		}
		
		
	}
}
