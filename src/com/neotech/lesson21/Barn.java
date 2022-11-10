package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.size = "Big";
		a.color = "Balck";
		a.age = 5;
		
		a.sleep();
		a.eat();
		a.displayInfo();
		
		System.out.println("----------------------");
		Dog d = new Dog();
		d.size = "Medium"; // coming from Animal class
		d.color = "White"; // coming from Animal class
		d.age = 2;	// coming from Animal class
		d.breed = "Husky"; // specific to Dog object
		
		d.eat();	// coming from Animal class
		d.sleep();	// coming from Animal class
		d.displayInfo();	// coming from Animal class
		d.bark();	// specific to Dog object
		
		System.out.println("----------------------");
		Cat c = new Cat();
		c.size = "Small";
		c.age = 1;
		c.color = "Gray";
		
		
		c.eat();
		c.sleep();
		c.displayInfo();
		c.meow();
		
	}
}
