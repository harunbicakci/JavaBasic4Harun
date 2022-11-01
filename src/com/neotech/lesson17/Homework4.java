package com.neotech.lesson17;

public class Homework4 {
	public static void main(String[] args) {
		
//		Homework 4:
//		Write a java program to reverse String? Reverse a string word
//		by word?
		
		String str = "Its time to become an QA Engineer, lets get your hands on it!!!";
		System.out.println(str);
		String[] str2 = str.split(" ");
		
		for ( String words : str2) {

			char[] letters = words.toCharArray();
			for ( int i = letters.length - 1; i >= 0 ; i--) {
				
				System.out.print(letters[i]);
			}
			System.out.print(" ");
		
		}
		System.out.println("\n*******************************************");
		// reverse char method
		
		char[] eachLetter = str.toCharArray();
		
		for ( int i = eachLetter.length - 1; i >= 0; i--) {
			System.out.print(eachLetter[i]);
		}
		
	}
}
