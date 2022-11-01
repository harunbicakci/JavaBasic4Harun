package com.neotech.lesson04;

public class CompoundOperator {
	// Also know as (aka) shorthand operator
		public static void main(String[] args) {
			
			int num = 100; // store 100 into a container
			
			num = num + 100; // add 100 to the value inside the container
			System.out.println(num);
			
			num = num + 100;
			System.out.println(num); // 300
			
			// we can use compound/shorthand operator
			num += 60; // add 60 to the container
			System.out.println(num);

			// short way
			num -= 10;
			System.out.println(num); // 350
			
			// num = num / 7;
			num /= 7;
			System.out.println(num); // 50
			
			// num = num * 2;
			num *= 2;
			System.out.println(num); // 100
			
			// Modulus operator. 100 mod 9 = 1
			// num = num % 9;
			num %= 9; 
			System.out.println(num);
			// The remainder is 1
			// English = remainder
			// Spanish = resto
			// Albanian = mbetja
			// Turkish = kalan
			// Russian = ostatok
			// Polis = reszta
			// Farsi = bagimande
			// Azeri = Qaliq
			// How it is calculated? Ask you kids in middle school
		}
}
