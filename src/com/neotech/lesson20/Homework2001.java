package com.neotech.lesson20;

public class Homework2001 {

//	▪ Write a program that will have a constructor: one with
//	parameters and second without any parameters. Create a
//	separate Test class where you will execute both of the
//	constructors.

	String name;
	
	Homework2001 (String userName){
			name = userName;
		System.out.println("The user " + name + " has been created.");
	}

	Homework2001 (){
		System.out.println("This is a constructor that has no parameter.\n");
	}


}
