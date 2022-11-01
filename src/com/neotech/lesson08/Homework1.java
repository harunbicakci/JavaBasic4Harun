package com.neotech.lesson08;

public class Homework1 {
	public static void main(String[] args) {
		
//		▪ Write a program using while loop, that calculates the sum of the
//		even numbers between 0 and 10.
		
		int a = 0;
		int sum = 0;
		
		while (a <= 10) {
			if (a % 2 == 0) {
				sum = sum + a;
				System.out.print(a + " ");
			}
			a++;
		}
		System.out.println("\nThe sum is --> " + sum);
		
	}
}
