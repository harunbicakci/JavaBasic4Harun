package com.neotech.lesson19;

public class HomeworkDemo {
	public static void main(String[] args) {
		
		Homework st1 = new Homework();
		st1.studentName = "Oktay";
		st1.studentID = 1;
		// increment number of students
		Homework.numberOfStudents++;
		
		
		Homework st2 = new Homework();
		st2.studentName = "Hakan";
		st2.studentID = 2;
		Homework.numberOfStudents++;
		
		Homework st3 = new Homework();
		st3.studentName = "Harun";
		st2.studentID = 3;
		Homework.numberOfStudents++;
		
		System.out.println("Total number of students is: " + Homework.numberOfStudents);
	}
}
