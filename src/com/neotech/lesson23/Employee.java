package com.neotech.lesson23;

public class Employee {

	double salary;
	
	
	void getPaid() {
		System.out.println("The employee salary is " + salary);
	}
	
}

class Contractor extends Employee{
	
	double hourlyRate;
	
	void getPaid() {
		System.out.println("The contractor hourly rate is " + hourlyRate);
	}
	
}

class FullTimeEmployee extends Employee{
	
	
	
	
	
	
}
