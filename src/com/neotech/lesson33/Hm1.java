package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Hm1 {

	public static void main(String[] args) throws IOException {
		/*
		 * Create a PROPERTY file to store following configurations: browser= url=
		 * username= password=
		 */
		
		
		
		//1. create a path to the file
		
		//we could use this
	//	String path = "C:/Users/sabah/eclipse-workspace/JavaBasic4/example.properties";
	//	System.out.println(path);
		
		//to avoid file location issues
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String fullPath = projectPath + "/configs/homework.txt";
		System.out.println(fullPath);
		
		
		//2. create an object to read data (FileInputStream)
		FileInputStream fis = new FileInputStream(fullPath);
		
		
		//3. load the data from the stream		
		Properties p = new Properties();
		p.load(fis);
		
		//what inside the object?
		System.out.println(p);
		
		//get parameters individually
		String browser = p.getProperty("browser");
		System.out.println(browser);
		
		String browser2 = p.getProperty("BROWSER");
		System.out.println(browser2);
		
		//how do I get all the values
		Set<Object> keys = p.keySet();
		
		for (Object o : keys) 
		{
			System.out.println(o + " ===> " + p.get(o));
		}
		
		System.out.println("----------Selenium Steps------------");
		System.out.println("I am opening the browser: " + p.getProperty("browser"));
		System.out.println("I navigate to this page:"  + p.getProperty("url"));
		System.out.println("I will enter the username: " + p.getProperty("username"));
		System.out.println("I will enter the password: " +p.getProperty("password"));
		
		//how do we write??
		//1. I created a new property
		p.setProperty("phonenumber", "8374753938");
		
		//2. we need an output stream to the file
		FileOutputStream fos = new FileOutputStream(projectPath + "/configs/homework2.txt");
		
		//3. Store the properties object into a file
		p.store(fos, "Added a new property");

	}
}
