package com.neotech.lesson06;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
//		▪ Prompt the user to enter person heights in inches. Person should
//		be classified as one of the following:
//		• short (under 60 inch)
//		• medium(between 60 -72 inch)
//		• tall (over 72 inch)
//		▪ Write a program that will print whether it is a weekend or weekday. 
//		If any day from 1-5 → output “It is a weekday” ○ 
//		Any day from 6-7 → output “It is a weekend” ○ 
//		Any other day → output “Invalid day”

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches:");
		int height = scan.nextInt();
		
		if ( height < 60 ) {
			System.out.println("Your height is short.");
		} else if ( height >= 60 && height < 72) {
			System.out.println("Your height is medium.");
		} else if ( height >= 72 && height < 95) {
			System.out.println("Your height is tall.");
		} else {
			System.out.println("Entered data is invalid!");
		}
		
		System.out.println("********************");
		
		int day = 5;
		
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5 ) {
			System.out.println("It is a weekday.");
		} else if ( day == 6 || day == 7 ) {
			System.out.println("It is weekend.");
		} else {
			System.out.println("Invalid day!");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
