package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook b = new XSSFWorkbook(filePath);

		Sheet s = b.getSheet("TestData");
		
		// get number of rows
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("Number of rows --> " + rows);
		
		// get number of columns/cells in a certain row
		int cols = s.getRow(0).getLastCellNum();
		System.out.println("Columns in rows--> " + cols);
		
		System.out.println("---------------------------");
		
		// perfect situation for a nested loop
		// first loop: looping through rows
		for (int r = 0; r < rows; r++) {
			
			// inner loop: loopig through columns
			for (int c = 0; c < cols; c++) { // c < s.getRow(r).getLastCellNum();
				
				String cellValue = s.getRow(r).getCell(c).toString();
				System.out.print(cellValue + " ");
			}
			System.out.println();
		}
		
		b.close(); // this releases memory used from the workbook object
		fis.close(); // releasing memory
		
		
		
	}

}
