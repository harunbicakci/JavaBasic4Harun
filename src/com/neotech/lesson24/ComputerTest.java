package com.neotech.lesson24;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		Computer c2 = new Apple();
		Computer c3 = new Lenovo();
		Computer c4 = new HP();
		Computer c5 = new Dell();
		
		Computer[] computers = {c1, c2, c3, c4, c5};
		
		for ( Computer single : computers) {
			single.operator();
		}
		
	}
}
