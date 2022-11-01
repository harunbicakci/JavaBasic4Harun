package com.neotech.lesson10;

import java.util.Scanner;

public class deneme {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String shoppingListReport = "";
		    String item = "";
		    String countinue = "";
		    double price = 0;
		    int count = 1;
		    double totalPrice = 0;


		    do {
	      
	      System.out.println("Enter Item" + count + " and its price:");
	      item = scan.next();
	      price = scan.nextDouble();
	      totalPrice += price;
	      shoppingListReport += "Item" + count + ": " + item + 
	    		  " Price: " + price;
	      count++;
	      if (count <= 20) {
	        System.out.println("Add one more item?");
	        countinue = scan.next();}
	      		if (!countinue.equalsIgnoreCase("yes")) {
            break;
	      		} else {
            shoppingListReport += ", ";
          }
	        } 
	    while (countinue.equalsIgnoreCase("yes"));

	  
	    System.out.println(shoppingListReport);
	    System.out.println("Total price: " + totalPrice);
	    
}
}
