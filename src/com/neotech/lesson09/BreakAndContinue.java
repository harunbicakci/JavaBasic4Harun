package com.neotech.lesson09;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		for ( int i = 1; i <= 10; i++) {
			// when i becomes 5, break statement will execute
			//and get out of the loop
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("*************************");
		// Continue
		
		for ( int a = 1; a <= 10; a++) {
			
			if ( a == 5 ) {
				continue;
			}
			System.out.println(a);
		}
		
		
		
	}
}
