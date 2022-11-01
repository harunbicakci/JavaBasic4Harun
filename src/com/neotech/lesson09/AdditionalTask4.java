package com.neotech.lesson09;

import java.util.Scanner;

public class AdditionalTask4 {
	public static void main(String[] args) {
//		▪ Write a program to ask a user to enter item they want to buy
//		and the price of that item. Every time user enters money
//		accumulate the amount and tell the user how much is left to
//		pay off. If user give more money program should return a
//		change. Whenever a user done with payments program
//		should say "Thank you for shopping!"
				
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		boolean continueShopping = true;
		do {
		System.out.println("Enter the item you want to buy:");
		String item = scan.next();
		System.out.println("Enter the price of the item:");
		int price = scan.nextInt();
		sum += price;
		System.out.println("The balance to pay-off is: $" + sum + "\nDo you want to continue shopping?");
		String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
			} else {
				break;
			}
		} while (continueShopping);
		
		System.out.println("Your balance is: $" + sum + ". Enter the amount of cash you will pay:");
		int payOff = scan.nextInt();
		System.out.println("Here is your change: $" + (payOff - sum) + ".");
		System.out.println("Thank you for shopping!");
		
		// FOR LOOP
		
		
		
		
	}
}
