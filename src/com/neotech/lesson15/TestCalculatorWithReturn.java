package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {
CalculatorWithReturn obj = new CalculatorWithReturn();
		
		int res = obj.add(6, 4);
		System.out.println(res);
		
		int res2 = obj.add(5, 3);
		System.out.println(res2);
		
		int res3 = obj.multiply(5, 4);
		System.out.println(res3);
		
		//we are printing the result directly
		System.out.println(obj.multiply(6, 15));
		
		
		double res4 = obj.divide(5.5, 2.2);
		System.out.println(res4);
		
		int num = obj.giveBackSomething();
		obj.dontGiveBackAnything();
		
		double average = obj.average(res, res2, res3);
		System.out.println(average);
	}
}
