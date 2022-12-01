package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {

//	Create a Set of cities in which you want to make sure that
//	insertion order is maintained. Using Iterator remove any city
//	that starts with “A”;
	public static void main(String[] args) {
	

	Set<String> cities = new LinkedHashSet<>();
	
	cities.add("Istanbul");
	cities.add("Ankara");
	cities.add("Izmir");
	cities.add("Bursa");
	cities.add("Adana");
	cities.add("Antalya");
	
	System.out.println("Original LinkedHashSet List --> " + cities);
	System.out.println("----------------------------");
	
	Set<String> cities1 = new TreeSet<>(cities);
	System.out.println("TreeSet List --> " + cities1);
	System.out.println("----------------------------");
	
	Iterator<String> it = cities.iterator();
	
	while (it.hasNext()) {
		String str = it.next();
		if(str.startsWith("A")) {
			it.remove();
		}
	}
	
	System.out.println("After removing the city names stars with A --> " + cities);
	
	
	}
}
