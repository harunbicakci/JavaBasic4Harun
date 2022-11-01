package com.neotech.lesson16;

public class Task2 {
	public static void main(String[] args) {
		
//		Create a String and i
//		- if the String is not empty perform the following:
//		- if the String has an odd number of characters and has 3 or
//		more characters, print the character in the middle of the String.
		
		String str = "Harun Bicakci";
		
		if (!str.isEmpty()) { // if the string is not empty
			
			int length = str.length();
			
			if (length % 2 == 1 && length >=3) {
			
				System.out.println(str.charAt(length/2));
			}else { // length is even or less than 3
				
				System.out.println("Either the length is even or less than 3!");
			}
		}else  // the string is empty
			
			System.out.println("The string is empty");
	}
}
