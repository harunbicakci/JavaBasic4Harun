package com.neotech.lesson17;

public class Homework3 {
	public static void main(String[] args) {
		
//		Homework 3: 
//		Find out how many alpha characters are present in a String?
//		Find number of words in string?

		String example = "asdhjk 123kjl*()* #$&)qw ASDQW940 324 8(_#($+";
		
		String newExample = example.replaceAll("[^a-zA-Z]", "");
		System.out.println(example + " has " + newExample.length() + " alpha characters.");
		
		
		String[] arr = example.split(" ");
		
		System.out.println(arr.length);
		
		
		
	}
}
