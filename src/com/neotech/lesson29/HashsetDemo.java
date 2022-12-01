package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		HashSet<String> breakfast = new HashSet<>();
		
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("cheese");
		breakfast.add("eggs");
		breakfast.add("tea");
		breakfast.add("coffee");

		int size = breakfast.size();
		
		System.out.println("The size of the set is: " + size);
		
		System.out.println(breakfast);
		
		// get all elements using FOR EACH LOOP
		for (String item : breakfast) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		// can we use an iterator?
		Iterator<String> item = breakfast.iterator();
		
		while(item.hasNext()) {
			System.out.print(item.next() + " ");
		}
		System.out.println();
		
		
		
		
	}

}
