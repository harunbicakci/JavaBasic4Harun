package com.neotech.lesson19;

public class Task1Demo {
	public static void main(String[] args) {
		
		// can we access it by class name? No, we need to create object
		Task1 obj = new Task1();
		
		int[] arr = { 34,43,54,12};
		
		int sum = obj.sum(arr);
		
		System.out.println(sum);
		
		
		
		
	}
}
