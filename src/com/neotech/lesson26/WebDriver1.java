package com.neotech.lesson26;

public interface WebDriver1 {
	void open();
	void close();
	String getTitle();	
}
interface TakesScreenshot1 {
		void getScreenshot();
}
interface RemoteWebDriver1 extends WebDriver1, TakesScreenshot1 {
		void navigate();
}
class ChromeDriver1 implements RemoteWebDriver1 {

	@Override
	public void open() {
		System.out.println("Chrome browser opened.");	
	}

	@Override
	public void close() {
		System.out.println("Chrome browser closed.");
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome browser.");
		return null;
	}

	@Override
	public void getScreenshot() {
		System.out.println("Chrome browser schreenshot taken.");
	}

	@Override
	public void navigate() {
		System.out.println("Navigated by Chrome browser.");
	}
	
}

class FirefoxDriver1 implements RemoteWebDriver1 {

	@Override
	public void open() {
		System.out.println("Firefox browser opened.");	
	}

	@Override
	public void close() {
		System.out.println("Firefox browser closed.");
	}

	@Override
	public String getTitle() {
		System.out.println("Firefox browser.");
		return null;
	}

	@Override
	public void getScreenshot() {
		System.out.println("Firefox browser screenshot taken.");
	}

	@Override
	public void navigate() {
		System.out.println("Navigated by Firefox browser.");
	}
	
}

class SafariDriver1 implements RemoteWebDriver1 {

	@Override
	public void open() {
		System.out.println("Safari browser opened.");	
	}

	@Override
	public void close() {
		System.out.println("Safari browser closed.");
	}

	@Override
	public String getTitle() {
		System.out.println("Safari browser.");
		return null;
	}

	@Override
	public void getScreenshot() {
		System.out.println("Safari browser screenshot taken.");
	}

	@Override
	public void navigate() {
		System.out.println("Navigated by Safari browser.");
	}
	
}