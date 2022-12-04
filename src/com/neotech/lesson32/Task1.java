package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) throws IOException {
//
//		Create a PROPERTY file to store following configurations:
//		browser=
//		url=
//		username=
//		password=

		// 1
		String filePath = "/Users/harunbicakci/eclipse-workspace/JavaBasic4Harun/src/com/neotech/lesson32/homework.properties";
		// 2
		FileInputStream fis = new FileInputStream(filePath);
		// 3
		Properties prop = new Properties();
		// 4
		prop.load(fis);
		
		System.out.println("-------READING FROM FILE---------");
		
		prop.setProperty("browser", "Chrome");
		prop.setProperty("url", "facebook.com");
		prop.setProperty("username", "harunbicakci");
		prop.setProperty("password", "tester123");
		
		Set<Entry<Object, Object>> set = prop.entrySet();
		
		System.out.println("----------For Each Loop---------");
		for (Entry<Object, Object> el : set) {
			System.out.println(el.getKey() + " = " + el.getValue());
		}
		
		System.out.println("-----------Iterator--------------");
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("-------WRITING TO FILE---------");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "Property updated!");
		
		String username = prop.getProperty("username");
		System.out.println(username);
		String password = prop.getProperty("password");
		System.out.println(password);
		String url = prop.getProperty("url");
		System.out.println(url);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
	}

}
