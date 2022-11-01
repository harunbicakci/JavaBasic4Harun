package com.neotech.lesson11;

public class Task1 {
	public static void main(String[] args) {
		
//		Create an array of chars and store grades into it:
//			A,B,C,D,E,F. Then print a grade B (use 2 different ways of
//			creating an array).

		
		char[] grades = {'A','B','C','D','E','F'};
		
		System.out.println("Grade B is --> " + grades[1]);
		
		
		System.out.println("*****************************");
		
		
		char[] grades2 = new char[6];
		
		grades2[0] = 'A';
		grades2[1] = 'B';
		grades2[2] = 'C';
		grades2[3] = 'D';
		grades2[4] = 'E';
		grades2[5] = 'F';
		
		
		System.out.println(grades2[1]);
		
		
		
		
		
	}
}
