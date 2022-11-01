package com.neotech.lesson13;

public class RetrievingValuesFrom2dArray {
	public static void main(String[] args) {
		
		String[][] months = {
				{"December" , "January", "February"}, // row 0
				{"March", "April", "May"}, // row 1
				{"June", "July","August"}, // row 2
				{"September", "October", "November"} // row 3
		};
		
		int rows = months.length;
		System.out.println("There are a total of " + rows + " rows");
		
		int cols = months[1].length;
		System.out.println("Row index 1 has " + cols + " columns");
		
		for ( int row = 0; row < rows; row++) {
			
			// what is month[0] ? --> {"December" , "January", "February"}
			
			for (int col = 0; col < cols; col++) {
				System.out.print(months[row][col] + " ");
			}
			System.out.println();
		}
	}
}
