package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//	Create a static method that will return a List of Exceptions.
//	Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//	Call your method inside main and print name and details of all Exception objects.

public class Homework3401 {
	
	
	static List<Exception> listOfExceptions() {
		
		ArrayList<Exception> excList = new ArrayList<>();
// 1st		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number:");
			int num = scan.nextInt();
		}catch(InputMismatchException ime) {
			excList.add(ime);
		}
// 2nd
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number for division to \"0\":");
			int num = scan.nextInt();
			int num2 = num / 0;
		}catch(ArithmeticException ae) {
			excList.add(ae);
		}
// 3rd
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your file path: ");
			String path = scan.next();
			FileInputStream fis = new FileInputStream(path);	
		}catch(FileNotFoundException fnfe) {
			excList.add(fnfe);
		}
// 4th
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a word has at least 5 letters:");
			String str = scan.next();
			System.out.println(str.charAt(6));
		}catch(StringIndexOutOfBoundsException sioobe) {
			excList.add(sioobe);
		}

		return excList;
	}
	
	public static void main(String[] args) {
		
		for ( Exception el : Homework3401.listOfExceptions()) {
			System.out.println(el + "\n");
			
		}
		
	}

}
