package com.neotech.lesson31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapEntry {

	public static void main(String[] args) {

		//"January":31
		//"February":28
		Map<String, Integer> months = new LinkedHashMap<>();

		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		
		System.out.println(months);
		System.out.println("The size of the map is: " + months.size());
		
		//				String	String
		//keySet(): ["January", "February"...]
		//entrySet(): [EntryObj1, EntryObj2]
		Set<Entry<String, Integer>> entries = months.entrySet();
		System.out.println(entries);

		//iterating with for loop
		for ( Entry<String, Integer> e : entries)
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		//iterating with an iterator
		Iterator<Entry<String, Integer>> it = entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, Integer> entry =	it.next();
		
			System.out.println("The current entry is: " + entry );
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}
}
