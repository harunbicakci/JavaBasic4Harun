package com.neotech.lesson15;

import java.util.Scanner;

public class Homework1 {
//	Create a method createEmail(). Based on provided users firstName, 
//	lastName and emailType, your method should return complete email address.
//	Example: 
//	firstName -> john
//	lastName -> snow
//	emailType -> gmail
//	return -> johnsnow@gmail.com
			
		String email(String firstName, String lastName, String emailType) {
			return ("Your email is " + firstName.toLowerCase() + lastName.toLowerCase() + 
		"@" + emailType.toLowerCase() + ".com"); 
		}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Homework1 hw1 = new Homework1();
		
		System.out.println("Please enter your first name:");
		String fn = scan.next();
		
		System.out.println("Please enter your last name");
		String ln = scan.next();
		
		System.out.println("Please enter your email type:");
		String emt = scan.next();
		
		String userEmail = hw1.email(fn, ln, emt);
		System.out.println(userEmail);
	}
}
