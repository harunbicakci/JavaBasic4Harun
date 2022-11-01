package com.neotech.lesson07;

public class IntroToSwitch {
	public static void main(String[] args) {
		
		int day = 3;
		// given day 
		
		String dayName = "Monday";;
		
		if ( day == 1 ) {
//			System.out.println("Monday");
			dayName = "Monday";
		} else if ( day == 2 ) {
//			System.out.println("Tueday");
			dayName = "Tuesday";
		} else if ( day == 3 ) {
//			System.out.println("Wednesday");
			dayName = "Wednesday";
		} else if ( day == 4 ) {
//			System.out.println("Thursday");
			dayName = "Thursday";
		} else if ( day == 5 ) {
//			System.out.println("Friday");
			dayName = "Friday";
		} else if ( day == 6 ) {
//			System.out.println("Saturday");
			dayName = "Saturday";
		} else if ( day == 7 ) {
//			System.out.println("Sunday");
			dayName = "Sunday";
		} else {
//			System.out.println("Invalid Day.");
			dayName = "Invalid Day!";
		}
		
		// using SWITCH CASE.
		
		switch (day) { // we use the variable that we want to compare the value.
		case 1: 
//			System.out.println("Monday");
			dayName = "Monday";
			break; // break means --> end of execution or after doing this condition get out of switch.
		case 2:
//			System.out.println("Tuesday");
			dayName = "Tueday";
			break;
		case 3:
//			System.out.println("Wednesday");
			dayName = "Wednesday";
			break;
		case 4: 
//			System.out.println("Thursday");
			dayName = "Thursday";
			break;
		case 5: 
//			System.out.println("Friday");
			dayName = "Friday";
			break;
		case 6: 
//			System.out.println("Saturday");
			dayName = "Saturday";
			break;
		case 7: 
//			System.out.println("Sunday");
			dayName = "Sunday";
			break;
		default:
//			System.out.println("Invalid");
			dayName = "Invalid Day!";
			break;
		
		}
		
		
		
		
		
	}
}
