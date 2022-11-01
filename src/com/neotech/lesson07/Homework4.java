package com.neotech.lesson07;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		
//		▪ Allow user to enter grade and then provide explanation:
//		A-Excellent, B-Good, C-Average, D-Bad, any other grade
//		--> Not Acceptable.
//		At the end your program should print which grade was
//		entered by a user with explanation.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade:");
		char grade = input.next().charAt(0);
		
		switch (grade) {
			case 'A':
			case 'a':	
				System.out.println("A-Excellent!");
				break;
			case 'B':
			case 'b':
				System.out.println("B-Good.");
				break;
			case 'C':
			case 'c':
				System.out.println("C-Average.");
				break;
			case 'D':
			case 'd':
				System.out.println("D-Bad.");
				break;
			default:
				System.out.println("Grade Not Acceptable.");
				break;
		
		
		}
	}
}
