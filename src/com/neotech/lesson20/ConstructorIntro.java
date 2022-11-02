package com.neotech.lesson20;

public class ConstructorIntro {

	String name;
	int age;
	
	//name is exactly as the class name
	//there is no return type
	ConstructorIntro()
	{
		System.out.println("I am a default constructor!");
	}
	public static void main(String[] args) {
		// object type  ident.  op  new		Constructor
		ConstructorIntro con = new ConstructorIntro();
		con.name = "Sabah";
		con.age = 45;
		System.out.println(con.name + " " + con.age);
	}
}
