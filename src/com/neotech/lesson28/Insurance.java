package com.neotech.lesson28;

public abstract class Insurance {

//	Create a class Insurance that will have an attribute as insuranceName and 
//	unimplemented behavior as getQuote and cancelInsurance. 
//	Create 3 subclasses Car, Pet, Health.

//	Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
	
//	Create 3 objects of the sub classes	and store them in ArrayList. 
//	Using for loop/advanced for loop/ iterator access all methods of the class.
	
	String insuranceName;
	
	public abstract void getQuote();
	public abstract void cancelInsurance();
}

class Car extends Insurance{

	String carModel;
	
	Car(String carModel){
		this.carModel = carModel;
	}
	
	@Override
	public void getQuote() {
		System.out.println("Car Insurance -> Click \"here\" for best competitive price for your " + carModel);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Car Insurance -> You can cancel the insurance of your " + carModel + " anytime!");
	}
	
}

class Pet extends Insurance{
	
	String petType;
	
	Pet(String petType){
		this.petType = petType;
	}
	@Override
	public void getQuote() {
		System.out.println("Pet Insurance -> For the insurance of your litte " + petType + " friend you know you can get the best offer! Click \"here\"");
		}

	@Override
	public void cancelInsurance() {
		System.out.println("Pet Insurance -> Are you sure you want to cancel insurance of your little " + petType + " friend?");
		}
	
}

class Health extends Insurance{

	@Override
	public void getQuote() {
		System.out.println("Health Insurance -> Let us give you best price for health insurance, hover your mouse \"here\" :)");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Health Insurance -> You can cancel has been cancelled. Click \"here\" to get new offer.");
	}
	
}


