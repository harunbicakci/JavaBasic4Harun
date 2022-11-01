package com.neotech.lesson16;

public class StringRegularExpressions {
	public static void main(String[] args) {
		
		String greeting = "Good morning";
		
		// replace 
		String newGreeting = greeting.replace('o', 'u');
		System.out.println(newGreeting);
		
		String otherGreeting = greeting.replace("morning", "afternoon");
		System.out.println(otherGreeting);
		
		String lastGreeting = greeting.replace("morning", "evening");
		System.out.println(lastGreeting);
		
		String replaceMultiple = greeting.replace('o', 'u').replace('n', 'i');
		System.out.println(replaceMultiple);
		
		// replaceAll()
		String combination = "My phone # is 345-678-99-00";
		System.out.println(combination);
		
		String combination2 = combination.replaceAll("[0-9]", "*");
		System.out.println(combination2);
		
		String combination3 = combination.replaceAll("[a-z]", "+");
		System.out.println(combination3);
		
		String combination4 = combination.replaceAll("[A-Z]", "+");
		System.out.println(combination4);
		
		String combination5 = combination.replaceAll("[a-zA-Z]", "+");
		System.out.println(combination5);
		
		String combination6 = combination.replaceAll("[^0-9]", "");
		System.out.println(combination6);
		
		String combination7 = combination.replaceAll("[0-9a-zA-Z]", "=");
		System.out.println(combination7);
		
		String combination8 = combination.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(combination8);
		
		
	}
}
