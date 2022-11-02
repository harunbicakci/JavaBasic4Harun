package com.neotech.lesson20;


public class Task1 {

/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name.
	 */
	String name; 
	int grade1, grade2, grade3;
	
	//if I want to allow user to create an object using the default constructor
		//I will create an non-argument constructor
	Task1(){
		
	}
	
	Task1(String studentName, int g1, int g2, int g3)
	{
		name = studentName;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}
	
	int average()
	{
		return (grade1+grade2+grade3)/3;
	}
	
	
	public static void main(String[] args) {

		Task1 st1 = new Task1("Sedat", 95, 98, 97);
		Task1 st2 = new Task1("Dardan", 95, 96, 94);
		Task1 st3 = new Task1("Hakan", 65, 85, 95);
		
		System.out.println(st1.name + " has an average of " + st1.average());
		System.out.println(st2.name + " has an average of " + st2.average());
		System.out.println(st3.name + " has an average of " + st3.average());

		
		
		// can I create this object
		Task1 st4 = new Task1(); //does not work if you have defined a parameterized constructor
								//and have not created a default one as well
		
		
	}
}