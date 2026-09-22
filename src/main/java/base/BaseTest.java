package base;

import java.net.MalformedURLException; 
import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	
	public AndroidDriver driver;    // Used to control the Android device/app, AndroidDriver = Appium ka driver, jo standard WebDriver commands + Appium-specific mobile commands dono execute kar sakta hai.
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {            // Runs before each test method and sets up the Appium driver
		
		UiAutomator2Options options = new UiAutomator2Options();  // To setup Appium capabilities/options for an Android device using UiAutomator2

		options.setPlatformName("Android");                // Specify target platform
		options.setAutomationName("UiAutomator2");         // Specifies UiAutomator2 as the automation engine
		options.setDeviceName("emulator-5554");            // Specifies the Android emulator/device on which the test will run
		options.setApp("C:\\Users\\KshitijRajuGanare\\OneDrive - Truworth Health Technologies Private Limited\\Desktop\\New folder\\Appium\\ApiDemos-debug.apk");         
		
		URL url = new URL("http://127.0.0.1:4723");        // To connect with Appium server, IP address got from cmd after starting appium server
		
		driver = new AndroidDriver(url, options);         //  
		
	}
	
	
	@AfterMethod
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
	}

}





/*
 | AppiumBy method        | Finds using          |
| ---------------------- | -------------------- |
| `accessibilityId()`    | `content-desc`       |
| `id()`                 | `resource-id`        |
| `xpath()`              | XPath                |
| `androidUIAutomator()` | Android `UiSelector` |

  
  
*/
