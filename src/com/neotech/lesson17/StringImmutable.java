package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {

			String str = "Hello";
			str.concat(" World!");
			System.out.println(str);
					
			str.toUpperCase();
			System.out.println(str);
					
			//reassigning but not changing
					
			//str ---> was pointing to some string "Hello"
			//  str = str + "ALL"; ---> now str is pointing to this new string
			str = str.concat(" World!");
			System.out.println(str);
					
			//here we did not change 10, a was pointing in one location, not it is pointing
			//in another
			//	int a = 10;
			//	a = 15;
					
			String str2 = "Hello"; // actually pointing to the one created earlier
	}
}
