package com.mobile.MobileTest;

import org.openqa.selenium.WebDriver;

public class MobileDriver {
	
	private static WebDriver Driver;
	
	public static WebDriver getDriver() {
		return Driver;
	}
	
	static void setWebDriver(WebDriver driver) {
		Driver = driver;
	}
}
