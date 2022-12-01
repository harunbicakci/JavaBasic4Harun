package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {

		// TreeMap will order the entries (pairs) alphabetically according to the KEY
		Map<String, Integer> groceries = new TreeMap<>();

		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Eggs", 12);
//		groceries.put(3, "Oil"); //CE:KEY must be a String
		groceries.put("Oil", 3);

		System.out.println(groceries);

		// my wife changed her mind
		groceries.replace("Eggs", 6);

		System.out.println(groceries);

		// keySet - we can get all the keys of the map and save them into a SET
		Set<String> keys = groceries.keySet();
		System.out.println("All keys of the map are: " + keys);

		// values() - we can get all the values of the map and save them into a
		// COLLECTION
		Collection<Integer> values = groceries.values();
		System.out.println("All values of the map are: " + values);

		// can we iterate over the keys?? Yes, we can also get any value of the keys
		for (String key : keys) {
			System.out.println(key + " :  " + groceries.get(key));

		}

		// can we iterate over the values??
		Iterator<Integer> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
