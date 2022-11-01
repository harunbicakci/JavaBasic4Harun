package com.neotech.lesson08;

public class IntroToWhileLoop {
	public static void main(String[] args) {
		
		int time = 8;
		
		if (time < 9) { // begin of if body
			System.out.println("Good Evening.");
		} // end of if body
		
		// in case you do not think properly for stopping condition,
		// then you risk going into an infinite loop
		
		while (time < 12) { // begin of while body
			
			System.out.println(time);
			
			
			time++;
		} // end of while body
		
		System.out.println("***********************************");
		
		// how to print numbers [20 - 30[
		
		int a = 20;
		
		while ( a < 30) {
			// System.out.println("Condition: " + ( a < 30));
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println("\n***********************************");
		
		// how to print numbers 5 to 25?
		
		int b = 5;
		
		while (b < 25) {
			System.out.print(b + " ");
			b++;
		}
		
		System.out.println("\n***********************************");
		
		// print even numbers from 50 to 1? 
		
		int c = 50;
		
		while ( c >= 1) {
			if ( c % 2 == 0) {
				System.out.print(c + " ");
			}
			c--;
		}
		
		
		
		
	}
}
