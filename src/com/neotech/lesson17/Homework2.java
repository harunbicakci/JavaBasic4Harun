package com.neotech.lesson17;

public class Homework2 {
	public static void main(String[] args) {
		
//		Homework 2:
//	    Write a program to print out the following conversion:
//	    Today is Tuesday and we have a Java Class!!!  to 
//	    yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
//	    You can use any other string as long as the format is correct.
		
		String sentence = "Today is Tuesday and we have a Java Class!!!";
		System.out.println(sentence);
		
		String[] words = sentence.split(" ");
		
		for ( int i = 0; i < words.length; i++) {
			
			char[] letters = words[i].toCharArray();
			
				for ( int j = letters.length-1; j >= 0; j--) {
					System.out.print(letters[j]);
				}
				System.out.print(" ");
		}
		
	}
}
