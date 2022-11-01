package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {
	public static void main(String[] args) {
		
		// ++ increment
		// -- decrement
		
		int x; 
		
		int y =	10;
		
		// POST Increment
		// 1. performing x = y
		// 2. increment  (y = y + 1)
		x = y++;
		
		System.out.println(x);
		System.out.println(y);
		
		// PRE Increment
		int a; 
		int b = 15;
		
		// 1. Increment --> b = b + 1
		// 2. Assign value --> a = b
		a = ++b;
		
		System.out.println(a);
		System.out.println(b);
		
		// Decrement
		int c; 
		int d = 14;
		
		// PRE Decrement
		// 1. decrement the value of d 
		// 2. then assign that value to c
		c = --d;
		// this means
		// d -= 1
		// c = d
		System.out.println(c);
		System.out.println(d);
		
		int e;
		int f = 14;
		
		// POST Decrement
		// 1. e = f
		// 2. f = f - 1
		 e = f--;
		
		 System.out.println(e);
		 System.out.println(f);
		 
		 
		 
	}
}
