package com.neotech.lesson08;

public class Task1 {
	public static void main(String[] args) {
		
//		Create a boolean variable workDay and assign true create int
//		variable day and assign it to 1
//		- As long as it is workDay print "I need a day off" and
//		increase day.
//		- Once day is 6 print "I do not need a day off any more"
		
		boolean workDay = true;
		int num1 = 1; 
		
		while (workDay) {
			if (num1 <=5) {
				System.out.println("I need a day off.");
			} else if (num1 == 6) {
				System.out.println("I do not need a day off any more.");
				workDay = false;
			}
			num1++;
		}	
		
	System.out.println("**************************");
			
			while (workDay) {
				if (num1 <=5) {
					System.out.println("I need a day off!!!");
				} else {
					System.out.println("I do not need a day off any more!!!");
					workDay = false;
				}
				num1++;
			}
		
		
	}
}
