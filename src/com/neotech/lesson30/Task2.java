package com.neotech.lesson30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {

//	Create a map of car models that you have in your garage and for each model the number of car you have.
//	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
//	For example:
//	"BMW" -> 2
//	"Mercedes" -> 3
//	"Audi" -> 3
//	"Ferrari" -> 1
//
//	- Check how many entries you have.
//	- Update the number of Audis to 5.
//	- Add a new model with any number of cars.
//	- Check how many Ferraris you have.
//	- Check if you have Honda in your map.
//	- Remove Mercedes from the map.
//	- Get all models from the map. (use keySet() method)
//
//	Note: After each step print the map.
	
	public static void main(String[] args) {
	
		Map<String, Integer> models = new LinkedHashMap<>();
		
		models.put("BMW", 2);
		models.put("Mercedes", 3);
		models.put("Audi", 3);
		models.put("Ferrari", 1);
		models.put("Porsche", 3);
		models.put("Range Rover", 2);
		models.put("Maserati", 4);
		models.put("Bentley", 2);
		
		System.out.println(models);
		System.out.println("The size of Car Models Map is --> " + models.size());
		
		models.put("Audi", 5);
		models.put("Mini", 3);

		Integer howManyFerrari = models.get("Ferrari");
		System.out.println("Check how many Ferrari's you have --> You have " + howManyFerrari + " Ferrari's");
		
		boolean hasHonda = models.containsKey("Ferrari");
		System.out.println("Check how many Ferrari's you have --> " + hasHonda + ", You have Honda in your map");
		
		models.remove("Mercedes");
		System.out.println("After Mercedes has been removed --> " + models);
		
		Set<String> keys = models.keySet();
 		System.out.println("All models on the map 		--> " + keys);
		
		
	}

}
