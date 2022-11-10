package com.neotech.lesson20;

public class Homework2005 {

//	▪ Write a program as a Student class that has two
//	instance variables, name and address. Create a
//	constructor that will initialize those variables. Print
//	name & address of given student using displayInfo
//	method.

	String name, address;
	
	Homework2005(){
		
	}
	
	Homework2005(String name, String address){
		System.out.println("This is a constructor with 2 variables: " + name + " and " + address + ".");
		this.name = name;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println("Student " + name + " is living in " + address + ".");
	}
	
	public static void main(String[] args) {
		
		Homework2005 s1 = new Homework2005("Harun", "Orlando, FL");
		s1.displayInfo();
		
		Homework2005 s2 = new Homework2005();
		s2.name = "Emre";
		s2.address = "Dortmund, GERMANY";
		s2.displayInfo();
	}
}
