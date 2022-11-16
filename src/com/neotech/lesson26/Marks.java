package com.neotech.lesson26;

public abstract class Marks {

//	We have to calculate the average of marks obtained in
//	three subjects by student A and by student B. 
//	Create a class 'Marks' with an abstract method 'getAverage' that will
//	be returning the average of marks. 
//	Provide implementation of the abstract method in classes 'StudentA' and 'StudentB'.
//	The constructor of StudentA takes the marks of three subjects as parameters and the constructor of StudentB
//	takes marks of four subjects as parameters. Test your code.
	
	public abstract void getAverage();
}

class StudentA extends Marks{
	int a, b, c;
	StudentA(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public void getAverage() {
		System.out.println("The average of Student A is --> " + ((a+b+c)/3));
	}
}

class StudentB extends Marks{
	int a, b, c, d;
	StudentB(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	@Override
	public void getAverage() {
		System.out.println("The average of Student B is --> " + ((a+b+c+d)/4));
	}
}
