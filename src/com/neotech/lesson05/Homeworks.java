package com.neotech.lesson05;

public class Homeworks {
	public static void main(String[] args) {
		
//		▪ Write a Java program to check if a student has
//		done the Quiz. If the student did the Quiz, then
//		check the score and give the following evaluations:
//		o If the score is 90 or greater, print “A, Great job!”.
//		o If the score is 80 or greater, print “B, Well done!”.
//		o If the score is 70 or greater, print “C, You passed!”.
//		o Otherwise, print “F, You failed”.
		

		boolean quizDone = true;
		int score = 98;
		
		if (quizDone) {
			if (score >= 90 && score <= 100) {
				System.out.println("A, Great Job!");
			} else if (score >= 80 && score <90) {
				System.out.println("B, Well Done!");
			} else if (score >= 70 && score <80) {
				System.out.println("C, You Passed!");
			} else {
				System.out.println("F, You Failed!");
			}
		} else {
			System.out.println("F, You Failed!!!");
		}
		
		
	}
}
