package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {

		// Create a program that will be asking for user to apply for a credit
		// card 10 times.

		Scanner scan = new Scanner(System.in);
		// 1st method - For Loop
		String answer;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Your application is pending now.");
				break;
			}
		}

		System.out.println("*******************************");
		// 2nd method - Do-While Loop

		int a = 1;
		do {
			System.out.println("Do you want to apply for second credit card?");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Your application is pending now.");
				break;
			} else {
				a++;
			}
		} while (a <= 10);

		System.out.println("*******************************");
		// 3rd method - While Loop

		int b = 1;
		while (b <= 10) {
			System.out.println("Do you want to apply for second credit card?");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Your application is pending now.");
				break;
			} else {
				b++;
			}
		}

	}
}
