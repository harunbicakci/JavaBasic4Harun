package com.neotech.lesson30;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework3 {

	public static void main(String[] args) {

		/*
		 * Create a Set collection that will hold Objects of Student Type. In this set
		 * we do not care about the insertion order. Each student object should have
		 * name and studentID. Display name of each student.
		 */
		
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("Sefa", 20)); //students.add(new String("Shkodra"));
		students.add(new Student("Vane", 21));
		students.add(new Student("Gloria", 15));
		students.add(new Student("Fatihcan", 16));
		
		Iterator<Student> it = students.iterator();
		
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s.getName());
		}
		
	}

}


class Student
{
	private String name;
	private int studentID;
	
	Student (String name, int studentID)
	{
		this.name = name; 
		this.studentID = studentID;
	}
	
	//getter: no argument, return something
	//setter: arguments, doesn't return anything
	String getName()
	{
	//	System.out.println(name);
		return name;
	}
}
