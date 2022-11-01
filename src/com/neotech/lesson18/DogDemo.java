package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {
		
		// How can I access instance variables?
		// By creating an object and using reference value
		
		Dog dog1 = new Dog();
		dog1.name = "Qimi";
		dog1.age = 2;
		dog1.age = 3;
		dog1.displayDogInfo();
		
		// How can I access static variables?
		// We can access it by using the class name
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		
		Dog dog2 = new Dog();
		dog2.name = "Jager";
		dog2.age = 7;
		dog2.displayDogInfo();
		
		System.out.println("------------------------");
		Dog.breed = "Sheppard";
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		Dog dog3 = new Dog();
		dog3.name = "Magic";
		dog3.age = 3;
		dog3.displayDogInfo();
		
		
		
		
		
		
	}
}
