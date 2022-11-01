package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// command + shift + o --> import java scanner.
		
		String text1, text2 , text3;
		int age, year;
		double salary;
		char gender;
		
		// be careful:
//		System.out.println("Please enter a sentence.");
//		text1 = scanner.next(); // read until the first space and give what you read.
//		System.out.println(text1);
//		
//		text2 = scanner.nextLine();
//		System.out.println(text2);
//		
//		text3 = scanner.next();
//		System.out.println(text3);
//		
	
//		System.out.println("What is your age?");
//		age = scanner.nextInt();
//		System.out.println("Age: " + age);
//		
		
//		System.out.println("Enter your age and year: ");
//		age = scanner.nextInt();
//		year = scanner.nextInt();
//		System.out.println(age + " " + year);
		
//		System.out.println("Enter your salary:");
//		salary = scanner.nextInt();
//		System.out.println(salary);
		
//		System.out.println("Enter your gender (M or F):");
//		// gender = scanner.next().charAt(0);
//		// in two steps
//		// 1. read the word in with next.
//		String str = scanner.next();
//		// 2. get the char you need with charAt 
//		gender = str.charAt(0);
//		System.out.println(gender);
	
		System.out.println("Enter your name, city, age, gender and salary:");
		// Sabah, Plattsburgh, 30, Male, 150000
		
		text1 = scanner.next();
		text2 = scanner.next();
		age = scanner.nextInt();
		gender = scanner.next().charAt(0); // because in Java indexing starts at 0.
		salary = scanner.nextDouble();
		System.out.println(text1 + " " + text2 + " " + age + " " + gender + " " + salary);
		
		
		
		
		
		
		
		
		
	}
}
