package com.neotech.lesson34;

public class InfoAboutExceptions {

	public static void main(String[] args) {

		String str = "hello";
				
		//how do we handle? Using try and catch
		
		
		try 
		{
			
			char c = str.charAt(8);
			System.out.println(c); //StringIndexOutOfBoundsException	
			
			
			int a = 10;
			int b = 0;
			
			System.out.println(a/b);
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			//here we can display info about the error
			//e.printStackTrace();
//			System.out.println(e);
		//	System.out.println(e.getMessage());
			System.out.println("Do not try to access the wrong index!!!");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("End of code");	
		
	}
}
