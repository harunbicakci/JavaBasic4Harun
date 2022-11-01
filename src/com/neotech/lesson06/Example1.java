package com.neotech.lesson06;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
	
//		1. Write a program that asks user to enter first name and then last name. At the end system should display user’s full name.
//		2. Write a program that calculates the sum of two numbers entered by the user.
//		3. Write a program that asks user to enter two numbers and prints which one is larger.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your First Name:");
		String firstName = scan.next();
		System.out.println("Please enter your Last Name:");
		String lastName = scan.next();
		System.out.println("Nice to meet you " + firstName.toUpperCase() + " " + lastName.toUpperCase());
		
		System.out.println("**********************");
		
		System.out.println("Please enter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The sum of entered numbers are: " + (num1 + num2));
		
		System.out.println("**********************");
		
		System.out.println("Please enter two number: ");
		int x = scan.nextInt();
		int c = scan.nextInt();
		if (x>c) {
			System.out.println("Number " + x + " is larger than number " + c + ".");
		} else if (x<c) {
			System.out.println("Number " + x + " is smaller than number " + c + ".");
		} else {
			System.out.println("Entered numbers are equal.");
		}
		
	}
}
