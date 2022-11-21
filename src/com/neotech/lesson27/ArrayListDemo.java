package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(15);
		
		System.out.println("index no 2 is: " + numbers.get(2));
		System.out.println("size: " + numbers.size());
		
		System.out.println("Does contains 15? " + numbers.contains(15));
		System.out.println("Does contains 25? " + numbers.contains(25));
		
		
		System.out.println("---------ITERATING THE ARRAYLIST WITH A FOR LOOP----------");
		
		for( int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
		
		System.out.println("---------ITERATING THE ARRAYLIST WITH A FOR EACH LOOP----------");
		
		for( Integer element : numbers ) {
			System.out.println(element);
		}
		
	}
}
