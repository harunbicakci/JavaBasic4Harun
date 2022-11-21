package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
//		Create an arrayList of words. Remove every word that
//		ends with “e”. Use iterator

		ArrayList<String> words = new ArrayList<>();
		
		words.add("Proffessor X");
		words.add("Wolverine");
		words.add("Beast");
		words.add("Rogue");
		words.add("Storm");
		
		System.out.println(words + "\n--------------------");

		Iterator<String> it = words.iterator();
		
		while(it.hasNext()) {
			String element = it.next();
			if( element.endsWith("e")) {
				it.remove();
			}		
		}
	
		System.out.println(words);
	
	}
}
