package com.neotech.lesson31;

public class Person {
			
	public String name, lastName;
	private int age, salary;
	
	Person (String name, String lastName, int age, int salary){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		
	}
		
	void printDetails () {
		System.out.println("{" + name + " " + lastName + " " + age + " " + salary + "}");
	}

	

}
