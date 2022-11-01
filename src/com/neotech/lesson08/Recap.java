package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		
		//declaring three doubles
		double a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		//using nested if
		
		
		//logic: 
		//if a > b
			// if a > c 
				// a is the largest
			// else it means c is larger than a ---> c is the largest
		//else -- meaning a < b
			// if b > c
				// b is the largest
			// else--> meaning c > b
			//----> c is the largest
		
		
		if (a > b)
		{
			if (a > c)
			{
				System.out.println(a + " is the largest number!");
			}
			else //a < c    and because a > b ---> c > a > b
			{
				System.out.println(c  + " is the largest number!");
			}
		}
		else  // a < b 
		{
			if (b > c) //b > a and b > c
			{
				System.out.println(b + " is the largest number!");
			}
			else //b < c  ---> c > b > a
			{
				System.out.println(c + " is the largest number!");
			}
		}		
		
	System.out.println("===== using comparison operators  ========");
		
		
		if (a > b && a > c)  // a is the largest
		{
			System.out.println(a + " is the largest number!");
		}
		else if (b > a && b > c) // b is the largest
		{
			System.out.println(b + " is the largest number!");
		}
		else //c is the largest
		{ 
			System.out.println(c + " is the largest number!");
		}
		
		
	}

}
