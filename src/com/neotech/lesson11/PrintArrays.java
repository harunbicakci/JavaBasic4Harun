package com.neotech.lesson11;

public class PrintArrays {
	public static void main(String[] args) {
		
		int[] points = {90, 85, 95, 75, 93, 95, 100};
		
		// printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		// add same for all other indices
		
		int size = points.length;
		
		
		for(int i = 0; i < size; i++) { // i < points.length --> we can also use this code
			System.out.print(points[i] + " ");
			
		}
		
		// to get the average of the array?
		
		int sum = 0;
		
		// sum = points[0] + points[1] +. .
		
		for (int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		System.out.println("The sum is: " + sum);
		
		System.out.println("The average of array is: " + (sum / points.length));
		
		
		
		
	}
}
