package com.neotech.lesson11;

public class HomeworkArray4 {

	public static void main(String[] args) {

//		▪ Create an array of names and store all names of your group.
//		Then print your name from that array. (use 2 different ways
//		of creating an array).

		String[] names = {"Curry", "Lebron", "Kobe", "Shaq", "Durrant"};
		
		System.out.println("Here is my favorite player ==> " + names[4]);
		
		System.out.println("*************************************");

		String[] names2 = new String[4];
		names2 [0] = "Emre";
		names2 [1] = "Harun";
		names2 [2] = "Kerem";
		names2 [3] = "Alpturk";
		
		System.out.println(names2[1]);
		System.out.println("The length of first names array is: " + names.length);
		System.out.println("The second arrays length is: " + names.length);
	}

}
