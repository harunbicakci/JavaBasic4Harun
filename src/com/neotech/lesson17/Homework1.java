package com.neotech.lesson17;

public class Homework1 {
	public static void main(String[] args) {
		
//		Homework 1:
//		Create a String and print it in reverse order (Sunday → yadnuS). 
//		Solve it using charAt(), toCharArray()  and reverse() methods.
//		Note:
//		for charAt() and toCharArray() use String
//	    for reverse you have to declare a StringBuffer object

		String normal = "Sunday";
		
		char[] charNormal = normal.toCharArray();
		
		for (int i = charNormal.length-1; i >= 0; i--) {
			System.out.print(charNormal[i]);
		}
	}
}
