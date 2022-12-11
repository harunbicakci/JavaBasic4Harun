package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingExceptions {

	public static void main(String[] args)  {

		
		
		try {
			Thread.sleep(2000);
			
		}
		catch(InterruptedException ie)
		{
			System.out.println("Caught InterruptedException!!!");
		}

		System.out.println("Continue with other code!!!");
		
		
		
		String path = "";
		

		try {
			FileInputStream fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			System.out.println("Caught FileNotFoundException!!!");			
				}

		System.out.println("Let's do another try and catch block!");
		
		int a = 5;
		int b = 0; 
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught ArithmeticException!!!");
		}
		
		System.out.println("End of code!");
	}

}
