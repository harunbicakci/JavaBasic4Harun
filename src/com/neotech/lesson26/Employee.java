package com.neotech.lesson26;

public class Employee {

	private String name;
	private int age;
	private double salary;

	// we define getters and setters
	
	// I want to provide a method that allows users of this class to get the Name
	// getter: has a return type, no arguments
	
	public String getName() {
		return name;
	}
	
	// I want to provide a method that allows users of this class to set the Name
	// setter: no return
	
	public void setName(String name) {
		if (!name.isEmpty() && name.length()>3) {
		this.name = name;
		}
	}
	
	// getter for age
	public int getAge() {
		return age;
	}
	
	// setter for age
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter for salary
	public double getSalary() {
		
		return salary;
	}
	
	// setter for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
