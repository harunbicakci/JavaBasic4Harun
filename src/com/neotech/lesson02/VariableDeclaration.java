package com.neotech.lesson02;

public class VariableDeclaration {
	public static void main(String[] args) {
		
		// 1st way. Declaring a variable and assigning value.
		int number1 = 10;
		
		// 2nd way. Declaring a variable and NOT assigning value.
		byte number2; // 1st step is declaring variable.
		number2 = 15; // 2nd step is assigning value.
		
		// 3rd way. Declaring multiple variables ( of the same type).
		char var1, var2, var3; // 1st step is declaring variable.
		var1 =  '@'; // 2nd step is assigning value.
		var2 = '$';
		var3 = 'T';
		
		System.out.println(number1);
		
		number1 = 55; // assigning new value for number1, its called re-assigning the value.
		
		System.out.println(number1); // will print new reassigned value of number1 -->55
		
	}
}
