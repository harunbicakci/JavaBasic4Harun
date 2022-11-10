package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {

				// 1st constructor is used
				Student st1 = new Student();
				st1.displayInfo();

				st1.name = "Sedat";
				st1.address = "123 Main St";
				st1.displayInfo();

				System.out.println("---------------------");
				// 2nd constructor is used
				Student st2 = new Student("Kenan", "456 Brown St");
				st2.displayInfo();

				System.out.println("---------------------");
				// 3rd constructor is used
				Student st3 = new Student("Elmira");
				st3.displayInfo();
	
	}	
}
