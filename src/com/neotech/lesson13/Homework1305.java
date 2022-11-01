package com.neotech.lesson13;

public class Homework1305 {
	public static void main(String[] args) {
		
//		2. Create an array of countries: north
//		America countries, south America
//		countries, Europe countries, Asian
//		countries, African countries. Then
//		print all values from that array using
//		2 different loops and calculate how
//		many total countries been stored.
		
		String[][] countries = {
				{"USA", "Canada"},
				{"Brazil", "Argentina", "Venezuela", "Peru"},
				{"Germany", "UK", "Spain", "France", "Norway"},
				{"India", "China", "Japan", "Korea"},
				{"South Africa", "Nigeria", "Madagascar", "Morocco"}
		};
		
		for (int row = 0; row < countries.length; row++) {
				
				for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");
			}
		}
		System.out.println("\n*************************");
		
		for (String[] row : countries) {
			for (String country : row ) {
				System.out.print(country + " ");
			}
		}
	}
}
