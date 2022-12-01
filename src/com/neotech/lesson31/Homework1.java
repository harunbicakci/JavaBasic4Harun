package com.neotech.lesson31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {


//	Create a Map that will store Employee name and salary. 
//	Write a logic to retrieve an employee who gets the highest salary. 
//	Output should be in the below format
//	- John Smith=$100000
	
	public static void main(String[] args) {
	
    Map<String, Integer> emp = new LinkedHashMap<>();
    
    emp.put("Scorpion", 119);
    emp.put("Raiden", 123);
    emp.put("Scorpion", 113);
    emp.put("Johnny Cage", 130);
    emp.put("Sub-Zero", 95);
    
    int max = 0;
    String maxName = "";
 
    Set<Entry<String,Integer>> empEntry = emp.entrySet();
    
//    for ( Entry<String, Integer> el : emp.entrySet()) {
//    	
//    	if( el.getValue() > max ) {
//    		max = el.getValue();
//    		maxName = el.getKey();
//    	}
//    }
    
    Iterator<Entry<String, Integer>> it = empEntry.iterator();
    
    while ( it.hasNext()) {
    	Entry<String, Integer> entry = it.next();
    	if (entry.getValue() > max ) {
    		max = entry.getValue();
    		maxName = entry.getKey();
    	}
    }
    
    
    System.out.println(maxName + "=$" + max);
	
	}
}
