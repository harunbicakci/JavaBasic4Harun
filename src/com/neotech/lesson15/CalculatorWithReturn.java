package com.neotech.lesson15;

public class CalculatorWithReturn {

	// add two numbers

	int add(int a, int b) {
		int sum = a + b;

		// add the numbers and send the sum back (don't print)
		return sum;
	}

	// we are writing a multiply method, which
	// --> takes two numbers as parameters
	// --> returns their product

	int multiply(int a, int b) {
		// send back their product
		return a * b;
	}

	double divide(double a, double b) {
		double res = a / b;

		return res;

		// return a/b;
	}

	// simplest method, no input, just return 5
	// any time that it is called
	int giveBackSomething() {
		return 5;
	}

	void dontGiveBackAnything() {
		System.out.println("Nothing is sent back!");

	}

	// create a method that gets three double as input
	// and sends back the average

	double average(double a, double b, double c) {
		double sum = a + b + c;

		return sum / 3;
	}

}
