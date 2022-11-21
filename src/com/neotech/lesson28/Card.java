package com.neotech.lesson28;

public abstract class Card {

//	Create a Card class that will have implemented and unimplemented methods and 
//	a constructor that will initializes credit card type. 
//	Create 3 subclasses of a Card card. 
//	Create 3 objects of different card and store them into LinkedList.
//	Using for loop/advanced for loop/ iterator access all methods of the class.
	
	String creditCardType;
	
	public  Card(String creditCardType){
		this.creditCardType = creditCardType;
	}
	
	void increaseCardLimit() {
		
	}
	
	abstract void annualFee();
}

class MasterCard extends Card{

	public MasterCard(String creditCardType) {
		super(creditCardType);
	}

	@Override
	void annualFee() {
		System.out.println(creditCardType + " --> Spend $1000 for no annual fee.");
	}
	
	void increaseCardLimit(){
		System.out.println(creditCardType + " --> Your " + creditCardType + " limit has been increased!");
	}
}

class Visa extends Card{
	
	public Visa(String creditCardType) {
		super(creditCardType);
	}
	@Override
	void annualFee() {
		System.out.println(creditCardType + " --> There is $50 annual fee.");
	}
	
	void increaseCardLimit(){
		System.out.println(creditCardType + " --> To increase your " + creditCardType + " limit please clich \"here\"");
	}
}

class Amex extends Card{
	
	public Amex(String creditCardType) {
		super(creditCardType);
	}
	@Override
	void annualFee() {
		System.out.println(creditCardType + " --> Spend at least $100 for no annual fee.");
	}
	
	void increaseCardLimit(){
		System.out.println(creditCardType + " --> Pleaes update your income.");
	}
}
