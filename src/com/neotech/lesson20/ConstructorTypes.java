package com.neotech.lesson20;

public class ConstructorTypes {

	String name;
	int age;
	
	// default
	// no return type - not even void
	// same name as class name
	// no parameters
	ConstructorTypes(){
		System.out.println("I am a non-argument constructor");
	}
	
	// we can have parameter in constructors
	// signature: (String)
	ConstructorTypes(String str){
		System.out.println("I am a constructor with a string " + str);
	}
	
	// signature: (int)
	ConstructorTypes(int num){
		System.out.println("I am a constructor with an int " + num);
	}
	
	// signature: (double)
	ConstructorTypes(double num){
		System.out.println("I am a constructor with an double " + num);
	}
	
	// signature: (String, int)
	ConstructorTypes(String str, int num){
		System.out.println("I am a constructor with a String " + str + " and int " + num);
	}
	// signature: (String, String)
	ConstructorTypes(String str, String str2){
		System.out.println("I am a constructor with two Strings " + str + " " + str2);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes ct = new ConstructorTypes(); // thats the first one, default one
		System.out.println(ct.name + " " + ct.age);
										// signature: (String)
		ConstructorTypes ct1 = new ConstructorTypes("Sabah");
										// signature: (String, int)
		ConstructorTypes ct2 = new ConstructorTypes("Harun", 25);

		//Java will give complain
										// signature: (String, String, String)
//		ConstructorTypes ct3 = new ConstructorTypes();
		
		
		
	}
}
