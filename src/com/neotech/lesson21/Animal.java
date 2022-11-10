package com.neotech.lesson21;

public class Animal {

	String color, size;
	int age, weight;

	public void eat() {
		System.out.println("All animals eat");
	}

	public void sleep() {
		System.out.println("All animals sleep");
	}

	public void displayInfo() {
		System.out.println("size: " + size + " color: " + color + " age: " + age + " weight:" + weight);
	}
}
