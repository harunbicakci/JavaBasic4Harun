package com.neotech.lesson17;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		// how did we create a String
		String a = "Hello";	// String literal
		String b = new String("Hello"); // String is a class, we are creating an object
		
		// When we want to change the string frequently
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		// We can change the String Buffer object without the need to create new one
		sb.append(" All"); // Append is a method, means add more to it
		
		// if we do it as: 
		a = a + " All";
//		a = new String("Hello All"); this is what Java need to do
		System.out.println(a);
		
		// String is immutable --- once created it can not be changed
		// StringBuffer and StringBuilder are mutable --- we create a string and
		// we can change existing string
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		String subStr = sb.substring(2, 5);
		System.out.println(subStr);
		
		// an example with StringBuffer and SringBuilder
		StringBuffer StrBuff = new StringBuffer("");
		
		StringBuilder strBld = new StringBuilder("It is late,");
		strBld.append(" but we wont stop!");
		
		System.out.println(strBld);
		
		
		
	}
}
