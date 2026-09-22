package pages.App;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class App_Page {

    private AndroidDriver driver;

    private final By alertDialogsOption = AppiumBy.accessibilityId("Alert Dialogs");
    private final By textEntryDialogOption = AppiumBy.accessibilityId("Text Entry dialog");

    public App_Page(AndroidDriver driver){
         this.driver = driver;
    }

    public void clickAlertDialogsOption(){
        driver.findElement(alertDialogsOption).click();
    }

    public void clickTextEntryDialog(){
        driver.findElement(textEntryDialogOption).click();
    }



    public Boolean checkClickAccessibilityNodeProviderPageTextIsPresent(){
        Boolean textIsPresent = driver.findElement(AppiumBy.accessibilityId("Enable TalkBack and Explore-by-touch from accessibility settings. Then touch the colored squares.")).isDisplayed();
        return textIsPresent;
    }

}
