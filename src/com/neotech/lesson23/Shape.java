package com.neotech.lesson23;

public class Shape {
	/*
	 * Write program: Shape class has a constructor that takes the radius and has a
	 * subclass as Circle class. In Circle class create a method to calculate the
	 * area of circle. Test your code
	 */
	
	int radius;
	
//	Shape()
//	{
//		
//	}
	
	public Shape(int radius)
	{
		this.radius = radius;
	}
	
}


class Circle extends Shape
{
//	Circle()
//	{
//		
//	}
	
	Circle(int radius)
	{
		super(radius);
	}
	
	
	void calculateArea()
	{
		System.out.println("The area of the circle is " + 3*radius*radius);
	}
}
