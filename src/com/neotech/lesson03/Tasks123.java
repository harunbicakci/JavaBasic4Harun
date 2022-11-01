package com.neotech.lesson03;

public class Tasks123 {
	public static void main(String[] args) {
		
//		▪ Write a Java program that will print a sum of two numbers Please use
//		variables to store num1,num2,and sum
//		Sample output: 46 + 90 = 136
		
//		▪ Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32 
//
//		▪ Write a Java program that displays the area of a rectangle with a width of
//		4.5 and a height of 7.9 using the following formula: area = width * height

		int num1, num2, sum;
		num1 = 46;
		num2 = 90;
		sum = num1 + num2;
		
		System.out.println("The sum of numbers: " + num1 + " and " + num2 + " is " + sum + ".");
		System.out.println("------------------------");
		
		double fah, cel;
		cel = 36.5;
		fah = (cel * 9/5 + 32);
		System.out.println(cel + " degrees Celcius is " + fah + " degrees Fahrenhetit.");
		
		System.out.println("------------------------");
		
		double wid = 4.5;
		double hei = 7.9;
		double area = wid * hei;
		System.out.println("The area of a rectangle with width " + wid + " and height " + hei + " is " + area + ".");
	}
}
