package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") +"/test_data/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		Sheet s = b.getSheet("TestData");
		
		int rows = s.getPhysicalNumberOfRows();
		int cols = s.getRow(0).getLastCellNum();
		System.out.println("Number of columns: " + cols);
		
		Map<String, String> map = new LinkedHashMap<>();
		
		for ( int col = 0; col < cols-1; col++) {
			String key = s .getRow(0).getCell(col).toString();
			String value = s.getRow(1).getCell(col).toString();
			
			map.put(key, value);
		}
		
		System.out.println(map);

	}

}
