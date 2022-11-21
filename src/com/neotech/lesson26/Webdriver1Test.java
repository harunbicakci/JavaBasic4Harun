package com.neotech.lesson26;

public class Webdriver1Test {

	public static void main(String[] args) {

		RemoteWebDriver1 d1 = new ChromeDriver1();
		RemoteWebDriver1 d2 = new FirefoxDriver1();
		RemoteWebDriver1 d3 = new SafariDriver1();

		
		RemoteWebDriver1 [] arr = { d1, d2, d3, new ChromeDriver1(), new SafariDriver1() };
		
		for ( RemoteWebDriver1 element : arr) {
			element.open();
			element.close();
			element.getTitle();
			element.getScreenshot();
			element.navigate();
			System.out.println("------------------------");
		}

	}

}
