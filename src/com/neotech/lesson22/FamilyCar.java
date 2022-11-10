package com.neotech.lesson22;

public class FamilyCar extends Car{

	int doors;
	
	FamilyCar()
	{
		System.out.println("FamilyCars Default Constructor");
	}
	
	FamilyCar(String make, String model, int doors)
	{
		super(make, model);
		this.doors = doors;
	}
	
	void driving()
	{
		System.out.println("Family cars drive safer!");
	}
	
	void traveling()
	{
		System.out.println("Family cars are good for traveling!");
	}
	

}
