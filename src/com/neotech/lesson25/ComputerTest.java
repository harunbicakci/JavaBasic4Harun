package com.neotech.lesson25;

public class ComputerTest {
	public static void main(String[] args) {

		Apple app = new Apple("Apple");
		HP hp = new HP("HP", "Red");

		// arrays want same data type
		int[] array = { 3, 5, 9, 2 };

		Computer c1 = new Dell("Dell"); // Upcasting
		Computer c2 = new Lenovo("Lenovo");

		// one way of creating an array of computers
		Computer[] compArray = { c1, c2 };

		// another way of creating an array of computers
		Computer[] compArray2 = { new Dell("Dell"), new HP("HP", "Black"), new Apple("Apple") };

		for (Computer comp : compArray2) {
			System.out.println("The brand is " + comp.brand);
			comp.run();

			// What if we try to run the save() method
			// comp.save(); // This method does not exist in Computer class
		}
		
		// We can have arrays of specific classes
		// It has to include only instances/object of that class
		Apple[] appleArray = {new Apple("Apple1"), new Apple("Apple2")};

	}
}
