package com.neotech.lesson30;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

	//	HashSet<String> hs = new HashSet<>();
		
	//	<K, V> - a pair, an entry, a key-value pair
		
		
		HashMap<Integer, String> map = new HashMap<>();
		//we can have any object key:value pair
		//for example: Integer:Student, String:String
		map.put(1, "Dardan");
		map.put(2, "Emine");
		map.put(3, "Fatihcan");
	
		boolean isEmpty = map.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		
		System.out.println("The size of the map is: " + map.size());
		
		System.out.println(map);
		//{1=Dardan, 2=Emine, 3=Fatihcan}
		//when printing, results are shown as {k1=v1, k2=v2}
		
		//lets add one more pair
		
		//map.put("15", "Karen"); //CE: key must be an integer
		
		//is it ok to have duplicate values?
		map.put(15, "Emine");
		System.out.println(map);
		
		//trying to add duplicate keys: it will override the existing value 
		map.put(15, "Yilmaz");
		System.out.println(map);
		
		
		//how do we retrieve values from map?
		String name = map.get(2);
		System.out.println(name);
		
		//if we want to replace
		map.replace(2, "Karen");
		System.out.println(map);
		
		
		//remove Fatihcan from the map
		map.remove(3);
		
		//check if key 4 exists
		boolean checkKey = map.containsKey(4);
		System.out.println(checkKey);
		
		//check if Fatihcan is in the map
		boolean checkValue = map.containsValue("Fatihcan");
		System.out.println(checkValue);
		
		
		System.out.println(map);
	}
}
