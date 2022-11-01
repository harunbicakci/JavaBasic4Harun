package com.neotech.lesson17;

public class Task2 {
	public static void main(String[] args) {
		
		// yadoT si yadseuT dna ew era gninrael !avaJ
		// print this other way around
		
		String sentence = "yadoT si yadseuT dna ew era gninrael !avaJ";
		
		String[] arr = sentence.split(" ");
		
		for ( int i = 0; i < arr.length; i++) {
			
			char[] c = arr[i].toCharArray();
			
			for ( int j = c.length-1; j >= 0; j--) {
				
				System.out.print(c[j]);
				
			}
			System.out.print(" ");
		}
		
		
		
	}
}
