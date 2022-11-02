package com.neotech.lesson20;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.sum(10, 20); 
		System.out.println(obj.a + " " + obj.b);
		
							//signature: (int, int)
		ThisKeyword obj2 = new ThisKeyword(20, 40);
		obj2.sum(100, 200);
		
		
	}
}
