package com.neotech.lesson25;

//Homework 1:
//Create a WebDriver Interface that will have the following unimplemented behaviour: 
// openBrowser(), 
// closeBrowser(), 
// maximizeWindow(), 
// findElement(). 
//
//Create another interface named Camera that will have the method:
// takePicture();
//Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}

interface Camera{
	void takePicture();
}

class ChromeDriver implements WebDriver, Camera{
		
	@Override
	public void openBrowser() {
		System.out.println("First the Chrome browser opened by clicking its icon on desktop.");		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome window size is maximized by clicking the little square button on right top.");	
	}

	@Override
	public void findElement() {
		System.out.println("You can find whatever you are looking for just by typing on Chrome search bar.");		
	}
	
	@Override
	public void takePicture() {
		System.out.println("The screenshots have been taken by using Chrome screenshot.");
	}
	
	@Override
	public void closeBrowser() {
		System.out.println("Chrome web browser is closed now.");	
	}
}
class FirefoxDriver implements WebDriver, Camera {

	@Override
	public void openBrowser() {
		System.out.println("Open the Firefox driver on desktop.");
	}
	
	@Override
	public void maximizeWindow() {
		System.out.println("Firefox window is maximized.");
	}

	@Override
	public void findElement() {
		System.out.println("The elements has been entered on Firefox browser.");	
	}

	@Override
	public void takePicture() {
		System.out.println("You can see the screenshots of elements by clicking \"here\" on Firefox browser.");
	}
	
	@Override
	public void closeBrowser() {
		System.out.println("Firefox browser is closed in 3, 2, 1 ...");
	}
}