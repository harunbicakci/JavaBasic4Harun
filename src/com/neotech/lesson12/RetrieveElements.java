package com.neotech.lesson12;

public class RetrieveElements {
	public static void main(String[] args) {
		
		char [] grades = {'A', 'B', 'C', 'D', 'F'};
		
		// loop through the grades array
		for (int i =0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();
		
		// 2nd way enhanced loop / advanced for loop / for-each loop
		for (char element : grades) {
			System.out.print(element + ", ");
		}
		
		System.out.println("-------------------------");
		
		String[] fruits = {"Apple", "Orange", "Pear", "Peach", "Kiwi", "Watermelon"};
		// Lets print out the fruits first
		
		for(int i = 0; i < fruits.length; i++) {
			// System.out.print(fruits + ", ");
			if (fruits[i].equals("Apple")) {
				System.out.println(fruits[i] + " --> Which is my favorite fruit.");
			} else {
				System.out.println(fruits[i]);
			}
		}
		
		System.out.println("-------------------------");
		// lets do this with for-each loop
		
		for(String fruit : fruits) {
			if (fruit.equals("Watermelon")) {
			System.out.println(fruit + " --> this is my 2nd favorite fruit.");
			} else {
				System.out.println(fruit);
			}	
		}
	}
}
