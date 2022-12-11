package com.neotech.lesson35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class homework1 {

//	Create a static method that will return a List of Exceptions.
//	Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//	Call your method inside main and print name and details of all Exception objects.

	public static void main(String[] args) {
		// call the method for exceptions
		List<Exception> exceptionList = getAllExceptions();
		
		// iterate over the list to see what exceptions are caught
		Iterator<Exception> it = exceptionList.iterator();
		
		while(it.hasNext()) {
			it.next().printStackTrace();
		//	System.out.println(it.next());
		}
	}

	public static List<Exception> getAllExceptions(){
		List<Exception> toReturn = new ArrayList<>();
		
		// lets create some Exception situations
		List<String> ls = new ArrayList<>();
		ls.add("Dardan");
		ls.add("Hakan");
		
		// 1st exception - ArrayIndexOutOfBoundsException
		int[] intArray = {1,2,3,4,5,6};
		
		try {
			System.out.println(intArray[6]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			toReturn.add(ex);
		}
		
		// 2nd exception - ClassCastException
		try {
			Object obj = new Double(50);
			Integer i =(Integer) obj;
		}catch(ClassCastException ex) {
			toReturn.add(ex);
		}
		
		// 3rd exception - ArithmeticException
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ex) {
			toReturn.add(ex);
		}
		
		// 4th exception - NegativeArraySizeException
		try {
			int[] negArray = new int[-1];
		}catch(NegativeArraySizeException ex) {
			toReturn.add(ex);
		}
	
		
		return toReturn;
	}
}
