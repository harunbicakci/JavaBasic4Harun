package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Read Homework.xlsx file
//Read Companies sheet
//
//1. Read the third row (row index 2) and create an ArrayList of String. 
//Then print the ArrayList.
//2. Read the fifth column (col index 4) and create an HashSet of Double. 
//Then print the HashSet.

public class Homework1 {

	public static void main(String[] args) throws IOException {
	
		String filePath = System.getProperty("user.dir") + "/test_data/Homework.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook b = new XSSFWorkbook(fis);
		Sheet s = b.getSheet("Companies");
		
		int rows = s.getPhysicalNumberOfRows();
		int cols = s.getRow(2).getLastCellNum();
		
		System.out.println("-------- ArrayList 3rd (index 2) Row -----------");
		List<String> list = new ArrayList<>();
		
		for ( int col = 0; col < cols; col++) {
			String value = s.getRow(2).getCell(col).toString();
			list.add(value);
		}
		System.out.println(list);
		
		System.out.println("-------- HashSet 4rd (index 3) Column -----------");
		Set<String> set = new HashSet<>();
		
		for ( int row = 1; row < rows; row++) {
			String value = s.getRow(row).getCell(4).toString();
			set.add(value);
		}
		System.out.println(set);
		
		System.out.println("-------- Map 1st (index 0) and 3rd (index 2) Row -----------");
		Map<String, String> map = new LinkedHashMap<>();
		
		for ( int col = 0; col < cols; col++) {
			String key = s.getRow(0).getCell(col).toString();
			String value = s.getRow(2).getCell(col).toString();
			
			map.put(key, value);
		}
		System.out.println(map);
		
		
	}

}
