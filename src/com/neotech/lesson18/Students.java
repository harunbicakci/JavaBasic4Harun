package com.neotech.lesson18;

public class Students {

//	Create a Class called Students 
//	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
//	▪ Create three objects of the Students Class
//	▪ Set the value for studentName, studentID and increment
//	the numberOfStudents for each object
//	▪ Print out total the number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents = 0;
	
	void displayStudentInfo() {
		System.out.println("Student name: " + studentName + ", Student ID: " + studentID + ", numberOfStudent: " + 
	numberOfStudents);
	}
	
	public static void main(String[] args) {
	
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		
		s1.studentName = "Bogdan";
		s1.studentID = 1;
		s1.numberOfStudents++;
		s1.displayStudentInfo();
		
		s2.studentName = "Luka";
		s2.studentID = 2;
		s2.numberOfStudents++;
		s2.displayStudentInfo();
		
		s3.studentName = "Geremy";
		s3.studentID = 3;
		s3.numberOfStudents++;
		s3.displayStudentInfo();
		
		System.out.println("Number of students is: " + numberOfStudents);
		
		// if numberOfStudents would be on different class, we would have to call it by ClassName.numberOfStudents
	}	
}
