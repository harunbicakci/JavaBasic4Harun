package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Create a Set collection that will hold Objects of Student
//Type. In this set we do not care about the insertion order.
//Each student object should have name and studentID.
//Display name of each student.

public class StudentType {

	String name;
	int studentID;
	
	public StudentType (String name, int studentID) {
		this.name = name;
		this.studentID = studentID;	
	}
	
	public void display() {
		System.out.println("The student name that has the ID No: " + studentID + " is " + name);
	}
	
	public static void main(String[] args) {
		
		Set<StudentType> sl = new HashSet<>();
		
		sl.add(new StudentType("Kobe", 201000251));
		sl.add(new StudentType("Lebron", 201000223));
		sl.add(new StudentType("Ray", 201000244));
		sl.add(new StudentType("Kevin", 201000245));
		sl.add(new StudentType("Ja", 201000246));
		
		Iterator<StudentType> iter = sl.iterator();
		
		while (iter.hasNext()) {
			StudentType str = iter.next();
			str.display();
		}
		
	}
}
