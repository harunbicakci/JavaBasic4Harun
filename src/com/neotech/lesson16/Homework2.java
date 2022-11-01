package com.neotech.lesson16;

public class Homework2 {
	public static void main(String[] args) {
		
//	Homework 2:
//	    Create a String that should be combination of letters, numbers and special characters. 
//	    Find out how many alpha characters are there in the String. 
//	    (alpha characters means letters)
	 
		String password = "asd9384%^**!NKos";
		
		int passLength = password.length();
		
		System.out.println(passLength);
		
		String alphaPass = password.replaceAll("[^a-zA-Z]", "");

		System.out.println(alphaPass);
				
		System.out.println(alphaPass.length());
		
	}
}
