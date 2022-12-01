package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {

//	Create a Set collection in which you need to add names of
//	the countries. In this set we want all objects to be sorted in
//	alphabetical order. Using 2 different ways retrieve all
//	elements from the set.
	
	public static void main(String[] args) {
	Set<String> country = new TreeSet<>();
	
	country.add("Germany");
	country.add("Brasil");
	country.add("Japan");
	country.add("Norway");
	country.add("South Africa");
	country.add("Cuba");
	
	System.out.println("Printing with TreeSet --> " + country);
	System.out.println("-------------------------------");
	
	Iterator<String> iter = country.iterator();
	System.out.print("Printing with Iterator --> ");
	while (iter.hasNext()) {
		String el = iter.next();
		System.out.print(el + " ");
	}
	
	System.out.println("\n-------------------------------");
	
	List<String> listCountry = new ArrayList<>(country);
	Collections.sort(listCountry);
	System.out.println("Printing with Collections --> " + listCountry);
	}
}
