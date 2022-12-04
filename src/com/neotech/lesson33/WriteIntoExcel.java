package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		Sheet s = b.getSheet("TestData");
		
		// We want to add a new header "Country"
		s.getRow(0).createCell(5).setCellValue("Country");
		
		// to add values below country, we just change the row number
		
		
		// we want to create a row
		s.createRow(3).createCell(0).setCellValue("Fatihcan");
		// to add a new cell on the row we just created
		s.getRow(3).createCell(1).setCellValue("Dogan");
		
		// we want to create a new sheet
		b.createSheet("Arin6");	
		
		
		// to wrote into a file, we need a fos
		FileOutputStream fos = new FileOutputStream(filePath);
		
		b.write(fos);
		
	}

}
