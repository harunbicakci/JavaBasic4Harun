package com.neotech.lesson21;

public class School2 {

	public static void main(String[] args) {
		
		MathTeacher t1 = new MathTeacher();
		t1.name = "Curry";
		t1.education = "Math";
		t1.salary = 60000;
		
		t1.teach();
		t1.caltulate();
		
		ChemistryTeacher t2 = new ChemistryTeacher();
		t2.name = "Adil";
		t2.education = "Chemistry";
		t2.salary = 62000;
		
		t2.yell();
		t2.experiment();
		
		PianoTeacher t3 = new PianoTeacher();
		t3.name = "Emre";
		t3.education ="Music";
		t3.salary = 58000;
		
		t3.yell();
		t3.piano();
	}
}
