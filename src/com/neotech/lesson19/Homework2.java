package com.neotech.lesson19;

public class Homework2 {

//	▪ Create a method that will take a String as a
//	parameter and returns reversed String. Method
//	should be available to all classes within your project
//	and accessible by class name.
	
	// 1st wat with
	public static String reverseString1 (String str){
		String reversed = "";
		for ( int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i); 		
		}
		return reversed;
	}
	
	
	// 2nd way with StringBuffer
	
	public static StringBuffer reverseString2 (String str) {
		
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse();
	}
}
