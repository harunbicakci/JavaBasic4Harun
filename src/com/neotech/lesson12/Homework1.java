package com.neotech.lesson12;

public class Homework1 {
	public static void main(String[] args) {
		
//		1. Create an array of animals and store 6
//		elements into it. Using 2 different
//		loops print all elements from the
//		array.

	
		String[] animals = {"Wolf", "Tiger", "Eagle", "Deer", "Gator", "Monkey"};		
		
		for ( int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("*************************");
		
		for ( String animal : animals) {
			System.out.println(animal);
		}
		
	}
}
