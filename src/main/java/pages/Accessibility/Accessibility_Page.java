package pages.Accessibility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Accessibility_Page{

    private AndroidDriver driver;

    public Accessibility_Page(AndroidDriver driver){
         this.driver = driver;
    }

    public void clickAccessibilityNodeProviderOption(){
        driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
    }

    public Boolean checkClickAccessibilityNodeProviderPageTextIsPresent(){
        Boolean textIsPresent = driver.findElement(AppiumBy.accessibilityId("Enable TalkBack and Explore-by-touch from accessibility settings. Then touch the colored squares.")).isDisplayed();
        return textIsPresent;
    }

}
