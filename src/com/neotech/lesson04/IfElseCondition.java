package com.neotech.lesson04;

public class IfElseCondition {

	public static void main(String[] args) {
		// If a have more that $5000 in my bank account
		// then I will buy a LV bag

		int account = 1535;

		if (account > 5000) {
			System.out.println("I will buy a LV bag");
			System.out.println("My wife will be happy");
		}

		System.out.println("I will leave the mall");

		System.out.println("--------------------------------");
		// You should practice Java 15 hours per week
		// If you are practicing 15 or more, you will love Java
		// otherwise you will Not love Java

		int hours = 18;

		System.out.println("Practicing hours -> " + hours);

		if (hours >= 15) {
			System.out.println("You will love Java!");
		} else {
			System.out.println("You will NOT love Java!");
		}

		System.out.println("We are done for today!");

	}

}
