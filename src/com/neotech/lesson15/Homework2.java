package com.neotech.lesson15;

import java.util.Scanner;

public class Homework2 {

//		Create a class Student that will have a method getGrade.
//		Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score > 80 - B
//		score > 70 - C
//		score > 50 - D
//		anything else - F
	
		int getGrade(int i	) {
			if (i <= 100 && i >= 90) {
				System.out.println("Your grade is A.");
			} else if (i < 90 && i >= 80) {
				System.out.println("Your grade is B.");
			} else if (i < 80 && i >= 70) {
				System.out.println("Your grade is C.");
			} else if (i < 70 && i >= 50) {
				System.out.println("Your grade is D.");
			} else if (i < 50 && i >= 0) {
				System.out.println("Your grade is F.");
			} else {
				System.out.println("Invalid entry.");
			}
			return i;
		}

		public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			Homework2 grade = new Homework2();
			
			System.out.println("Please enter your grade:");
			int userGrade = scan.nextInt();
			
			grade.getGrade(userGrade);
			
	}
}		
