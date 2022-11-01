package com.neotech.lesson19;

public class Homework3 {

//	▪ Create a method that will accept a String as a
//	parameter and return a new String that consist only of
//	vowels. Method should be available inside the class
//	where it was declared and executed by calling it is
//	name.
	
	private static String showVowels (String str){
		
		String vowels = str.replaceAll("[^aeiou]", "");
		return vowels;
	}
	
	public static void main(String[] args) {
	
		String str2 = "This is not a game, put all your effort in and become an QA Engineer!";
		System.out.println(str2);
		
		System.out.println(Homework3.showVowels(str2));
	}
}
