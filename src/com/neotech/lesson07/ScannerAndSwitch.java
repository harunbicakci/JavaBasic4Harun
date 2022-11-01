package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {
	public static void main(String[] args) {
		
		// ask the user about their country and print their language they speak.
		
		Scanner scan = new Scanner(System.in);
		
		String country; 
		
		System.out.println("Please enter where you are from?");
		
		// escape character \ --> \t adds space  \:  \n  \t  \",
		System.out.println("Where are \t you from?");
		country = scan.next();
		
		// to compare strings we use .equals instead of ==
		// (country.equalsIgnoreCase("Germany")) --> to ignore case letters in answers.
		if (country.equalsIgnoreCase("Albania")) {
			System.out.println("You speak Albanian!");
		} else if (country.equals("Turkey")) {
			System.out.println("You speak Turkish!");
		} else if (country.equals("Ecuador")) {
			System.out.println("You speak Spanish!");
		} else if (country.equals("Moldova")) {
			System.out.println("Romanian.");
		} else if (country.equals("USA") || country.equals("UK")) {
			System.out.println("You speak English.");
		} else {
			System.out.println("I dont know what language you speak.");
		}
		
		
		// using SWITCH 
		
		switch (country) {
			case "Turkey":
				System.out.println("You speak Turkish");
				break;
			case "Albenia":
			case "Kosovo":
				System.out.println("You speak Albenian.");
				break;
			case "USA":
			case "UK":
				System.out.println("You speak English.");
				break;
			default: 
				System.out.println("I dont know what language you speak.");
				break;
		}
		
		
		
	}
}
