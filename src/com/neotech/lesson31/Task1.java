package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//	Create a Map from array of cities that will sort keys in
//	alphabetical order. As a key store the name of the city and
//	as a value store the length of the city. (Example: Paris=5,
//	Moscow=6, Washington DC=13 etc..).
//	- If any city name is more than 7 characters remove that
//	city.

public class Task1 {

	public static void main(String[] args) {
		
		int i = 0;
		String[] cities = {"Paris", "Moscow", "Washington", "Bournemouth", "Dortmund"};
		
		Map<String, Integer> map = new TreeMap<>();
	
		for( String city : cities) {
				map.put(city, city.length());
		}

		System.out.println(map);
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while ( it.hasNext()) {
			Entry<String, Integer> e = it.next();
			
			if(e.getValue() < 7) {
				it.remove();
			}	
		}
		System.out.println("After removing cities " + map);
		
		System.out.println("-----------FOR EACH LOOP--------");
		
		for ( Entry<String, Integer> entry : map.entrySet()) {
			
			String key = entry.getKey();
			int value = entry.getValue();
			
			if (value < 7) {
				
			}
			
		}
		
		
	}

}
