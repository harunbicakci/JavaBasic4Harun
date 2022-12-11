package com.neotech.lesson35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CantDriveException extends RuntimeException {
	public CantDriveException(String msg) {
		super(msg);
	}
}

public class Task1 {

	/*
	 * Create a method to check age eligibility that will throw a runtime exception.
	 * Method should throw an exception if age is less than 16.
	 * 
	 */

	public static void main(String[] args) {
		try {
			canIdrive(16);
			canIdrive(14);
		} catch (CantDriveException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void canIdrive(int age) {
		if (age < 16) {
			// throw new RuntimeException("You can not drive!");
			throw new CantDriveException("You can not drive!");

		} else {
			System.out.println("Drive safe!");
		}
	}

}


