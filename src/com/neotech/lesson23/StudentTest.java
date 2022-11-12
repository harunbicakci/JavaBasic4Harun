package com.neotech.lesson23;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.attendingClasses();
		s1.study();
		s1.hobbies();
		
		NeotechStudent ns1 = new NeotechStudent();
		ns1.attendingClasses();
		ns1.sdlcClasses();
		
		CollegeStudent cs1 = new CollegeStudent();
		cs1.study();
		cs1.universityGoal();
		
		SchoolStudent ss1 = new SchoolStudent();
		ss1.hobbies();
		ss1.sports();
		
		Student s2 = new NeotechStudent();
		s2.attendingClasses();
		s2.study();
		s2.hobbies();
//		s2.sdlcClasses();
		
	}

}
