package com.neotech.lesson26;

public  class Car {

//	Create a Class Car that would have the following fields:
//	carPrice and color and method calculateSalePrice() which
//	should be returning the price of the car.
//	Create 2 sub classes: Sedan and Truck. 
	
//	The Truck class	has a field as weight and has its own implementation of
//	calculateSalePrice() method in which returns the price
//	calculated as following: 
//	if weight>2000 then returned price
//	car should include 10% discount, otherwise 20% discount.
//	
//	The Sedan class has field as length and also has its own
//	implementation of calculateSalePrice(): 
//	if length of sedan is >20 feet then returned car price should include 5%
//	discount, otherwise 10% discount

	int carPrice;
	String color;
	
	public int calculateSalePrice() {
		return carPrice;
	}
}

class Truck extends Car{
	int weight; 
	
//	Truck(int weight){
//		this.weight = weight;
//	}
	
	public int calculateSalePrice(int carPrice, int weight) {
			if ( weight > 2000 ) {
				carPrice *= 0.9;
			} else {
				carPrice *= 0.8;
			}
			return carPrice;
		}
	
	}


class Sedan extends Car{
	int length; 

	Sedan(int carPrice, int length){
		this.length = length;
	}
	
public int calculateSalePrice() {
	
		if ( length > 20 ) {
			carPrice *= 0.95;
		} else {
			carPrice *= 0.9;
		}
		return carPrice;
	}
}
