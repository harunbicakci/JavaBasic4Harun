package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {
	
//		Create an arrayList of even numbers from 1 to 50. Using
//		Iterator remove any number that is divisible by 5 from
//		that arrayList.

		ArrayList<Integer> evenNumbers = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if( i % 2 == 0) {
			evenNumbers.add(i);
		
			}
		}
		System.out.print(evenNumbers + " ");
		System.out.println("\n----------------------------------");
		
		Iterator<Integer> iterator = evenNumbers.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next() % 5 == 0) {
				iterator.remove();
			}
		}
		
		System.out.print(evenNumbers + " ");

	}

}
