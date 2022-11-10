package com.neotech.lesson22;

public class CalculateArea {

	/*
	 * Create a class named CalculateArea in which you should create three methods
	 * (with the same name )that will calculate the area (volume) of - Rectangle -
	 * Square - Box Use a separate class to test your code
	 */
	
	//rectangle - (int, int)
	static void area(int side1, int side2)
	{
		System.out.println("The area of the Rectangle is --> " + side1 * side2);
	}
	
	//square - (int)
	static void area(int side)
	{
		System.out.println("The area of the Square is --> " + side * side);
	}
	
	//(int, int)   - not allowed, not overloading
//	void area(int side2, int side1)
//	{		}
	
	//box - (int, int, int)
	static void area(int length, int width, int height)
	{
		System.out.println("The area of box is --> " + length*width*height);
	}
	
	//instance method overloading rectangle area (int, int) ---> (double, double)
	void area(double side1, double side2)
	{
		System.out.println("The area of the Rectangle is --> " + side1 * side2);
	}
}
