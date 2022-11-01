package com.neotech.lesson03;

public class Homework1 {
	public static void main(String[] args) {
		
//		1. Write a java program to display the area and perimeter
//		of a circle that has a radius of 5. Use pi = 3. 

		int radius, pi, perimeter, area;
		radius = 5;
		pi = 3;
		area =  3 * (5*5); // area = pi * (r*r)
		perimeter = pi * 2 * 5; // perimeter = 2 * pi * r
		 
		
		System.out.println("The area of the circle is " + area + " and the perimeter of the circle is " + perimeter + " ");
		
		
		
	}
}
