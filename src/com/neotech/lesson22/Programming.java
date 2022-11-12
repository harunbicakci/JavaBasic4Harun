package com.neotech.lesson22;

public class Programming {
//	Homework 1:
//	    Create a class named 'Programming'. While creating an
//	    object of the class, if nothing is passed to it, then the
//	    message "I love programming languages" should be
//	    printed. If some String is passed to it, then in place of
//	    "programming languages" the value variable should be
//	    printed. Example, if we pass "Java", then "I love Java"
//	    should be printed.

	Programming(){
		System.out.println("I love programming languages.");
	}

	Programming(String some){
		System.out.println("I love " + some);
	}

	public static void main(String[] args) {
		
		Programming p1 = new Programming();
		Programming p2 = new Programming("Java!!!");
	}
}
