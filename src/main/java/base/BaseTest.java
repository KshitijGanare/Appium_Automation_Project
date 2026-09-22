package base;

import java.net.MalformedURLException; 
import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	
	public AndroidDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();

		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setDeviceName("emulator-5554");
		options.setApp("C:\\Users\\KshitijRajuGanare\\OneDrive - Truworth Health Technologies Private Limited\\Desktop\\New folder\\Appium\\ApiDemos-debug.apk");         
		
		URL url = new URL("http://127.0.0.1:4723");
		
		driver = new AndroidDriver(url, options);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
	}

}

