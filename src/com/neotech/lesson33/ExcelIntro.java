package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		
		// where is the file I want to read
		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		// Read the workbook (the whole excel file)
		Workbook book = new XSSFWorkbook(filePath);
		
		// Access the sheet that you want
		Sheet sheet = book.getSheet("TestData");
		
		// Access a certain row
		Row row = sheet.getRow(0);
		
		// Access a certain cell
		Cell cell = row.getCell(1);
		
		// Getting the data from the cell
		String info = cell.toString();
		System.out.println(info); // LastName
		
		// How do I get NY?
		// I am on the TestData sheet
		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(3);
		String cellValue = cell3.toString();
		System.out.println(cellValue);
		
		// How do we get Garfield? (With method chaining?)
		String cellCity = sheet.getRow(1).getCell(2).toString();
		System.out.println(cellCity);
				
		// how to get numerical valies from the cell
		double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);
		
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);
		
		// can I get the same Zip code as a String
		String zipCode = sheet.getRow(1).getCell(4).toString();
		System.out.println(zipCode);
		
	}

}
