package com.neotech.lesson03;

public class Homework2 {
	public static void main(String[] args) {
		
//		2. Write a java program that converts mile to km and km to miles.
//		Use scale 1 mile = 1.609344.
	
		double km, mile;
		
		mile = 70.3;
		km = (mile * 1.609344);
		
		System.out.println( mile + " miles is equal to " + km + " km.");
		
		
		System.out.println("------------------");
		
		double k, m;
		k = 225;
		m = k / 1.609344;
		
		System.out.println( k + " km is equal to " + m + " miles.");
		
		
	}
}
