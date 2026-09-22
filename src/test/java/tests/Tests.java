package tests;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PageObjectManager;

import java.util.Map;

public class Tests extends BaseTest {

    PageObjectManager pageObject;

    @BeforeMethod
    public void initializePages() {
        pageObject = new PageObjectManager(driver);
    }

    @Test
    public void clickAccessibility() {
        pageObject.getHomePage().clickAccessibility();
        System.out.println("Accessibility clicked successfully");
        Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).isDisplayed());

    }


    @Test
    public void testScroll() {
        pageObject.getHomePage().clickViews();
    }


    @Test
    public void longPress() {
        RemoteWebElement accessibilityOption =
                (RemoteWebElement) driver.findElement(
                        io.appium.java_client.AppiumBy.accessibilityId("Accessibility")
                );

        driver.executeScript(
                "mobile: longClickGesture",
                Map.of(
                        "elementId", accessibilityOption.getId(),
                        "duration", 2000
                )
        );
    }
}