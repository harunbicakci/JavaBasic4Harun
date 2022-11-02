package com.neotech.lesson20;

public class ThisKeyword {
	
	int a, b;
	
	ThisKeyword()
	{}
	
	ThisKeyword(int a, int b)
	{
		//we want to assign values we got from the user to the instance variables
		//this.a --> refers to the instance variable a (blue a)
		//a --> is the local variable that came from the user
		this.a = a;
		this.b = b;
		
	}
	
	
	void sum(int a, int b)
	{
		System.out.println("Sum of local variables is " + (a + b));
		System.out.println("Sum of instance variables is " + (this.a + this.b));
	}
	
	
	
}
