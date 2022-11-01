package com.neotech.lesson09;

public class SkipNumbers {
	public static void main(String[] args) {
		
		// print numbers from 1 to 10 --- ski[ 3, 6, and 9
		
		for (int a=1;a<=10;a++) {
			if (a % 3 == 0) {
				continue;
			}
			System.out.print(a + " ");
		}
		
	}
}
