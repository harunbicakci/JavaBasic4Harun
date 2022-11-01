package com.neotech.lesson16;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		
//	Homework 3:
//	    Write a program that reads two parent's first names and if they expecting boy or girl?
//	    Based on the input suggests a name for a baby:
//	    If it is a boy get half from dad and half from mom.
//	    If it is a girl get half from mom and half from dad.
//
//	        Example Output:
//	            Mom's first name? Mary
//	            Dad's first name? Daniel
//	            Boy or Girl? boy
//	            Suggested baby name: DANRY
//	        Example Output:
//	            Mom's first name? Mary
//	            Dad's first name? Daniel
//	            Boy or Girl? girl
//	            Suggested baby name: MAIEL
	
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Please enter moms first name:");
	String momName = scan.nextLine().toUpperCase();
		
	System.out.println("Please enter dads first name:");
	String dadName = scan.nextLine().toUpperCase();
		
	System.out.println("Please enter babys gender:");
	String babyGender = scan.next().toLowerCase();
	String suggestion = "";
		
	if (babyGender.equals("boy")) {
		suggestion = dadName.substring(0, dadName.length() / 2) + momName.substring(momName.length() / 2, momName.length());
	}else if ( babyGender.equals("girl")) {
		suggestion = momName.substring(0, momName.length() / 2) + dadName.substring(dadName.length() / 2, dadName.length());
	}else {
		System.out.println("Invalid entry.");
	}
		
	System.out.println(suggestion);
		
	}
}
