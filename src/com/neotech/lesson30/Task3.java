package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task3 {

//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Add them randomly in the map.
//	Example:
//	    "France" -> "Paris"
//	    "Kosovo" -> "Prishtina"
//	    "Turkey" -> "Ankara"
//	    "USA" -> "Washington DC"
//	    "Albania" -> "Tirana"
//	    "Italy" -> "Rome"
//
//	    - Print the list and check the order of the countries.
//	    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
//	    - Verify if a specific capital city is in the list ( use containsValue() method )
//	    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
//	    - Get all the values (capital names) in a Collection. Print all capital names using iterator.
	
	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();
		
		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkey", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		System.out.println("TreeMap alphabetic order --> " + countries);
		
		boolean checkAlbania = countries.containsKey("Albania");
		boolean checkTurkey = countries.containsKey("Turkey");
		System.out.println("Check if Albania is on map --> " + checkAlbania);
		System.out.println("Check if Turkey is on map  --> " + checkTurkey);
		
		boolean checkLondon = countries.containsValue("London");
		System.out.println("Check if value London is on the map --> " + checkLondon);
		
		Set<String> keys = countries.keySet();
		System.out.println("Keys --> " + keys);
		
		for (String key : keys) {
			System.out.print(key + " - " + countries.get(key) + " ");
		}
		
		System.out.println("\n-------------------------------");
		
		Collection<String> capitals = countries.values();
		Iterator<String> it = capitals.iterator();
		
		while(it.hasNext()) {
			String capital = it.next();
			System.out.print(capital + " ");
		}
		
		
	}

}
