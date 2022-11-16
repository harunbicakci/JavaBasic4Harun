package com.neotech.lesson26;

public class MarksTest {

	public static void main(String[] args) {
	
		Marks s1 = new StudentA(78, 89, 98);
		Marks s2 = new StudentB(66,77,88,99);
		
		Marks[] arr = new Marks[2];
		arr[0] = s1;
		arr[1] = s2;
		
		for (Marks element : arr) {
			element.getAverage();
		}
		
	}
}
