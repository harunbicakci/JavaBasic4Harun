package com.neotech.lesson31;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Homework22 {

//	Create the collection that will store single unique objects of a String type in which order is preserved.
//  Write a logic to concatenate all string from the collection.

	public static void main(String[] args) {
		
		Collection<String> unique = new LinkedHashSet<>();
		
		unique.add("Kingpin");
		unique.add("Venom");
		unique.add("Mysterio");
		unique.add("Goblin");
		unique.add("Hammerhead");
		unique.add("Doctor Octopus");
		
		String concat = "";
		
		for (String el : unique) {
			concat += el + ", ";
			
		}
		
		System.out.println(concat.substring(0, concat.length()-2));
		
		
		
		
		
	}
	
}
