package com.neotech.lesson16;

import java.util.Scanner;

public class Recap1Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String fName = scan.next();
		System.out.println("Please enter your last name:");
		String lName = scan.next();
		System.out.println("Please enter your email type:");
		String eType = scan.next();
		
		
		Recap hw = new Recap();
		
		// declaring an object of Homework
		Recap hw1;
		// creating an object
		new Recap();
		
		String fullEmail = hw.createEmail(fName, lName, eType);
		System.out.println("Your full email is: " + fullEmail);
		
		
	}
}
