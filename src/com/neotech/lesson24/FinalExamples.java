package com.neotech.lesson24;

public class FinalExamples {
//	1. Create a class FinalExamples that has one final String variable with an initial value and 
//	one final method printVariable().
//	In the main method create an object of FinalExamples class and try to reassign a value to instance variable.
//	Create a sub class of FinalExamples named ChildClass and try to override the printVariable() method.

	final String str = "Neotech";
			
	public final void printVariable() {
		System.out.println(str + " Java Classes");
	}

	public static void main(String[] args) {
		FinalExamples f1 = new FinalExamples();
		
		// f1.str = "Neotech Java";
		
		f1.printVariable();
	}
}

class ChildClass extends FinalExamples {
	
//	public final void printVariable() {
//		System.out.println("SDLC Classes");
//	}
	
}
