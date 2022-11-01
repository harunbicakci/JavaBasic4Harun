package com.neotech.lesson19;

public class StaticKeyword {
	
	
	// instance variables
	String color;
	int memory;
	
	
	// static variables
	static String brand;
	static boolean touchscreen;
	
	// not static, it is instance method
	// inside the instance method we can use every variable
	void displaySpecificInfo(){
		System.out.println("We build a " + brand + " with " + memory + " GB with " + color + " color.");
	}
	
	// you can only use static variables, you cant use instance variables
	static void displaySpecificInfo2() {
//		System.out.println("We build a " + brand + " with " + memory + " GB with " + color + " color.");
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);
	}
	
	public static void main(String[] args) {
		
		// this is a local variable, we have to distinguish from other variables
		// String touchscreen;
		
		// we dont have to create an object for static variables.
		brand = "Iphone";
		// we are in the same class, so we can access touchscreen without the class name
		StaticKeyword.touchscreen = true;
		
		// can we say this? No, we need an object
		// StaticKeyword.color = "red";
		
		StaticKeyword iphone1 = new StaticKeyword();
		iphone1.memory = 64;
		iphone1.color = "Red";
		
		iphone1.displaySpecificInfo();
		
		// can we call it without object name? Yes, because we are in same class
		StaticKeyword.displaySpecificInfo2();
		// we can but this is not the right way
		iphone1.displaySpecificInfo2();
		
		// we can do this? yes, but its	 not the right way to change a static variable
		iphone1.touchscreen = false;
		// correct way is:
		StaticKeyword.touchscreen = true;
		
		// why sometimes we are using the class name for static elements and sometimes not?
		// to show that we can do it from within the same class
		displaySpecificInfo2();
		
		
		
		
		
	}
}
