package iOSTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mobile.MobileTest.*;

public class DatePickerWheel {
	
	public void setDateAndTime() {
		
		WebElement DatePickerListItem = MobileDriver.getDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name='Date Picker']"));
		DatePickerListItem.click();
		
		WebElement DatePickerWheel1 = 
				MobileDriver.getDriver().findElement(By.xpath("//XCUIElementTypeDatePicker"));
		
		List<WebElement> Columns =
				DatePickerWheel1.findElements(By.xpath("//XCUIElementTypePickerWheel"));
		
		JavascriptExecutor js = (JavascriptExecutor)MobileDriver.getDriver();
		Map<String, Object> hp = new HashMap<String, Object>();
		hp.put("order", "next");
		hp.put("offset", 0.15);
		hp.put("element", Columns.get(0));
		js.executeScript("mobile: selectPickerWheelValue", hp);
		
		System.out.println(Columns.get(0).getAttribute("value"));
		
		//OR
		
		/*Columns.get(1).sendKeys("9");
		Columns.get(2).sendKeys("30");
		Columns.get(3).sendKeys("PM");*/
				
	}	
}



//http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-gestures/#mobile-selectpickerwheelvalue
