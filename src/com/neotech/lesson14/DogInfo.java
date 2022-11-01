package com.neotech.lesson14;

public class DogInfo {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.breed = "Golden Retriever";
		d1.size = "Medium";
		d1.color = "White";
		d1.age = 3;
		
		d1.eat();
		d1.run();
		d1.barks();
		
		System.out.println();
		
		d2.breed = "Labrador";
		d2.size = "Medium";
		d2.color = "Black";
		d2.age = 7;
		
		d2.eat();
		d2.run();
		d2.barks();
	}
}
