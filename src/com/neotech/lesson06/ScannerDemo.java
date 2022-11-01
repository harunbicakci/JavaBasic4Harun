package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		//	Import Scanner class
		//	Windows -> ctrl + space + o
		// 	MAC -> command + space + o 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name.");
		
		// declare a variable to catch the users input.
		String name = input.next();
		System.out.println("Nice to meet you " + name.toUpperCase()); 	// this is to turn the entry toUpperCase() 	
																		// same with toLowerCase() 
		
		System.out.println("Please enter your age");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
		
		
		System.out.println("Please enter your weight:");
		double weight = input.nextDouble();
		System.out.println("Your weight is: " + weight);
		
		
		System.out.println("Do you think if its going to rain?");
		boolean willRain = input.nextBoolean();
		System.out.println("You think its going to rain: " + willRain);
		
		if (willRain) {
			System.out.println("Bring your umbrella with you!");
		} else {
			System.out.println("Enjoy the weather!");
		}
		
		
	}
}
