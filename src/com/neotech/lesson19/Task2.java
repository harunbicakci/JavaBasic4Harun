package com.neotech.lesson19;

public class Task2 {

//	Create a method that will take a String as a
//	parameter and returns reversed String. Method
//	should be available to all classes within your project
//	and accessible by class name.
	
	// method:
	// input (parameter): String str
	// output (return type): String
	// access modifier: public
	// is it static: yes, accesible by class name
	// internal logic: reverse the string
	
	public static String reverse(String str)
	{
		//many ways how we can do this
		//first way
		String reversed = "";
		for (int i = str.length()-1; i >=0; i--)
		{
			reversed +=str.charAt(i);
		}
		
		//return the reversed string
		return reversed;
	}
	

	//we learned String are immutable, so creating a String all the time 
	//is not very optimal
	//so, we can use mutable strings (StringBuffer or StringBuilder)
	
	
	public static StringBuffer reverse2(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse();
	}	
}
