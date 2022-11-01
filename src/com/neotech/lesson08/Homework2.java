package com.neotech.lesson08;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		

//		▪ Write a program that asks user to enter his/her username and
//		password until user enters correctly.

		Scanner scan = new Scanner(System.in);
		
		String userName, passWord;
		
		String userinfo1 = "neotech";
		String password1 = "ilovejava123";
		
		do {
		System.out.println("Please enter your username:");
		userName = scan.next();
		System.out.println("Please enter your password:");
		passWord = scan.next();
		} while (!userName.equals(userinfo1) || !passWord.equals(password1));
		
		System.out.println("You are logged in now!");
		
		
	}
}
