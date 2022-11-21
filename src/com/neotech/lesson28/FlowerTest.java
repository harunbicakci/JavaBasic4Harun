package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

	//Store elements in an array
	Flower[] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
	
	//if we try, we cannot add anymore
//	flowerArray[3] = new Rose("Rose");
	
	//1st difference -> array is fixed in size
		
	ArrayList<Flower> flowerList = new ArrayList<>();
	flowerList.add(new Rose("Rose"));
	flowerList.add(new Tulip("Tulip"));
	flowerList.add(new Sunflower("Sunflower"));
	
	//using enhanced for loop
	for (Flower fl : flowerList)
	{
		fl.bloom();
	}
	
	System.out.println("----------------");
		
	for(int i = 0; i < flowerList.size(); i++)
	{
	//	Flower fl = flowerList.get(i);
	//	fl.bloom();
		
		//one liner
		flowerList.get(i).bloom();
	}
	
	
	System.out.println("------------------");
	
	
	Iterator<Flower> it = flowerList.iterator();
	
	while(it.hasNext())
	{
		Flower fl = it.next(); //first iteration: Flower fl = new Rose("Rose");
		fl.bloom();
		
		//one liner
//		it.next().bloom();
		
		}
	}
}
