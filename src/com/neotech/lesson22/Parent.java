package com.neotech.lesson22;

public class Parent {
	String name = "Parent Name";
	String lastName = "Parent LastName";
	
	
	void hello()
	{
		System.out.println("Printing from parent class!");
	}
	
}

class Child extends Parent
{
	String name = "Child Name";
	
	void display()
	{
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(super.lastName);
		System.out.println(lastName);
		System.out.println(this.lastName);
	}
	
	void hello()
	{
		System.out.println("Printing from the child class!");
	}
	
	void sayHello()
	{
	display();	//java adds this. in front of it
	
	hello(); //java adds this. in front of it 
	super.hello(); //we are specifying that we want to 
	//call the hello() from the super class
		
	}
}
