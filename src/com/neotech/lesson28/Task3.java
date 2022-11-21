package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
		
//		Create an arrayList of drinks. If any drink has letter “a” or
//		“e” replace it with water.

		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("Sex on the Beach");
		drinks.add("Margarita on the Rocks");
		drinks.add("Cuba Libre");
		drinks.add("Mudslide");
		drinks.add("Long Island");
		drinks.add("Uzo");
		
		System.out.println(drinks);
		System.out.println("-------------------------------------------");
		
		Iterator<String> iterator = drinks.iterator();
		ArrayList<String> drinks2 = new ArrayList<>();
		
		while (iterator.hasNext()) {
			
			String drink = iterator.next();
			if(drink.contains("a") || drink.contains("e")) {
				drink = "Water";
				drinks2.add(drink);
			}else {
				drinks2.add(drink);
			}
		}
		System.out.println(drinks2);
	}
}
