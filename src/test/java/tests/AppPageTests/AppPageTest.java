package tests.AppPageTests;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PageObjectManager;
import utils.WaitUtils;

import java.time.Duration;

public class AppPageTest extends BaseTest {

    private PageObjectManager pageObjectManager;
    WaitUtils wait;

    @BeforeMethod
    public void initialization(){
        this.pageObjectManager = new PageObjectManager(driver);
        wait = new WaitUtils(driver);
    }

    @Test
    public void enterDetailsInEntryDialogTest(){
        pageObjectManager.getHomePage().clickApp();
        pageObjectManager.getAppPage().clickAlertDialogsOption();
        pageObjectManager.getAlertDialogsPage().clickTextEntryDialog();
        pageObjectManager.getAlertDialogsPage().enterDetailsInEntryDialog("Kshitij", "Test@123");

        Assert.assertTrue(wait.waitForInvisibility(AppiumBy.id("android:id/alertTitle")));
    }


}
