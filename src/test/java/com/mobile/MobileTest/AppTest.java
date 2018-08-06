package com.mobile.MobileTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppTest 
{
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	
	public static void Android_LaunchApp() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "pixelxlo26");
		cap.setCapability("appPackage", "com.example.android.apis");
		cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
	}
	
	public static void iOS_LaunchApp() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "iOS");
		cap.setCapability("deviceName", "iPhone 8 Plus");
		cap.setCapability("platformVersion", "11.3");
		cap.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
	}
	public static void CloseApp() {
		driver.quit();
	}
}
