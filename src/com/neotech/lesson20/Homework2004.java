package com.neotech.lesson20;

public class Homework2004 {

//	▪ Write program that have static constructor and observe
//	result.
	
	Homework2004(int num1, int num2){ // tried but the complier doesnt accept static Homework2004
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + ".");
	}
	
	
	public static void main(String[] args) {
		
		Homework2004 obj1 = new Homework2004(4,6);
		
		// Homework2004.Homework2004(4,6); --> here the complier asks you to create a static method to use this variable.
		// There is no static constructor.
		
	}
}
