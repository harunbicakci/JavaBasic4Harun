package com.neotech.lesson18;

public class InstanceVariableDemo {

	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable();
		System.out.println(obj1.name);
		
		InstanceVariable obj2 = new InstanceVariable();
		obj2.name = "Sedat";
		System.out.println(obj2.name);
		
		System.out.println("----------------");
		System.out.println(obj1.name);
		
		
	}

}
