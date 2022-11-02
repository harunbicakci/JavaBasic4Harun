package com.neotech.lesson19;

public class Homework1901 {

//	Homework 1:
//	    Create a method that will accept a String as a parameter and 
//	    return a new String that consist only of vowels. 
//	    Method should be available inside the class where it was declared and 
// 		executed by calling it is name.

		
	
		private static String vowelString (String str){
			String vowels = str.replaceAll("[^aeiouAEIOU]", "");
			return vowels;
		}
	
	public static void main(String[] args) {
		
		String str2 = "I love Java, there is nothing that can stop me becoming an QA Engineer";
		System.out.println(str2 + "\n");
		String str3 = Homework1901.vowelString(str2);
		System.out.println(str3);
		
	
	}
}
