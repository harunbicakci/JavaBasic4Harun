package com.neotech.lesson26;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape cir = new Circle(6); 
//		cir.calculateArea();
//		cir.calculatePerimeter();
//		
		Shape squ = new Square(3, 5);
//		squ.calculateArea();
//		squ.calculatePerimeter();
//		
		
		Shape[] arr = new Shape[3];
		arr[0] = cir;
		arr[1] = squ;
		arr[2] = new Square(6, 8);
		
		for ( Shape element : arr) {
			element.calculateArea();
			element.calculatePerimeter();
		}
	}
}
