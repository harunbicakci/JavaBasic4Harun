package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, String> cities = new TreeMap<>();
		cities.put(1, "Ankara");
		cities.put(2, "Baku");
		cities.put(3, new String("Tirana"));
		
		for(Entry<Integer, String> e : cities.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		// how do we deal with user objects?
		
		// lets create a map of a user id and person object
		
		Map<Integer, Person> people = new TreeMap<>();
		
		people.put(1, new Person("Murad", "Bayramov", 25, 130));
		people.put(2, new Person("Oktay", "Adatepe", 23, 120));
		people.put(3, new Person("Vugar", "", 27, 150));
		people.put(4, new Person("Sabah", "Bushaj", 45, 115));
	
		// loop through the entries and access its elements
		
		for(Entry<Integer, Person> e : people.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue().name + " " + e.getValue().lastName);
			
			e.getValue().printDetails();
		}
		
		
		
		
	}

}
