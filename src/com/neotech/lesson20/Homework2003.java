package com.neotech.lesson20;

public class Homework2003 {

//	▪ Write a program that will have 4 different access levels of
//	constructors and create 3 objects of this class: 1 - inside
//	same class; 2 - from outside the class; 3 - from different
//	class inside different package and observe result.

	public Homework2003() {
		System.out.println("This is public, from every class and package.");
	}
	
	Homework2003(String name){
		System.out.println("This is default, only from same package. Ask " + name + " he will help you out.");
	}
	
	protected Homework2003(String name, int age){
		System.out.println("This is protected, only same package." + name + " " + age + " will show you the way.");
	}
	
	private Homework2003(int sinceYear, char grade, String user1) {
		System.out.println("This private, only from same class. In year " + sinceYear + " " + user1 + " has grade of \"" + grade + "\".");
	}
	public static void main(String[] args) {
		
		Homework2003 obj1 = new Homework2003();
		Homework2003 obj2 = new Homework2003("Harun");
		Homework2003 obj3 = new Homework2003("Harun", 25);
		Homework2003 obj4 = new Homework2003(1998, 'A', "Harun");
	}
}
