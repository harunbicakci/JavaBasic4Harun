package com.neotech.lesson27;

public class WrapperClasses {


	public static void main(String[] args) {
		int num = 10;

		Integer number1 = new Integer(20); // boxing: putting an int inside the
		// Integer object

		int num25 = number1.intValue(); // un-boxing: getting th value
		// from the object

		Integer number2 = 3500; // auto-boxing: converting from primitive to Object
		// automatically
		int num26 = number2; // auto-unboxing: converting from object to primitive
		// automatically

		System.out.println(number1.toString());
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		System.out.println("min: " + min);
		System.out.println("max: " + max);

		System.out.println("---Other Wrapper Classes---");
		// Boolean bool1 = new Boolean(false);
		Boolean bool2 = true; // auto-boxing
		System.out.println(bool2);

		Byte b1 = 25; // auto-boxing
		System.out.println(b1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		Double d1 = 3.45;

		Character c1 = new Character('P'); // boxing
		Character c2 = 'X'; // auto-boxing
	}
}