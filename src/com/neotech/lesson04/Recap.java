package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
		// order of arithmetic operations

		int num1 = 5 + 5 + 5;
		System.out.println(num1);

		int num2 = 5 + 5 * 5;
		System.out.println(num2);

		int num3 = (5 + 5) * 5;
		System.out.println(num3);

		int num4 = 5 * 5 + 5 / 5;
		System.out.println(num4);

		int sadik = 8 / 2 * (2 + 2);
		System.out.println(sadik);

		System.out.println("---------------------------");

		int number1 = 15;
		int number2 = 4;

		int div = number1 / number2; // 3.75
		System.out.println("div -> " + div);

		int rem = number1 % number2;
		System.out.println("rem -> " + rem);

		int rem2 = 19 % 6; // 19/6=3; 3*6=18; 19-18=1;
		System.out.println("rem2 -> " + rem2);

		int rem3 = 19 % 7; // 19/7=2; 2*7=14; 19-14=5;
		System.out.println("rem3 -> " + rem3);

		int rem4 = 347562878 % 5;
		System.out.println("rem4 -> " + rem4);

		System.out.println("---------------------------");
		System.out.println("Addition or Concatenation");

		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sunday";
		boolean z = true;

		System.out.println(x + " " + y); // Java Sunday
		System.out.println(x + y + a); // JavaSunday10
		System.out.println(x + z); // Javatrue

		System.out.println("Java" + 10 + 5); // Java105
		System.out.println("Java" + (10 + 5)); // Java15

		System.out.println(x + y + a + b); // JavaSunday1020
		System.out.println(a + b + x + y); // 30JavaSunday
		System.out.println("" + a + b + x + y); // 1020JavaSunday
		System.out.println(a + (b + x) + y); // 1020JavaSunday

		System.out.println("---------------------------");

		System.out.println(x + y + a + b); // JavaSunday1020
		System.out.println(x + y + a * b); // JavaSunday200

		System.out.println("Rahime" + 3 + 3); // Rahime33
		System.out.println("Rahime" + 3 * 3); // Rahime9

		System.out.println("---------------------------");
		// char c1 = ''; // compile error
		char c2 = ' '; // space is a character

		String emptyStr = ""; // Is a String, zero characters inside
		String spaceStr = " "; // Is a String, one characters inside, the space

	}

}
