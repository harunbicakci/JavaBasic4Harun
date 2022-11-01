package com.neotech.lesson17;

public class Task1 {
	public static void main(String[] args) {
		
//		You have a String a = "Is it saturday? Is it raining? Do we have
//				a Java Class today?" How would you find out how many
//				sentences are in that String?
		
		String sentence = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] arr = sentence.split("\\?");
		
		for ( String sentence1 : arr) {
			System.out.println(sentence1 + " ");
		}
		
		System.out.println("There are " + arr.length + " sentences.");
	
//		If you find this easy: 
//		"Is it saturday! Is it raining? Do we have
//		a Java Class today."
		
		String sen = "Is it saturday! Is it raining? Do we have a Java Class today.";
		
		String[] arr2 = sen.split("[!?.]");
		
		for( String words : arr2) {
			System.out.println(words + " ");
		}
		
		System.out.println("There are " + arr2.length + " sentences.");
		
	}
}
