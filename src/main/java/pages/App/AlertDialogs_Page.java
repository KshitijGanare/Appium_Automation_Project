package pages.App;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertDialogs_Page {

    private AndroidDriver driver;
    private WebDriverWait wait;

    private final By nameInputField = AppiumBy.id("io.appium.android.apis:id/username_edit");
    private final By passwordInputField = AppiumBy.id("io.appium.android.apis:id/password_edit");
    private final By okBtn = AppiumBy.id("android:id/button1");



    public AlertDialogs_Page(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    private final By okCancelDialog =
            AppiumBy.accessibilityId("OK Cancel dialog with a message");

    private final By okCancelLongMessage =
            AppiumBy.accessibilityId("OK Cancel dialog with a long message");

    private final By okCancelUltraLongMessage =
            AppiumBy.accessibilityId("OK Cancel dialog with ultra long message");

    private final By listDialog =
            AppiumBy.accessibilityId("List dialog");

    private final By progressDialog =
            AppiumBy.accessibilityId("Progress dialog");

    private final By singleChoiceList =
            AppiumBy.accessibilityId("Single choice list");

    private final By repeatAlarm =
            AppiumBy.accessibilityId("Repeat alarm");

    private final By sendCallToVoiceMail =
            AppiumBy.accessibilityId("Send Call to VoiceMail");

    private final By textEntryDialog =
            AppiumBy.accessibilityId("Text Entry dialog");

    private final By traditionalThemeDialog =
            AppiumBy.accessibilityId(
                    "OK Cancel dialog with traditional theme"
            );

    private final By holoLightThemeDialog =
            AppiumBy.accessibilityId(
                    "OK Cancel dialog with Holo Light theme"
            );



    // Actions
    public void clickOkCancelDialog() {
        driver.findElement(okCancelDialog).click();
    }

    public void clickOkCancelLongMessage() {
        driver.findElement(okCancelLongMessage).click();
    }

    public void clickOkCancelUltraLongMessage() {
        driver.findElement(okCancelUltraLongMessage).click();
    }

    public void clickListDialog() {
        driver.findElement(listDialog).click();
    }

    public void clickProgressDialog() {
        driver.findElement(progressDialog).click();
    }

    public void clickSingleChoiceList() {
        driver.findElement(singleChoiceList).click();
    }

    public void clickRepeatAlarm() {
        driver.findElement(repeatAlarm).click();
    }

    public void clickSendCallToVoiceMail() {
        driver.findElement(sendCallToVoiceMail).click();
    }

    public void clickTextEntryDialog() {
        driver.findElement(textEntryDialog).click();
    }

    public void clickTraditionalThemeDialog() {
        driver.findElement(traditionalThemeDialog).click();
    }

    public void clickHoloLightThemeDialog() {
        driver.findElement(holoLightThemeDialog).click();
    }

    public void enterDetailsInEntryDialog(String username, String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInputField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInputField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
    }

}