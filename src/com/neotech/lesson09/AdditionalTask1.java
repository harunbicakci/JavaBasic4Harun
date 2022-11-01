package com.neotech.lesson09;

import java.util.Scanner;

public class AdditionalTask1 {
	public static void main(String[] args) {
		
//		▪ Write a program that the user to declare a positive integer.
//		It should then print the multiplication table of that number.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number:");
		int a = scan.nextInt();
		int b = 1;
		int c;
		
		while ( b <= 10) {
			c = a * b;
			System.out.println(a + " * " + b + " = " + c );
			b++;
		}
	}
}
