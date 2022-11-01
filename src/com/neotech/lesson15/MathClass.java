package com.neotech.lesson15;

public class MathClass {
	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		System.out.println("Addition");
		cal.add(5, 7);
		cal.add(10, 15);
		cal.add(300, 125);
		
		System.out.println("Multiply");
		cal.multiply(5, 7);
		cal.multiply(6, 2);
		
		System.out.println("Division");
		cal.divide(0, 0);
		cal.divide(55.2, 13.5);
	//	cal.divide(3.5, 0); the most common issue when dividing a double number to 0, it is infinite
		
		
		
		
		
		
	}
}
