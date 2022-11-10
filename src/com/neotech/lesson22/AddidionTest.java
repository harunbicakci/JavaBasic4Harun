package com.neotech.lesson22;

public class AddidionTest {

	public static void main(String[] args) {

		Addition obj = new Addition();
		obj.add(5, 6);
		obj.add(10, 15, 6);

		obj.add(2.5, 3.5);
		obj.add(5, 6, 4.5);
		
		obj.add(4, 5.5);
		
		obj.add(5, 4, 3, 6.2);
		
		int result  = obj.add(4, 5, 6, 7);
		System.out.println(result);
	}

}
