package com.neotech.lesson11;

public class IntroToArray {
	public static void main(String[] args) {
		
		// 1st way
		// data type / identifier	/ assignment operator		value
			int 			num				=						5;
			
		// 2nd way
			// declare	
			int num2;
			// initialize
			num2 = 5;
			
			// 1st way
			int [] array1 = new int [5];
			// 2nd way
			int [] array2;
			array2 = new int [8];
			
			// array1 [ ] [ ] [ ] [ ] [ ]
			// how do we store values in array?
			array1[0] = 10;
			// array1 [10] [ ] [ ] [ ] [ ]
			array1[1] = 15;
			// array1 [10] [15] [ ] [ ] [ ]
			array1[2] = 20;
			// array1 [10] [15] [20] [ ] [ ]
			array1[3] = 30;
			// array1 [10] [15] [20] [30] [ ]
			array1[4] = 35;
			// array1 [10] [15] [20] [30] [35]
			
			// re-assignment
			array1[0] = 5;
			// array1 [5] [15] [20] [30] [35]
			
			// how do we access values?
			System.out.println(array1[2]);
			
			
			// Lets create a string array
			String[] strArray = new String[4]; // create a string array named strArray with 4 elements
			
			strArray[0] = "New York";
			strArray[1] = "New Jersey";
			strArray[2] = "Atlanta";
			strArray[3] = "Colorado";
			
			System.out.println("I live in " + strArray[0]);
			
			
			
			// strArray[4] = "Alabama"; //our bounds 0-3, and 4 is out of bounds
			
			
			char[] letters = new char[6];
			
			letters[3] = 'C';
			letters[5] = 'A';
			letters[0] = 'B';
			letters[1] = 'X';
			
			
			System.out.println("The letter at index 4 is: " + letters[5]);
			
			letters[5] = 'Y'; //reassigning
			
			System.out.println("The letter at index 4 is: " + letters[5]);
			
			System.out.println(letters[4]);
				
			
	}
}
