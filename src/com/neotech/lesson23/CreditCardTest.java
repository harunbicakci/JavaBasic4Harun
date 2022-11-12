package com.neotech.lesson23;

public class CreditCardTest {

	public static void main(String[] args) {

		CreditCard cc1 = new CreditCard();
		cc1.calculateInterest(7400, 6.5);
		
		Visa v1 = new Visa();
		v1.calculateInterest(3400, 7.2);
		
		AX a1 = new AX();
		a1.calculateInterest(4250, 6.2);
	}

}
