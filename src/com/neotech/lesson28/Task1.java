package com.neotech.lesson28;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		
//		Create an arraylist of cars and retrieve all the values
//		using 3 different ways.
		
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Ford");
		cars.add("Mercedes");
		cars.add("Tesla");
		cars.add("Toyota");
		
		System.out.println(cars);
		
		System.out.println("------------------");
		
		for(int i = 0; i < cars.size();i++) {
			System.out.print(cars.get(i) + " ");
		}
		
		System.out.println("\n------------------");
		
		for (String el : cars) {
			System.out.print(el + " ");
		}
	}
}
