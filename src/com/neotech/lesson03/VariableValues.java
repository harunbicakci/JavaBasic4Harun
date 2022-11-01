package com.neotech.lesson03;

public class VariableValues {

	public static void main(String[] args) {
				/*
				 * 2. Create a Java program and name it VariableValues 
				 * In your program create variables to store all different 
				 * types of primitive data. 
				 * Print the value of each variable. 
				 * Update value of each variable. 
				 * Print the value of each variable after updating.
				 */
				
				//FORMULA: 
		// data type      name(identifier)  assignment operator (=)  value ;
				
				byte 		a 	= 		5;
				short 		b 	= 		130;
				int 		c 	= 		2500;
				long		d 	=		1214149283l;
				float		e	=		2.513824f;
				double		f 	=		5.3557367345675;
				char		g 	=		'g';
				boolean		h	= 		true;
				
				
				//printing values
				/*
				 * System.out.println(a); System.out.println(b); System.out.println(c);
				 * System.out.println(d); System.out.println(e); System.out.println(f);
				 * System.out.println(g); System.out.println(h);
				 */
				//line by line comment -> CTRL + /
				//group comment -> CTRL + SHIFT + /
				
				
				//reassigning variable values
				
				a = 15;
				b = 170;
				c = 450000;
				d = 350l;
				e = 3.6454f;
				f = 4.5;
				g = '~';
				h = false;
				
				
				
				//after dardan works for years
				d = 5500000000000000l;
				
				
				//printing values again
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
				System.out.println(g);
				System.out.println(h);
				
			
	}
}
