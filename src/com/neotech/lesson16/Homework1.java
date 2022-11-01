package com.neotech.lesson16;

public class Homework1 {
	public static void main(String[] args) {
		
	
//	Homework 1:
//	    Create a String that will hold a sentence. Write a program to get a new String without any spaces.

	String sentence = "First rule of Fight Club, you do not talk about Figth Club.";
	
	String noSpaceSentence = sentence.replaceAll(" ", "");
	
	System.out.println(noSpaceSentence);
	
	
	
	}
}
