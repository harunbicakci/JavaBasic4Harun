package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create a Set of cities in which you want to make sure that insertion order 
		 * is maintained. Using Iterator remove any city that starts with “A”;
		 */

		
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Ankara");
		cities.add("Albany");
		cities.add("Izmir");
		cities.add("Tirana");
		cities.add("Kiev");
		cities.add("Elbasan");
		cities.add("Quito");
		
		System.out.println("Before removing: " + cities);
		
		Iterator<String> it = cities.iterator();
		
		while(it.hasNext())
		{
			//two ways: 
			//1st way:
			/*
			 * String city = it.next(); if (city.toUpperCase().startsWith("A")) {
			 * it.remove(); }
			 */		
			
			//2nd way: 
			if (it.next().toUpperCase().startsWith("A"))
			{
				it.remove();
			}
			
		}
		System.out.println("After removing: " + cities);
		
		
	}
}
