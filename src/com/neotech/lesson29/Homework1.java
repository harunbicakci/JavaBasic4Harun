package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {

	/*
	 * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
	 * with water.
	 */
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("milk");
		drinks.add("coffee");
		drinks.add("beer");
		drinks.add("tea");
		drinks.add("soda"); //where is this added? by default adds to the end
		drinks.add(1,"water"); //this is inserted just before coffee, and everything else is push by 1
		drinks.add(3, "coffee");
		
		
		
		//using for each
		for (String drink : drinks)
		{
			//check if drink contains letter a or e
			if (drink.contains("a") || drink.contains("e"))
			{
				//we did not update/change the arraylist
				drink = drink.replace(drink, "water");
			}
			System.out.print(drink + " ");
		}
		System.out.println();
		System.out.println(drinks);
		
		
		//indexed for loop
		
		for (int i = 0; i < drinks.size();i++)
		{
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e"))
			{
				drinks.set(i, "water");
			}
		}
		
		System.out.println(drinks);
		
		
		
	}
	
}
