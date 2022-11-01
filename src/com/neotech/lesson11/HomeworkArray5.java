package com.neotech.lesson11;

public class HomeworkArray5 {
	public static void main(String[] args) {
		
//		3) Create an array of countries. While
//		retrieving all values from an array print
//		capital for each country.
		
		String[] country = {"Turkey", "USA", "UK", "Germany", "Spain"};
		String[] capital = {"London", "Ankara", "Madrid", "Berlin", "Washington"};
		
		System.out.println("The capital of " + country[0] + " is " + capital[1] + ".");
		System.out.println("The capital of " + country[1] + " is " + capital[4] + ".");
		System.out.println("The capital of " + country[2] + " is " + capital[0] + ".");
		System.out.println("The capital of " + country[3] + " is " + capital[3] + ".");
		System.out.println("The capital of " + country[4] + " is " + capital[2] + ".");
	}
}
