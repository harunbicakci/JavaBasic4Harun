package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Rick");
		aList.add("Tim");
		aList.add("Jasmine");
		aList.add("Rick");
		aList.add("Tim");
		
		System.out.println(aList);
		
		Set<String> hs = new HashSet<>(aList);
		System.out.println(hs);
 		
		Set<String> lhs = new LinkedHashSet<>(aList);
		System.out.println(lhs);
		
	}
}
