package com.neotech.lesson10;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {

		// Formatting shortcut --> ctrl + shift + f
		
		// Write a program that asks the user to enter his/her username and password 
		// until user enters them correctly.
		
		// How do we decide?
		// For Loop or While Loop or Do-While Loop
		// For Loop is more suitable for a countable number of loops.
		// Here Do-While seems more suitable.
		
		Scanner scan = new Scanner(System.in);
		String userName = "shane";
		String password = "123456";
		
		String userNameInput;
		String passwordInput;
		
		do {
			System.out.println("Enter your username and password: ");
			userNameInput = scan.next();
			passwordInput = scan.next();
			
			if (userNameInput.equals(userName) && passwordInput.equals(password)) {
				System.out.println("You are logged in now!");
				break;
			} else {
				System.out.println("Wrong username or password, please try again.");
			}
		} while (userNameInput != userName || passwordInput != password);
	}
}
