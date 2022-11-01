package com.neotech.lesson16;

public class Task1 {
	public static void main(String[] args) {
		
		// Create a String and print it reverse order
		// Sunday --> yadnuS
		// combine for loop with charAt() method
		
		String day = "Sunday";
		String reverse = "";
		
		for ( int i = day.length() - 1; i >= 0; i--) {
			reverse += day.charAt(i);
			 
		}
		System.out.println(reverse);
		
		// 2nd way
		
		for ( int i = day.length() -1; i >= 0; i--) {
			System.out.print(day.toLowerCase().charAt(i));
		}
		
		
	}
}
