package com.neotech.lesson20;

public class Homework2002 {

//	▪ Write a java program of Class Students (Homework2002) that takes students
//	name and 3 subject grades. Inside your class also have a
//	method to Calculate Average Grade. Test Student class for 5
//	different students with different marks. Your program should
//	print an average mark of each students name.

		String name;
		int grade1, grade2, grade3;
		
		Homework2002(String studentName, int g1, int g2, int g3){
			name = studentName;
			grade1 = g1;
			grade2 = g2;
			grade3 = g3;
		}
	
		int avrGrade() {
			return (grade1 + grade2 + grade3) / 3;
		}
	
		public static void main(String[] args) {
			
			Homework2002 s1 = new Homework2002("Harun", 80, 90, 67);
			Homework2002 s2 = new Homework2002("Emre", 50, 50, 76);
			Homework2002 s3 = new Homework2002("Gurkan", 14, 82, 37);
			Homework2002 s4 = new Homework2002("Burak", 67, 90, 66);
			Homework2002 s5 = new Homework2002("Cenk", 78, 30, 41);
			
			System.out.println(s1.name + " has the grade " + s1.avrGrade());
			System.out.println(s2.name + " has the grade " + s2.avrGrade());
			System.out.println(s3.name + " has the grade " + s3.avrGrade());
			System.out.println(s4.name + " has the grade " + s4.avrGrade());
			System.out.println(s5.name + " has the grade " + s5.avrGrade());
			
		}
}
