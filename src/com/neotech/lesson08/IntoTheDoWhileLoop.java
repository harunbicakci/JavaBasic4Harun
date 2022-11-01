package com.neotech.lesson08;

public class IntoTheDoWhileLoop {
	public static void main(String[] args) {
		
		
		int num1 = 5; 
		
		//while loop: 
		// check the condition
		//if the condition is false, then we do not check again
		//if the condition is true, we keep executing and checking until it becomes false
		while(num1 >= 15)
		{
			System.out.print(num1 + " ");
			
			num1++;
		}
		
		System.out.println();
		
		
		// Using Do.. while
		int num2 = 5;
		
		//Do while loop:
		//first execute the body once
		//then check the condition
		//if the condition is false, then do not run anymore
		//if the condition is true, then continue executing until it becomes false
		do
		{
			System.out.print(num2 + " ");
			
			num2++; 
			
		}while(num2 >= 15);
	}
}
