package com.neotech.lesson25;

public class WebdriverTest {

	public static void main(String[] args) {
		
		WebDriver chrome1 = new ChromeDriver();
		Camera chrome2 = new ChromeDriver();
		chrome1.openBrowser();
		chrome1.maximizeWindow();
		chrome1.findElement();
		chrome2.takePicture();
		chrome1.closeBrowser();
		
		System.out.println("--------------------------");
		
		WebDriver ff1 = new FirefoxDriver();
		Camera ff2 = new FirefoxDriver();
		ff1.openBrowser();
		ff1.maximizeWindow();
		ff1.findElement();
		ff2.takePicture();
		ff1.closeBrowser();
	}

}
