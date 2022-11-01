package com.neotech.lesson16;

public class Student {

	char getGrade ( int score){
		char grade;
		
		if(score > 90) {
			grade = 'A';
		}else if ( score > 80) {
			grade = 'B';
		}else if ( score > 70) {
			grade = 'C';
		}else if ( score > 50) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		
		char result = st.getGrade(60);
		System.out.println("Student 1 got " + result);
		
		
		
		
		
	}
}
