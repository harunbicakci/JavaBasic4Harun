package com.neotech.lesson26;

public class CarTest {

	public static void main(String[] args) {
			
		Car c1 = new Truck();
		c1.carPrice = 55000;
		c1.color = "Blue";
	
		Car c2 = new Sedan(24000, 24);
		c2.carPrice = 25000;
		c2.color = "Black";
	
		c1.calculateSalePrice();
		c2.calculateSalePrice();
		
//		Car[] arr = new Car[2];
//		
//		for (Car element : arr) {
//			element.calculateSalePrice();
//		}
//		
		
		
		
	}
}
