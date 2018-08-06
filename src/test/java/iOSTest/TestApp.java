package iOSTest;

import java.net.MalformedURLException;
import org.testng.annotations.*;

import com.mobile.MobileTest.*;

public class TestApp {
	
	@Test
	public void Test() throws MalformedURLException {
		AppTest.iOS_LaunchApp();
		
	}
	
	@AfterTest
	public void TearDown() {
		AppTest.CloseApp();
	}
	

}
