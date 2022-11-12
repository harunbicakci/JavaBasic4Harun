package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard card1 = new CreditCard(4000);
		card1.calculateInterest();

		// up-casting is done automatically
		CreditCard card2 = new AX(8000);
		card2.calculateInterest();

		CreditCard card3 = new Visa(12000);
		card3.calculateInterest();
		// card3.cashBack(); // CE, type of card3 is Parent class

		System.out.println("-----------------------------");
		// How do i call cashBack?
		// I have to do down-casting: manually
		Visa visaCard = (Visa) card3;
		visaCard.calculateInterest();
		// visaCard.cashBack();​
		// run-time error, card2 is not a Visa card
		// Visa visaCard2 = (Visa) card2;
		// Visa visaCard3 = (Visa) card1;

		int[] intArray = { 3, 5, 6, 20 };
		String[] strArray = { "a", "b", "c" };

		System.out.println("---- Array of Credit Cards-----");
		CreditCard[] cards = { card1, card2, card3 };

		for (CreditCard cc : cards) {
			cc.calculateInterest();
		}

		System.out.println("-----Using normal for loop -----");
		for (int i = 0; i < cards.length; i++) {
			CreditCard cc = cards[i];
			cc.calculateInterest();
		}

	}
}
