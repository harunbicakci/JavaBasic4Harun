package com.neotech.lesson19;

public class Employee {

	public static String company; //this is public
	public String name;
	protected String lastName;
	double salary; //no access modifier -- it means default
	private int ssn;
	
	//1. if no access modifier, then it default
	//2. the formula of assigning access modifier:
	//	OPTIONAL		MUST		MUST
	// access modifier data_type variable name
	
	
	//methods with different access modifiers
	public void method1()
	{
		System.out.println("I am a public method!!!");
	}
	
	protected void method2()
	{
		System.out.println("I am a protected method!!!");
	}
	
	void method3()
	{
		System.out.println("I am a default method!!!");
	}
	
	private void method4()
	{
		System.out.println("I am a private method!!!");
	}
	
	
	public static void main(String[] args) {

		//we want to see what elements we can access from within the same class
		Employee emp = new Employee();
		
		company = "Neotech";
		emp.name = "Sabah";
		emp.lastName = "Bushaj";
		emp.salary = 122345;
		emp.ssn = 12345;
		//reading variables and methods:
		//ex: red square     ssn:int-employee
		//access modifier (private), identifier is ssn, type is int, belongs to Employee 
		
		//can we access the methods:
		emp.method1(); //we can access a public method
		emp.method2(); //we can access a protected method
		emp.method3(); //we can access a default method
		emp.method4(); //we can access the private method as well
	}
}
