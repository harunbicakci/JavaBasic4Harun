package com.neotech.lesson22;

public class A {
//	 Write a program for multilevel inheritance where class A is inherited by B and 
//	Class B inherited by Class by C.
	
	String name = "A";
	
	// this. --> it accesses elements within the same class
	// super. --> it accesses elements on the parent class(Class we extended)
	void method() {
		System.out.println("This is a method in Class A.");
		System.out.println(this.name);
	}
	
}

class B extends A{
	
	String name = "B";
	
	void method() {
		System.out.println("This is a method in Class B.");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
}

class C extends B{
	
	String name = "C";
	
	void method() {
		System.out.println("This is a method in Class C.");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
		
	}
}