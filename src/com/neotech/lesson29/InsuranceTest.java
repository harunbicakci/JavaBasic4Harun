package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {

		
		ArrayList<Insurance> ins = new ArrayList<>();
		
		
		ins.add(new CarInsurance("Geico", "E350"));
		ins.add(new PetInsurance("Progressive", "Dog"));
		ins.add(new HealthInsurance("Metlife"));
		
		
		//using iterator
		Iterator<Insurance> it = ins.iterator();
		
		
		while(it.hasNext())
		{
			Insurance insurance = it.next();
			
			insurance.getQoute();
			insurance.cancelInsurance();
			
			//please be careful - avoid multiple calls to .next() method
			//wrong: 
			//it.next().getQoute();
			//it.next().cancelInsurance();
			//these two call, are not made by the same object
		}

		
	}

}