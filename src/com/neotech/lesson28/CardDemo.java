package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardDemo {

	public static void main(String[] args) {

		List<Card> cards = new LinkedList<>();

		cards.add(new MasterCard("Master"));
		cards.add(new Visa("Visa Card"));
		cards.add(new Amex("AMEX"));
		
		System.out.println("-----------For Loop-----------");
		
		for(int i = 0; i < cards.size(); i++) {
			cards.get(i).increaseCardLimit();
			cards.get(i).annualFee();
		}
		
		System.out.println("-----------For Each Loop-----------");
		
		for(Card single : cards) {
			single.increaseCardLimit();
			single.annualFee();
		}
		
		System.out.println("-----------Iterator-----------");
		
		Iterator<Card> iter = cards.iterator();
		
		while(iter.hasNext()) {
			Card singleCard = iter.next();
			singleCard.increaseCardLimit();
			singleCard.annualFee();
		}
		
		
	}

}
