package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		// where is my .properties file located?

		// 1. locate your .properties file
		String filePath = "/Users/harunbicakci/eclipse-workspace/JavaBasic4Harun/src/example1.properties";

		// 2. create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3. to handle .properties file; we need to use a Properties java class
		Properties prop = new Properties();

		// load the file: if you don't load the file and try to write on it,
		// everything on the file will be lost
		prop.load(fis);

		prop.setProperty("phoneNumber", "12345678");
		prop.setProperty("city", "Manhatton");

		// to write to the file, we need a connection using FileOutputStream
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "We updated the phone number");
	}


}
