package com.neotech.lesson09;

public class Homework1 {
	public static void main(String[] args) {
		
//		▪ Write a program using while loop, that calculates the sum of the
//		even numbers between 0 and 10.
		
		int a = 0;
		int sum = 0;
		while (a <= 10) {	
			if ( a % 2 == 0) {
				System.out.print(a + " ");
				sum += a;
			}
			a++;
		}
		System.out.println("\nThe sum is --> " + sum);
		System.out.println("**************************************");
		
		// 2nd wat
		
		int j = 0;
		int total = 0;
		while(j <= 10) {
			total += j;
			j += 2;
		}
		System.out.println("\nThe sum is --> " + sum);
	}
}
