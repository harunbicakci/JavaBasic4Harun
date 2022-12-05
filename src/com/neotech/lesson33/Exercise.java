package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exercise {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/test_data/Homework.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook b = new XSSFWorkbook(fis);
		Sheet s = b.getSheet("Companies");
		
		int rows = s.getPhysicalNumberOfRows();
		int cols = s.getRow(4).getLastCellNum();
		
		List<String> list = new LinkedList<>();
		
		for ( int col = 0; col < cols; col++) {
			String cell = s.getRow(3).getCell(col).toString();
			list.add(cell);
		}
		System.out.println(list);
		
		List<String> names = new ArrayList<>();
		
		for ( int row = 1; row < rows; row++) {
			String name = s.getRow(row).getCell(1).toString();
			names.add(name);
		}
		System.out.println(names);
		
		
	}

}
