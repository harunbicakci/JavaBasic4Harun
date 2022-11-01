package com.neotech.lesson09;

public class Recap {
	public static void main(String[] args) {
		
		// printing Good Evening 5 times
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		
		System.out.println("**************************************");
		
		// 2nd way 
		// what do we need when use a WHILE LOOP?
		// - we are responsible for where, when we start
		// - we are responsible when we stop
		
		int count = 1;
		while(count <= 5) { // 5], 6[
			
			System.out.println("Good Evening");
		
			count++; // count = count + 1 or count += 1	
		}
		
		System.out.println("**************************************");
		
		// 3rd way - using DO-WHILE
		
		int num = 1;
		
		do {
			System.out.println("Good Morning");
			num++;
		} while(num <= 10);
		
		// difference ??
		
		int n1 = 10;
		while(n1 <+5) {
			System.out.println("Good Night");
			n1++;
		}
		
		
		
		
		
		
	}
}
