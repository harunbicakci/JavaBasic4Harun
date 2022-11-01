package com.neotech.lesson09;

import java.util.Scanner;

public class HomeworkLoop {
	public static void main(String[] args) {
		
//		▪ Create a program that will be asking user to apply for a credit
//		card 10 times. As soon you get an “yes” from a user program
//		should stop asking.
		
		Scanner scan = new Scanner(System.in);
		String answer;
		for (int a = 1; a <= 10; a++) {
			System.out.println("Would you like to apply for a credit card?");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				break;
			}
		}
		System.out.println("Congrats! Your credit card application is pending now.");
	}
}
