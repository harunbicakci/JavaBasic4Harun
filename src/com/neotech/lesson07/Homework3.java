package com.neotech.lesson07;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		
//		▪ Ask user to enter their country and capture it. Once values
//		are captured print which language user speaks.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Where are you from?");
		String country = scan.nextLine();
		
		switch (country) {
			case "Turkey":
				System.out.println("You speak Turkish.");
				break;
			case "UK":
			case "USA":
				System.out.println("You speak English.");
				break;
			case "Germany":
				System.out.println("Du sprechst Deutsch!");
				break;
			default: 
				System.out.println("I dont know which language you are speaking.");
				break;
		}
	}
}
