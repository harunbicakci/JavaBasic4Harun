package com.neotech.lesson31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Homework3 {

//	Create a collection of integers in which you can keep duplicates. 
//	Write a logic to find sum of all integers

	public static void main(String[] args) {

		int sum = 0;

		Collection<Integer> nums = new ArrayList<>();

		nums.add(78);
		nums.add(69);
		nums.add(44);
		nums.add(54);
		nums.add(87);
		nums.add(65);

//	USING FOR EACH LOOP
//	for(Integer el : nums) {
//		sum += el;
//	}

//	USING ITERATOR
		Iterator<Integer> it = nums.iterator();

		while (it.hasNext()) {
			sum += it.next();
		}

		System.out.println("The sum of Numbers --> " + sum);
	}
}
