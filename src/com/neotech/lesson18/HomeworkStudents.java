package com.neotech.lesson18;

public class HomeworkStudents{

//	Create a Class called HomeworkStudents 
//	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
//	▪ Create three objects of the Students Class
//	▪ Set the value for studentName, studentID and increment the numberOfStudents for each object
//	▪ Print out total the number of students
	
		String studentName;
		int studentID;
		static int numberOfStudents = 0;
		
		
	
	public static void main(String[] args) {
			
		HomeworkStudents obj1 = new HomeworkStudents();
		HomeworkStudents obj2 = new HomeworkStudents();
		HomeworkStudents obj3 = new HomeworkStudents();
		
		obj1.studentName = "Harun";
		obj1.studentID = 0001;
		numberOfStudents++;
		
		obj2.studentName = "Sedat";
		obj2.studentID = 0002;
		numberOfStudents++;
		
		obj3.studentName = "Baris";
		obj3.studentID = 003;
		numberOfStudents++;
		
		System.out.println("Number of students is --> " + numberOfStudents);
		
	}
}
