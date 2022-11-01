package com.neotech.lesson17;

public class Homework5 {
	public static void main(String[] args) {
		
//		Homework 5:
//		You have a String a = “Is it saturday? Is it raining? Do we have
//		a Java Class today?” How would you find out how many
//		sentences are in that String?
		
		String question = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String question1 = question.replaceAll("[?]", "-");
		
		String[] sentences = question1.split("-");
		
		// String[] sentences = question.split("\\?"); //   \\?
		
		System.out.println(sentences.length);
		
	}
}
