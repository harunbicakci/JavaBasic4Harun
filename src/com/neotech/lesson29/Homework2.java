package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
		 * number that is divisible by 5 from that arrayList.
		 */

		ArrayList<Integer> numbers = new ArrayList<>();

		// this moves only by 2 increment, so only on even numbers
		// if we increment by 1
		// then we have to use an if condition
		// if (i%2 ==0), then we add the number
		for (int i = 0; i <= 50; i = i + 2) {
			numbers.add(i);
		}

		// how do we create an iterator??
		// ClassName<> identifier = [collection].iterator();
		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext())// checks if there is an Integer object next
		{
			Integer num = it.next(); // iterator points now to the next element and also keeps
			// track of the last returned element

			if (num % 5 == 0) {
				it.remove();// it will remove the object it returned last time
			}

		}

		System.out.println(numbers);

	}

}