package com.neotech.lesson07;

public class RecapAfterClass07 {
	public static void main(String[] args) {
		
//		--------------------------------
//		Class 7
//		--------------------------------
//		RECAP:
//
//		1. 
//		Scanner Class - takes input from a user
//
//		int num=10;
//		Scanner varible =new Scanner(System.in);
//
//		String text=variable.nextLine();
//		String text1=variable.next();
//
//		int num1=variable.nextInt();
//		boolean bool=variable.nextBoolean();
//		char c=varibale.next().charAt(0);
//
//		if (true){
//		    if block code
//		}else {
//		    else block
//		}
//		--------------------------------
//		Logical operators in Java
//
//		AND , OR, NOT
//
//		AND (&&)
//		if (true && true) --> true
//		if (true && false) --> false
//		if (false && true) --> false
//		if (false && false) --> false
//
//		OR (||)
//
//		if (true || true) --> true
//		if (true || false )--> true
//		if (false || true) --> true
//		if (false || false )--> false
//
//		NOT - reverse the condition
//		1. 
//		boolean b=!true;
//		System.out.println(b);--> false
//
//		2. 		
//		boolean isCold=false;
//
//		if(!isCold) {
//		    System.out.println("hello");->output
//		} else {
//		    System.out.println("bye");
//		}
//
//		3. 
//		first !operation will get executed 
//		and only then && will be performed
//
//		if(!day1.equals("Monday") && !day1.equals("Friday")) {
//		    System.out.println("Find me at Syntax");
//		}
//
//		// day is not monday and my day is not friday
//
//		first we perform && operation --> because it is inside () and then result of the operation 
//		we are reversing using !
//
//		if(!(day1.equals("Monday") || day1.equals("Friday"))) {
//		    System.out.println("Find me at Syntax");
//		}
//
//		--------------------------------
//
//		Logical Operators
//		Why?
//		To test 2 or more conditions
//		AND && --> both conditions must be true
//		OR || --> at least 1 condition must be true
//		NOT ! --> reverse the condition
//
//		--------------------------------
//
//		switch case is another conditional statement
//		It also test multiple conditions (values) similar to else if.
//
//		Benefits switch vs else if:
//		 1. Using switch we can make code cleaner and more readable
//		 2. Performance of switch case is faster comapre to else if
//		    else if is a condition based (each condtion must by evaluated and return trur or false)
//		    switch is a value based
//
//		Limitations:
//		    1. no relational (>, >=, <, <=) or logical operators(&&, ||, !) can be used
//		    2. switch case works only with byte, short, char, int and String
//		    3. In switch we cannot have duplicate cases
//		    4. in swich case we must use break
//
//		--------------------------------
//
//		Switch is used for byte, short, int, Chars, String
//		Switch vs if else vs if --- Else if --- else
//
//		Switch is usually faster, it does not check all the cases
//
//		Structure:
//		switch (var)
//		{
//		case 1:
//		    ...code...
//		    break;
//		case 2: 
//		    ...code...
//		    break;
//		    .
//		    .
//		    .
//		default:
//		    ...code...
//		    break;
//
//		}
//
//		**** Be careful using a nextLine() after any other next(), nextInt....
//		
		
	}
}
