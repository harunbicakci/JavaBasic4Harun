package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
//		▪ Write a program that lets user to enter apple,dell,acer lap top
//		models;
//		If it is apple show “Apple-no virus”
//		If it is dell show “Tough one”
//		If it is acer show “Cheap one”
//		Else “do not buy that one!”
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Please enter which brand lap top you are using:");
		String model = info.next();
		
		switch (model) {
			case "Apple":
				System.out.println("Apple No-Virus.");
				break;
			case "Dell":
				System.out.println("Tough one.");
				break;
			case "Acer":
				System.out.println();
				break;
			default: 
				System.out.println("Do not buy that one!");
				break;
		}
	}
}
