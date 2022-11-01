package com.neotech.lesson14;

public class PhoneStore {
	
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		
		p1.model = "iPhone";
		p1.brand = "Silver";
		p1.memory = 512;
		p1.version = 13;
		
		p2.model = "Android";
		p2.brand = "Light Blue";
		p2.memory = 512;
		p2.version = 7;
		
		p3.model = "Nokia";
		p3.brand = "3210";
		p3.memory = 64;
		p3.version = 1;
		
		p1.makeCalls();
		p1.textMessage();
		p1.internetConnection();
		System.out.println();
		p2.makeCalls();
		p2.textMessage();
		p2.internetConnection();
		System.out.println();
		p3.makeCalls();
		p3.textMessage();
		p3.internetConnection();
		
	}
}
