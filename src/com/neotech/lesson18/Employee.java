package com.neotech.lesson18;

public class Employee {
	
	String eID;
	int salary;
	
	static String CEO = "Elion";

	void printInfo() {
		System.out.println("eID: " + eID + " salary: " 
	+ salary + " CEO: " + CEO);
	}
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.eID = "Leo";
		e1.salary = 120000;
		
		Employee e2 = new Employee();
		e2.eID = "Chiko";
		e2.salary = 110000;
		
		e1.printInfo();
		e2.printInfo();
		
		Employee.CEO = "Ahmet";
		
		e1.printInfo();
		e2.printInfo();
	}
}
