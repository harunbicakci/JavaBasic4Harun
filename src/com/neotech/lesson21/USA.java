package com.neotech.lesson21;

public class USA {

	// instance variables
	String state, stateCapital;

	// constructor
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}

	// methods
	public void displayState() {
		System.out.println(state);
	}

	public void displayStateCapital() {
		System.out.println(stateCapital);
	}

	public void displayInfo() {
		this.displayState();
		displayStateCapital();// compiler will add this. keyword by default
	}

	public static void main(String[] args) {
		USA us1 = new USA("New Jersey", "Trenton");
		us1.displayInfo();

		System.out.println("--------------");
		USA st2 = new USA("Delaware", "Dover");
		st2.displayInfo();
	}
}
