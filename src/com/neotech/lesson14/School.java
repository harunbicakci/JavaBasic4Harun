package com.neotech.lesson14;

public class School {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.firstName = "Vane";
		s1.lastName = "Acuna";
		s1.school = "Neotech Academy";
		s1.studentId= 1;
		s1.grade = 'A';
		s1.gender = 'F';
		
		s1.doHomework();
		s1.study();
			
		s2.firstName = "Murat";
		s2.lastName = "Tosun";
		s2.school = "Neotech Academy";
		s2.studentId= 2;
		s2.grade = 'A';
		s2.gender = 'M';
		
		s1.doHomework();
		s1.study();
		
		
		
	}
}
