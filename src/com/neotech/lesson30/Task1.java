package com.neotech.lesson30;

import java.util.Map;
import java.util.TreeMap;

//	Create a map of a building. Store floor number and it is
//	associated company name. (Example: 1=Google, 2=Apple,
//	3=Neotech etc..). Insert 7 entries with duplicate keys and
//	values.
//	- Check how many entries you have?
//	- Update company on a 4th floor
//	- Remove company on the 7th floor
//	- Print your map

public class Task1 {

	public static void main(String[] args) {
	
		Map<Integer, String> building = new TreeMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(2, "Sahibinden");
		building.put(3, "Neotech");
		building.put(4, "Microsoft");
		building.put(4, "Yemeksepeti");
		building.put(5, "Zeta");
		building.put(5, "Amazon");
		building.put(6, "Tesla");
		building.put(7, "Oracle");
		
		System.out.println(building);
		
		building.put(4, "Dell");
		
		System.out.println(building);
		
		building.remove(7);
		
		System.out.println(building);
		
		building.replace(8, "Lenovo");
		System.out.println(building);
		
		building.put(8, "Iphone");
		System.out.println(building);
		
	
	}

}
