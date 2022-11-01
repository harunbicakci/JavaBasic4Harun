package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {
		Cat cat1 = new Cat(); // created an instance of Cat
		cat1.name = "Leo";
		cat1.weight = 8;
		cat1.color = "Gray";

		cat1.sayMeow();
		cat1.displayCatInfo();

		Cat cat2 = new Cat();
		cat2.name = "Zia";
		cat2.weight = 9;
		cat2.color = "Brown";

		System.out.println(cat1.name + " is " + cat1.color);
		System.out.println(cat2.name + " is " + cat2.color);

		cat1.name = "Daisy";
		System.out.println(cat1.name);
		System.out.println(cat2.name);
	
		System.out.println("-------------");
		cat1.displayCatInfo();
		cat2.displayCatInfo();

	}
}
