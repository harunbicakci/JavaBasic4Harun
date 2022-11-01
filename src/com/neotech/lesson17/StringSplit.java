package com.neotech.lesson17;

public class StringSplit {
	public static void main(String[] args) {
		
		//split()
				String sentence = "Today is Tuesday and we are learning Java!";
				String[] result = sentence.split(" ");
				//print out the result
				for (String word : result)
				{
					System.out.print(word + "|");
				}
				System.out.println();
				System.out.println("This sentence has " + result.length + " words!");
				
				String[] array = sentence.split("e");
				for (int i = 0; i < array.length; i++)
				{
					System.out.print(array[i] + "    ");
				}
				System.out.println();
				
				
				String list = "1.Hakan2.Burak3.Kenan4.Deyo";
				String[] arr = list.split("[^a-zA-Z]");
				
				for (int i = 0; i < arr.length;i++)
				{
					System.out.print(arr[i] + "-");
				}
		
		
	}
}
