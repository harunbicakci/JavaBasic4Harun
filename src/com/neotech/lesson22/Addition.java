package com.neotech.lesson22;

public class Addition {
	//method signature: 
		//return type    method name  (int, int, int)
		
	
		//(int, int)
		void add(int a, int b)
		{
			System.out.println(a + b);
		}
		
		//method overloading by changing the number of parameters
		//(int, int, int)
		void add(int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
		
		//method overloading by changing the type of the parameters
		void add(double a, double b)
		{
			System.out.println(a + b);
		}
		
		void add(int a, int b, double c)
		{
			System.out.println(a + b + c);
		}
		
		//we are changing both of them at the same time (number and type)
		void add(int a, double b, int c, double d)
		{
			System.out.println(a+b+c+d);
		}
		
		
		void add(String s, int i)
		{
			System.out.println("we cannot add them!");
		}
		
		//method overloading by changing the order of the parameters
		void add(int i, String s)
		{
			System.out.println("we cannot add them!");
		}
		
		
		void add(int a, double b)
		{
			System.out.println(a+b);
		}
		
		
		int add(int a, int b, int c, int d)
		{
			return a+b+c+d;
		}
		
		int add(int a, int b, int c, int d, int e)
		{
			return a+b+c+d+e;
		}
		
}
