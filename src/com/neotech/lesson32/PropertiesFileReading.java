package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// where is my .properties file located?

		// 1. locate your .properties file
		String filePath = "/Users/harunbicakci/eclipse-workspace/JavaBasic4Harun/src/example1.properties";

		// 2. create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3. to handle .properties file; we need to use a Properties java class
		Properties prop = new Properties();

		// 4. load everything in .properties file with load() method
		prop.load(fis);

		String name = prop.getProperty("name");
		System.out.println(name);

		// keys are case-sensitive
		String lastName = prop.getProperty("lastName");
		System.out.println(lastName);

		Set<Object> keys = prop.keySet();
		Collection<Object> values = prop.values();

		for (Object key : keys) {
			System.out.println(key);
		}

		for (Object value : values) {
			System.out.println(value);
		}
	}

}
