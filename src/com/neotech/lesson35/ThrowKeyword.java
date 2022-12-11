package com.neotech.lesson35;

class InsufficientFundsException extends RuntimeException {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {
		Exception ex = new Exception();
		ArithmeticException ax = new ArithmeticException();

		// throw ax;
		// throwException();

		try {
			withdraw(2000, 2500);
		} catch (InsufficientFundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void throwException() {
		throw new ArithmeticException();
	}

	public static void withdraw(int balance, int amount) {
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds!");
		}
	}

}
