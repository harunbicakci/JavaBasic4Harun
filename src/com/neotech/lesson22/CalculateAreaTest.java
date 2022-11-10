package com.neotech.lesson22;

public class CalculateAreaTest {
	public static void main(String[] args) {

		CalculateArea.area(5);
		CalculateArea.area(6, 7);
		CalculateArea.area(5, 6, 7);
		
		
		//if these were instance methods
		CalculateArea ca = new CalculateArea();
		ca.area(5.5, 7.2);
		
		

	}
}
