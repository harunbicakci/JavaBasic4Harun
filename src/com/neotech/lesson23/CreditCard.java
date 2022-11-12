package com.neotech.lesson23;

public class CreditCard {
//	Homework 1:
//	    ▪ Create a class CreditCard and define two variables, balance and interest.
//	    ▪ Create an instance method that will calculate the interest based on the given balance.
//	    ▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
//	    ▪ Call the method by creating an object of each of the three classes.

	int balance; 
	double interestRate;
	int interest;
	
	public void calculateInterest(int balance, double interestRate) {
		interest = (int) (balance * (interestRate / 100));
		System.out.println("The interest payment for "
				+ "remaining balance is $" + interest);
	}
}

class Visa extends CreditCard{
	
	public void calculateInterest(int balance, double interestRate) {
		interest = (int) (balance * (interestRate / 100));
		System.out.println("The interest payment of remainng balance "
				+ "for Visa Credit Card is $" + interest);
	}
}

class AX extends CreditCard{
	
	public void calculateInterest(int balance, double interestRate) {
		interest = (int) (balance * (interestRate / 100));
		System.out.println("The interest payment of remaining balance for "
				+ "AX Credit Card is $" + interest);
	}


}