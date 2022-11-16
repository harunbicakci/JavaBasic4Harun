package com.neotech.lesson26;

public class WebDriverTest {

	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.openBrowser();
		chrome.maximizeWindow();
		chrome.findElement();
		chrome.takePicture();
		chrome.closeBrowser();
		
		System.out.println("---------------------");
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.openBrowser();
		firefox.maximizeWindow();
		firefox.findElement();
		firefox.takePicture();
		firefox.closeBrowser();
		
		System.out.println("---------------------");
		
		WebDriver wb = new ChromeDriver();
//		wb.takePicture(); cant do it because its a WebDriver, it can only reach to methods it has
		wb.closeBrowser();
		
		
		
	}
}
