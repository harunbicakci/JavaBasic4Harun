package com.neotech.lesson06;

import java.util.Scanner;

public class HomeworkTask {
	public static void main(String[] args) {
		

//	These are extra examples that you don't need to submit.
//
//	Use Scanner
//
//	1. You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
//    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
//
//	2. You are DMV representative and you need to ask customer their age.
//    If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
//
//	3. Create a Java program that will ask user to input city and temperature.
//    Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Please enter the amount you need to loan: ");
		int loanAmount = enter.nextInt();
		
		if (loanAmount <= 200000 && loanAmount > 0) {
			System.out.println("Great news! Your credit has been approved.");
			} else {
				System.out.println("Your credit score is not high enough for this amount.");
			}
		System.out.println("*********************************");
		
		System.out.println("Please enter your age:");
		int age = enter.nextInt();
		
		if (age >= 18) { 
			System.out.println("Your driver license application has been approved.");
		} else if ( age < 18 && age > 0) {
			System.out.println("You need to get a learners permit.");
		}
		
		System.out.println("*********************************");
		
		System.out.println("Please enter your city:");
		String city = enter.next();
		city = city.toUpperCase();
		System.out.println("Please enter the temperature in " + city + " as Fahrenheit:");
		int temp = enter.nextInt();
		temp = (temp-32) * 5/9;
		
		System.out.println("The temperature in " + city + " is " + temp + " degrees Celcius.");
		
	}
}
