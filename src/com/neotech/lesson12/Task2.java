package com.neotech.lesson12;

public class Task2 {
	public static void main(String[] args) {
		
//		Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//		(use 2 different loops).
		
		String[] countries = {"Turkey", "USA", "UK", "Spain", "France"};
		String[] capital = {"Ankara", "Washington", "London", "Madrid", "Paris"};
		int i = 0;
		for (String row : countries) {
				System.out.println("The capital of " + row + " is " + capital[i]);	
				i++;
		}
	}
}
