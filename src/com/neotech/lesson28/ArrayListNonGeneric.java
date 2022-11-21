package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<>();
		
		
		al.add(2.5);
		al.add(4.7);
	//	al.add(100); 		CE, this is not converted automatically
	//	al.add("five"); 	CE
		
		System.out.println(al);
		
		// replacing items in the ArrayLis
		
		al.set(1,  10.2); // index no 1 change to 10.2, but there is only 2 elements in arrayList
		// if the index is larger that the size of the arrayList, then you will get
		// an IndexOutOgBoundsException
		System.out.println(al);
		
		// removing and element
		al.remove(0);
		System.out.println(al);
		
		// get an element at the index 0??
		System.out.println(al.get(0));
	
		al.add(2.3);
		al.add(5.5);
		
		// for loop
		for(int i = 0; i < al.size(); i++) {
			// arr[i]
			System.out.print(al.get(i) + " ");
			}
		
		System.out.println();
		
		// for each loop
		for (double d : al) {
			System.out.print(d + " "); // Java automatically does auto-boxing and auto-nonboxing, so 
		}							//	we can use Double and double 
		
		System.out.println();
		
		
		//Non-generic ArrayList
		
		ArrayList al2 = new ArrayList(); // we not specify the 
		
		al2.add(100);		// storing an integer object
		al2.add("Hello");	// storing a String object
		al2.add('A'); 		// storing a Character object
		al2.add(al);		// storing an ArrayList object
		
		System.out.println(al2 + " ---------------------- ");
		
		// retrieving all elements from Non-generic ArrayList
		for( Object obj : al2 ) {
			System.out.println(obj);
		}
		
	}
}
