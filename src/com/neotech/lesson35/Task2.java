package com.neotech.lesson35;

import java.util.Scanner;

public class Task2 {

//	Create a method checkUserName that
//	will throw a runtime exception. Method
//	should throw an exception when the
//	entered username is less than 5
//	characters.

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your username:");
			String userName = scan.next();
			try {
				checkUserName(userName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		 
	}

	public static void checkUserName(String userName) throws Exception {
		if (userName.length() < 5) {
			throw new Exception("Username has to be at least 5 characters!");
		} else {
			System.out.println("Username accepted. Enter your password:");
		}
	}
}
