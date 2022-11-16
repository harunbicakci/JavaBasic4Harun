package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		// to get a value from Employee Class, I call a getter
		// to set a value in Employee Class, I call a setter
		emp.setName("Harun");
		System.out.println(emp.getName());
		
		
		emp.setAge(25);
		System.out.println(emp.getAge());
		
		
		emp.setSalary(12312421414.01);
		System.out.println(emp.getSalary());
	}
}
