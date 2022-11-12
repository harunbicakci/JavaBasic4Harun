package com.neotech.lesson24;

public class FinalKeyword {
	public static String str = "Hello";

	// Final variable = Constant! can not be re-assigned
	public static final String str2 = "Bye";

	public final double PI = 3.1415926; // PI will always have this value

	public static void main(String[] args) {
		str = "Hi";
		// str2 = "Try me"; CE = Compile Error

		// local variable
		final String finalStr = "Java is easy";
		// finalStr = "Java is difficult"; // CE, can not change a final variable

		final int age = 28;
		// after one year
		// age = 29;
	}

	// final method can not be overridden
	public final void hello() {
		System.out.println("Hello, i am a final method");
	}

	// YES i can overload a final method
	public final void hello(String name) {
		System.out.println("Hello " + name);
	}
}

class SubClass extends FinalKeyword {
	// lets override the first hello method
	// @Override
	// public void hello() { // CE: can not override a final method
	//
	// }

	// Not overriding! Method signature is different: just another method
	public void hello(int num) {

	}

}
