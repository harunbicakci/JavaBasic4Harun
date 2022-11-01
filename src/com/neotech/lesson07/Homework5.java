package com.neotech.lesson07;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		
//		▪ Using scanner class create calculator. Allow user to enter 2
//		numbers and operator(+,-,*,/). Based on operator provide
//		the result to user.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two numbers and the operator to do the calculation you want:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char operator = scan.next().charAt(0);
		
		
		switch (operator) {
			case '+':
				int add = num1 + num2;
				System.out.println("The addition of " + num1 + " and " + num2 + " is " + add + ".");
				break;
			case '-':
				int sub = num1 - num2;
				System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + sub + ".");
				break;
			case '*':
				int mult = num1 * num2;
				System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + mult + ".");
				break;
			case '/':
				int div = num1 / num2;
				System.out.println("The division of " + num1 + " and " + num2 + " is " + div + ".");
				break;
			default:
				System.out.println("Invalid entry!");
				
		}
	}
}
