package com.neotech.lesson20;

public class Homework2006 {

//	▪ Write a program as a Book class that will have
//	instance variables and 2 Constructors. While
//	creating an object make sure:
//	- Instance variables are being initialized
//	- Both Constructors are being executed
	
	
	   Homework2006(){

	        System.out.println("In default constructor with no parameter.");
	    }
	    
	    Homework2006(int a, int b){
	    	this(); // calls the constructor with no parameters.
	        System.out.println("In multiple parameter constructor --> " + a + ", " + b);
	    }

	    public static void main(String s[]){
	    	
	    	Homework2006 obj1 = new Homework2006(10, 20);
	    }
}
