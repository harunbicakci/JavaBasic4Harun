package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
		// lets create basic integer array
				int[] grades = new int[5];
				// lets print the size of this array
				System.out.println("The size of the array is: " + grades.length);
				// element with index # 2
				System.out.println("The third element of the array is: " + grades[2]);
	
				grades[3] = 85;
				grades[1] = 90;
				// error: index 5 doesn't exist
				// grades[5] = 100;
				// error: can't assign a string
				// grades[2] = "hello";
				grades[2] = 100;
				grades[0] = 93;
				grades[4] = 78;

				// re-assign the value of an element
				grades[4] = 98;

				int size = grades.length;
		
				System.out.println("The size of the array after assigning values is " + size);
				// element with index # 2
				System.out.println("The third element of the array is: " + grades[2]);
				
				// lets find the total of all elements of the array
				int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
				System.out.println("The total is: " + total);
				
				// find average of the array
				int average = total / 5;
				System.out.println("The average is " + average);
				
				System.out.println("----------------");
		
				// 2nd way: Lets find the total using a for loop
				int sum = 0;
				for (int i = 0; i < 5; i++) {
					sum += grades[i]; // sum = sum + grades[i];
				}
				
				System.out.println("The total is: " + sum);
				int avg = sum / grades.length; // int avg = sum / size;
				System.out.println("The average is " + avg);
				
				System.out.println("----------------");
		
				String[] cities = { "Paris", "New York", "London", "Istanbul", "Tokyo", "Dushanbe" };
				System.out.println(cities[3]);
				
				System.out.println("The size of my string array is " + cities.length);
				// Lets print the names of cities on the screen
				for (int i = 0; i < cities.length; i++) { // cities.length = 6
					System.out.println(cities[i]);
				}
	}

}
