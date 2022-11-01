package com.neotech.lesson02;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		
		// there are 8 primitive data types
		// byte < short < int < long < float < double
	
		byte hakan = 9; // the range is -128 +127, total of 256 different value.
		
		// compiler will give an error
		// byte baris = -160;
		
		short hakan2 = 145; // the range is from -32768 to + 32767
		
		// compiler will give an error
		// short var4 = 35.6; 
		
		int viktor = 24234353; // the range -2 billion to +2 billion.
		int esat = 3; // yes, I can also store small numbers in int.
		
		// if the number is larger than 2 billion we have to use long.
		// if the number is larger than 2 billion we have to use L or l at end.
		long elionBankBalance = -1928319827914L;  
		
		System.out.println(elionBankBalance);
		
		// to store decimel numbers we use float or double.
		// you must use F or f at the end.
		float rahime = 23.456F; 
		
		double rahime2 = 23.324345; // you dont need F or f at the end.
		
		char var3 = 'P'; // char will store only one character.
		char var4 = '%'; // even any sign.
		char var5 = 'p'; // 
		char var6 = ' '; // it can also store the space character.
		char var7 = '8';

		boolean ali = true; // to store boolean values eigher true or false.
		
		
	}
}
