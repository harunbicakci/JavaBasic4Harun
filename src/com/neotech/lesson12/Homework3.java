package com.neotech.lesson12;

public class Homework3 {
	public static void main(String[] args) {
		
//		3. Create an array of countries. While
//		retrieving all values from an array
//		print capital for each country. (use 2
//		different loops).
	
		String[] countries = {"Turkey", "USA", "Germany"};
		String[] capitals = {"Ankara", "Washington DC", "Berlin"};
		
		for( int i = 0; i < countries.length; i++) {
				System.out.println(capitals[i] + " is the capital of " + countries[i] + ".");		
		}
		
		System.out.println("\n**************************\n");
		
	
	}
}
