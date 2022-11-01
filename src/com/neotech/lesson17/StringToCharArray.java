package com.neotech.lesson17;

public class StringToCharArray {
	public static void main(String[] args) {
		
	//toCharArray()
		
		String sentence = "Today is Tuesday and we are learning Java!";
		
		char[] charArray = sentence.toCharArray();
		
		for(char c: charArray)
		{
			System.out.print(c+"|");
		}
		System.out.println();
		System.out.println("The length of the sentence is " + sentence.length());
		System.out.println("The length of the char array is " + charArray.length);
	
		for (int i = charArray.length-1; i >= 0; i--)
		{
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//homework:
	//	yadoT si yadseuT dna ew era gninrael !avaJ
		
		
	}
}
