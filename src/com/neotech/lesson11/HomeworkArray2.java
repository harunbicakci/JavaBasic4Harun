package com.neotech.lesson11;

public class HomeworkArray2 {
	public static void main(String[] args) {
		

//		1) Create an array of cars and store 6 elements
//	into it. Print all values from the array.

		
		String[] cars = new String[6];
		
		cars[0] = "Ford";
		cars[1] = "Tesla";
		cars[2] = "BMW";
		cars[3] = "Mercedes";
		cars[4] = "Audi";
		cars[5] = "Volkswagen";
		
		System.out.println("One by one the cars are --> ");
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		
		
		
		
	}
}
