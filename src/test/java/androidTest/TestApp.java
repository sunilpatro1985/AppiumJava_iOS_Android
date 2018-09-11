package androidTest;

import java.net.MalformedURLException;
import org.testng.annotations.*;

import com.mobile.MobileTest.*;

public class TestApp {
	
	@Test
	public void Test() throws MalformedURLException, InterruptedException {
		DriverFactory.Android_LaunchApp();
		Scrolling scroll = new Scrolling();
		scroll.scrollTillWebView();
	}
	
	@AfterTest
	public void TearDown() {
		DriverFactory.CloseApp();
	}
}
