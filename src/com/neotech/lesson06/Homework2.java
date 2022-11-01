package com.neotech.lesson06;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		
//		Additional Task

//		▪ Write a program that will read three inputs of scores (quiz, mid
//		term, and final scores) and determine the grade based on the
//		following rules:
//		if the average score >=90 → grade=A
//		if the average score >= 70 and <90 → grade=B
//		if the average score>=50 and <70 → grade=C
//		if the average score<50 → grade=F
//		▪ Write a program for user to enter his/her birth month.
//		Based on the month define the season.
//		Example: if user is born in June, July or August → season
//		=”Summer”.
//		At the end of the program we should see output as “You were
//		born ______”.
//		
		Scanner input = new Scanner(System.in);
		
		int quiz, midTerm, finall;
		quiz = 78;
		midTerm = 88;
		finall = 93;
		
		int avr = (quiz + midTerm + finall) / 3;
		
		if (avr >= 90) {
			System.out.println("Congrats! " + avr + " Your grade is A.");
		} if (avr >= 70 && avr < 90) {
			System.out.println("Well Done! " + avr + " Your grade is B.");
		} if (avr >= 50 && avr <70) {
			System.out.println("Its OK. " + avr + " Your grade is C.");
		} if ( avr < 50 ) {
			System.out.println("Sorry, you should try harder. " + avr + " Your grade is F. ");
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Please enter the month you were born:");
		String month = input.next();
		month = month.toLowerCase();
		
		if ( month.equals("june") || month.equals("july") || month.equals("august")) {
			System.out.println("You were born in Summer.");
		} else if ( month.equals("september") || month.equals("october") || month.equals("november")) {
			System.out.println("You were born in Autumn.");
		} else if ( month.equals("december") || month.equals("january") || month.equals("february")) {
			System.out.println("You were born in Winter.");
		} else if ( month.equals("march") || month.equals("april") || month.equals("may")) {
			System.out.println("You were born in Spring.");
		}
		
	}
}
