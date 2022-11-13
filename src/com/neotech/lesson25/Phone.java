package com.neotech.lesson25;

public abstract class Phone {

	// implemented methods
	public void call() {
		System.out.println("Phones can make calls!");
	}

	public void text() {
		System.out.println("Phones can send texts!");
	}

	// unimplemented; abstract; undefined methods
	public abstract void takePicture();

	public abstract void playMusic();

}

class iPhone extends Phone {

	// implementing abstract method
	@Override
	public void takePicture() {
		System.out.println("iPhones can take good pictures!");
	}

	// implementing abstract method
	@Override
	public void playMusic() {
		System.out.println("iPhones can play music!");
	}

	// overriding parent method
	@Override
	public void call() {
		System.out.println("iPhone also makes Facetime calls!");
	}

}

// A concrete class cannot have abstract methods
// 1st option is to change the class to abstract
// 2nd option is to implement the abstract methods 
class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes bad pictures!");
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung can play simple music!");
	}
	
	public void googlePlay(){
		System.out.println("Samsung has a google play!");
	}
	}