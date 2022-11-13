package com.neotech.lesson25;

public class PhoneTest {
	public static void main(String[] args) {
		
		// We cannot instantiate abstract classes
		// We cannot create objects from abstract classes
		// Phone p = new Phone();
		// p.takePicture();

		Phone iphone3 = new iPhone(); // upcasting
		iphone3.call();
		iphone3.text();
		iphone3.takePicture();
		iphone3.playMusic();

		Phone samsung = new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();

		// Error. No googlePlay() method in Phone class
		// samsung.googlePlay();
	}
}
