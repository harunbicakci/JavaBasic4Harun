package com.neotech.lesson29;

public abstract class Insurance {

	/*
	 * Create a class Insurance that will have an attribute as insuranceName and
	 * unimplemented behavior as getQuote and cancelInsurance. 
	 * 
	 * Create 3 subclasses
	 * Car, Pet, Health. 
	 * Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
	 * Create 3 objects of the sub classes and store them in
	 * ArrayList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 */
	
	String insuranceName;
	
	Insurance(String insuranceName)
	{
		this.insuranceName = insuranceName;
	}
	
	abstract void getQoute();
	abstract void cancelInsurance();	
}

class CarInsurance extends Insurance
{
	String carModel; 

	CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	void getQoute() {
		System.out.println("The qoute for the " + carModel + " is 600$!!");		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your CAR insurance???");
	}
	
}


class PetInsurance extends Insurance
{
	String petType;
	
	
	PetInsurance(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	void getQoute() {
		System.out.println("The qoute for " + petType + " is 150$");
	}

	@Override
	void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your PET insurance???");
	}
}


class HealthInsurance extends Insurance
{

	HealthInsurance(String insuranceName) {
		super(insuranceName);
	}

	@Override
	void getQoute() {
		System.out.println("The qoute for health insurance is 2000$");
	}

	@Override
	void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your HEALTH insurance???");
	}
}
