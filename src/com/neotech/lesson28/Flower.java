package com.neotech.lesson28;

public abstract class Flower {

	String type;
	
	public Flower(String type)
	{
		this.type = type;
	}
	
	public abstract void bloom();
	
}

class Tulip extends Flower
{
	public Tulip(String type)
	{
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " bloom in April!");		
	}
	
}

class Rose extends Flower
{

	public Rose(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " bloom in June!");
	}
	
}

class Sunflower extends Flower
{

	public Sunflower(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " bloom in August!");
	}
	
}
