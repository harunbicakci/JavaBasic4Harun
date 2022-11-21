package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> choco = new ArrayList<>();

		choco.add("Kinder");
		choco.add("Albeni");
		choco.add("Godiva");
		choco.add("Ferrero");
		choco.add("Toblerone");

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Tres Leches");
		sweets.add("Ice Cream");

		// add all elements of choco on the sweets arraylist
		sweets.addAll(choco);
		System.out.println("the size of sweets is: " + sweets.size());
		System.out.println(sweets);

		// iterator:
		// we can loop on the list with:
		// for loops (indexed or for each)
		// while
		// do while

		// Iterator for String objects -- to iterate the objects of sweets ArrayList
		Iterator<String> it = sweets.iterator();

		// [Baklava, Tiramisu, Tres Leches, Ice Cream, Kinder, Albeni, Godiva, Ferrero,
		// Toblerone]
		while (it.hasNext())// it.hasNext() checks if there is any other element next
		{
			String element = it.next(); // gives us the next element
			System.out.print(element + " - ");

			if (element.equals("Albeni")) {
				it.remove();
			}

		}

		System.out.println();
		
		System.out.println(sweets);
		
		for (String str : sweets)
		{
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		
		//normal for loop
		//if you want to iterate backwards
		for (int i = sweets.size()-1; i >=0; i-- )
		{
			System.out.print(sweets.get(i)+ " ");
			
		}
		System.out.println();
		}

}
