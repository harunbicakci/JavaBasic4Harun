package com.neotech.lesson26;

//	Create an Interface 'Shape' with undefined methods as
//	calculateArea and calculatePerimeter. Create 2 classes
//	Circle & Square that implements functionality defined in the
//	Shape Interface. Test your code.

public interface Shape {

	void calculateArea();
	void calculatePerimeter();
}

class Circle implements Shape{
	
	double r;
	
	public Circle (double r ) {
		this.r = r;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("The area of r " + r + " is " + (3.14 * r * r));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of r " + r + " is " + ( 2 * 3.14 * r));
		
	}
}

class Square implements Shape{

	int a;
	int b;
	
	public Square(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void calculateArea() {
		System.out.println("The area is " + ( 2 * (a+b)));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter is " + (a * b));
		
	}
	
}


