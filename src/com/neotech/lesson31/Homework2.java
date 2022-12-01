package com.neotech.lesson31;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create a map of countries with its capital that will store countries in
		 * alphabetical order. 
		 * Add them randomly in the map. Example: "France" ->
		 * "Paris" "Kosovo" -> "Prishtina" "Turkey" -> "Ankara" "USA" -> "Washington DC"
		 * "Albania" -> "Tirana" "Italy" -> "Rome"
		 * 
		 * - Print the list and check the order of the countries. 
		 * - Verify if you have your country (Albania, Turkey) in the list ( use containsKey() method ) -
		 * - Verify if a specific capital city is in the list ( use containsValue() method) 
		 * - Get all the keys (countries names) in a Set. Print all country names
		 * using for each loop. 
		 * - Get all the values (capital names) in a Collection.
		 * Print all capital names using iterator.
		 */

		Map<String, String> countries = new TreeMap<>();
		countries.put("France", "Paris");
		countries.put("Kosovo","Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA", "DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		
		System.out.println(countries);
		
		System.out.println("Does the map contains Albania???");
		System.out.println(countries.containsKey("Albania"));
		System.out.println(countries.containsKey("Turkiye"));
		
		
		System.out.println("Does the map contain Prishtina??");
		System.out.println(countries.containsValue("Prishtina"));
		
		Set<String> keys = countries.keySet();
		
		System.out.println(keys);
		
		for (String country : keys) 
		{
			System.out.print(country + " ");
		}
		System.out.println();
		
		//2nd way
		
		for (String country : countries.keySet())
		{
			System.out.print(country + " ");
		}
		System.out.println();
		
		
		
		Collection<String> capitals = countries.values();
		Iterator<String> it = capitals.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		Iterator<String> it2 = countries.values().iterator();
		
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		
	}
}
