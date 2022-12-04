package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		// find the file path
		String filePath = "/Users/harunbicakci/eclipse-workspace/JavaBasic4Harun/src/example1.properties";
		System.out.println(filePath);
		
		// find the user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		// find the user name
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		// find os name
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		// lets create a dynamic path
		String dynamicFilePath = userDirectory + "/src/example1.properties";
		System.out.println(dynamicFilePath);
		
		FileInputStream fis = new FileInputStream(dynamicFilePath);
		
		// create a properties object
		Properties prop = new Properties();
		// load the data from file
		prop.load(fis);
		
		String name = prop.getProperty("name");
		System.out.println(name);

	}

}
