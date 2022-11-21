package com.neotech.lesson27;

import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {
		
//		Create a generic ArrayList that will store 5 names into it.

//		Find out whether the given ArrayList is empty or not?
//		
//		Check whether the specific name is present in an ArrayList or not?

//		Find the size of your arrayList and print all values from that
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Lebron");
		names.add("Kobe");
		names.add("O`neal");
		names.add("Hardaway");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Kobe"));
		System.out.println(names.size());
		
		System.out.println("-------------");
		
		for (String element : names) {
			System.out.println(element);
		}
	}
}
