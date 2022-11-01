package com.neotech.lesson07;

public class LogicalNOT {
	public static void main(String[] args) {
		
		// ! (NOT) - reverses the value of a boolean value,
		
		boolean b1 = true;
		System.out.println(!b1); // you can put ! before true/false calue or like this before the variable !b1
		
		// not only in front of a boolean variables, it can also work with any boolean expression.
		System.out.println(!(6<5));
		
		boolean cold = false;
		
		if (!cold) {
			System.out.println("Its so cold");
		}
		
		
		int x = 12; 
		
		if (x == 12) {
			System.out.println("x is NOT 12.");
		}
		//we can write it like this.
		
		
		
	}
}
