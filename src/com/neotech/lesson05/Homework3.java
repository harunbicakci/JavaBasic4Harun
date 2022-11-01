package com.neotech.lesson05;

public class Homework3 {
	public static void main(String[] args) {
		

// 	Write a java program to check if a patient has allergies.
//    If the patient does not have allergies print “You’re healthy!”.
//    If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
//    and print a statement telling the patient 
//    “Don’t eat ___”. (fill the line with the food names – peanut, seafood etc.)

		
		boolean allergies = true;
		boolean peanutAllergy = false;
		boolean lactoseAllergy = true;
		boolean beeAllergy = false;
		boolean seafoodAllergy = true;
		
		
		
		if (allergies) {
			if (peanutAllergy) {
				System.out.println("Don`t eat peanut.");
			} if (lactoseAllergy) {
				System.out.println("Don`t eat dairy.");
			} if (beeAllergy) {
				System.out.println("Dont eat honey.");
			} if (seafoodAllergy) {
				System.out.println("Don`t eat seafood.");
			}
		} else {
			System.out.println("You are healthy!");
		}
		
		
	}
}
