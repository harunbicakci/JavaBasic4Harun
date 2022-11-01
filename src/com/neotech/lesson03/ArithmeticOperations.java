package com.neotech.lesson03;

public class ArithmeticOperations {
	public static void main(String[] args) {
		
		// type 	name 	=	value ;
		// type + name; -----> declaration
		
		int num1, num2;
		
		// initialization
		num1 = 27;
		num2 = 5;
		
		int sum = num1 + num2; // addition
		int div = num1 / num2; // division
		int mult = num1 * num2; // multiplication
		int sub = num1 - num2; // substraction
		
		System.out.println("The sum is " + sum);
		System.out.println("The div is " + div);
		System.out.println("The mult is " + mult);
		System.out.println("The sub is " + sub);
		
		double d1, d2;
		
		d1 = 27;
		d2 = 5;
		
		double div_doubles = d1 / d2;
		System.out.println(div_doubles);
		
		double div_int = num1 / num2; // 2 numbers as int, the double value will be first int --> then it will add .0 at the end
		System.out.println(div_int);
		
		
		
	}
}
