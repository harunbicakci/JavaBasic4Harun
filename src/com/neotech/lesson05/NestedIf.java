package com.neotech.lesson05;

public class NestedIf {
	public static void main(String[] args) {

		// if it is morning --> say good morning
		// if its a school day --> you are at school
		// else --> you are at home
		// else (not morning) --> go afternoon

		boolean isMorning = true;
		boolean isSchoolDay = true;

		if (isMorning) {
			System.out.println("Good morning!");
			
			if (isSchoolDay) {
				System.out.println("You are at school.");
			} else {
				System.out.println("You are home.");
			}

		} else {
			System.out.println("Good afternoon.");
		}

	}
}
