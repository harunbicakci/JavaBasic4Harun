package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceDemo {

	public static void main(String[] args) {

//		Create 3 objects of the sub classes	and store them in ArrayList. 
//		Using for loop/advanced for loop/ iterator access all methods of the class.
		
		ArrayList<Insurance> list = new ArrayList<>();
		
		list.add(new Car("Ford"));
		list.add(new Pet("Dog"));
		list.add(new Health());
		
		System.out.println("----------Using For Loop---------");
		
		for ( int i = 0; i < list.size(); i++) {
			list.get(i).getQuote();
			list.get(i).cancelInsurance();
		}
		
		System.out.println("----------Using For Each Loop---------");
		
		for ( Insurance single : list) {
			single.getQuote();
			single.cancelInsurance();
		}
		
		System.out.println("----------Using Iterator---------");
		Iterator<Insurance> it = list.iterator();
		
		while(it.hasNext()) {
			Insurance obj = it.next();
			obj.getQuote();
			obj.cancelInsurance();
		}
		
	}

}
