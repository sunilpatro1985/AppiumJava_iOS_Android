package androidTest;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import com.mobile.MobileTest.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling {
	
	public void scrollDown() {
		Dimension dimension = MobileDriver.getDriver().manage().window().getSize();
		
		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int scrollStart = scrollHeightStart.intValue();
		
		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();
		
		new TouchAction((PerformsTouchActions) MobileDriver.getDriver())
		.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
	}
	
	public WebElement getItemViews() {
		return MobileDriver.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Views']"));
	}
	
	public List<WebElement> getItemWebView(){
		return MobileDriver.getDriver().findElements(By.xpath("//android.widget.TextView[@text='WebView']"));
	}
	
	public void scrollTillWebView() throws InterruptedException {
		getItemViews().click();
		
		while(getItemWebView().size() == 0) {
			scrollDown();
		}
		
		if(getItemWebView().size() > 0) {
			getItemWebView().get(0).click();
		}
		Thread.sleep(4000);	
		
	}
	
}
