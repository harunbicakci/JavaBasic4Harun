package com.neotech.lesson26;

public interface WebDriver {
	
	/*
	 * Create a WebDriver Interface that will have the following unimplemented
	 * behaviour: 
	 * openBrowser(), 
	 * closeBrowser(), 
	 * maximizeWindow(), 
	 * findElement().
	 * 
	 * Create another interface named Camera that will have the method:
	 * takePicture(); 
	 * Create 2 classes that implements WebDriver and Camera
	 * interfaces: ChromeDriver and FirefoxDriver.
	 */
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}


interface Camera
{
	void takePicture();
}

class ChromeDriver implements WebDriver, Camera
{

	String driver = "ChromeDriver";
	
	@Override
	public void takePicture() {
		System.out.println("Take picture using " + driver);		
	}

	@Override
	public void openBrowser() {
		System.out.println("Open the browser using " + driver);
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close the browser using " + driver);
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window using " + driver);
	}

	@Override
	public void findElement() {
		System.out.println("Find element using " + driver);
	}
	
}

class FirefoxDriver implements WebDriver, Camera
{
	
	String driver = "FirefoxDriver";

	@Override
	public void takePicture() {
		System.out.println("Take picture using " + driver);		
	}

	@Override
	public void openBrowser() {
		System.out.println("Open the browser using " + driver);
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close the browser using " + driver);
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window using " + driver);
	}

	@Override
	public void findElement() {
		System.out.println("Find element using " + driver);
	}
	
}
