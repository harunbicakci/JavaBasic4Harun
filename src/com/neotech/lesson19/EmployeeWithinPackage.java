package com.neotech.lesson19;

public class EmployeeWithinPackage {


	public static void main(String[] args) {
		
		Employee.company = "Neotech";
		
		Employee emp = new Employee();
		emp.name = "Sabah";  //
		emp.lastName = "Bushaj"; //within package, we can access protected elements
		emp.salary = 21342;   //within package, we can access default elements
		//this is not visible
//		emp.ssn = 23335;
		//this here does not exist
//		emp.phone = 232453;
		
		//can we access methods
		emp.method1();  //public method, so we can access it
		emp.method2(); // protected method, we can access it within package
		emp.method3(); // default method, we can access it within package
		
		//this error says, it exists, but you cannot access it from here
	//	emp.method4(); 
		//this error says, it does not exist
	//	emp.method5();
	

	}	
}
