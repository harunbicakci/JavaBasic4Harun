package com.neotech.lesson16;

public class StringMethodsContinue {
	public static void main(String[] args) {
		
		// contains
		String sentence = "Today is Oct 22";
		boolean cont = sentence.contains("2"); // this is a question, if there is this word "is"?
		System.out.println(cont);
		System.out.println(sentence.toLowerCase().contains("today"));
		
		// sentence.toLowerCase().contains("today);
		// instead of method chaining we write 3 lines in line
		// String lower = sentence.toLowerCase();
		// boolean check = lower.contains("today");
		
		
		// startsWith()
		// "Today is Oct 22"
		boolean starts = sentence.startsWith("Today", 5);
		System.out.println(starts);
		
		// endsWith()
		boolean ends = sentence.endsWith("Oct");
		System.out.println(ends);
		
		// equals()
		String s1 = "Saturday";
		String s2 = "saturday";
		boolean equals = s1.equals(s2);
		System.out.println("equals --> " + equals);
		
		// equalsIgnoreCase()
		boolean equalsIgnoreCase = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println("Equals lower case --> " + equalsIgnoreCase);
		boolean equalsUpper = s1.toUpperCase().equals(s2.toUpperCase());
		System.out.println("Equals upper case --> " + equalsIgnoreCase);
		
		// step by step
		String s1Upper = s1.toUpperCase();
		String s2Upper = s2.toUpperCase();
		boolean compare = s1Upper.equals(s2Upper);
		System.out.println("Compare --> " + compare);
	}
}
