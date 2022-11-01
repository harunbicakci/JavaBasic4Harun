package com.neotech.lesson12;

public class Homework5 {
	public static void main(String[] args) {
		
//		2. Create a 2D array that first row will
//		contain 4 names and second row will
//		contain grades. Then you program
//		should print name of the students that
//		has A and B grade
		
		String[][] namesGrades = {
				{"Jordan", "Kobe", "Curry", "Ja Murrant"},
				{"B", "A", "D", "C"}
		};
		
		for ( int i = 0; i < namesGrades[0].length; i++) {
			if (namesGrades[1][i].equals("A") || namesGrades[1][i].equals("B")) {
				System.out.println(namesGrades[0][i] + "`s grade is: " + namesGrades[1][i] + ".");
			} else if (namesGrades[1][i].equals("C") || namesGrades[1][i].equals("D")){
				System.out.println(namesGrades[0][i] + " could not pass the class with grade: " + namesGrades[1][i] + ".");
			}
			
		}
		
		
	}
}
