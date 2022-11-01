package com.neotech.lesson09;

public class AdditionalTask2 {
	public static void main(String[] args) {
		
//		▪ Write a program that displays each even/odd number in pop up
//		between 1 and 32.

		for (int a = 1; a <= 32; a++) {
			if(a % 2 == 0) {
				System.out.print("\n" + a + " is a even number.");
			} else {
				System.out.print("\n" + a + " is an odd number.");
			}
		}
	}
}
