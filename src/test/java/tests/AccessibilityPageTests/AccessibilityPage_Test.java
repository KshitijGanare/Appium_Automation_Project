package tests.AccessibilityPageTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PageObjectManager;

public class AccessibilityPage_Test extends BaseTest {

    private PageObjectManager pageObjectManager;

    @BeforeMethod
    public void initialization(){
        this.pageObjectManager = new PageObjectManager(driver);
    }

    @Test
    public void clickAccessibilityNodeProviderOptionTest(){
        pageObjectManager.getHomePage().clickAccessibility();
        pageObjectManager.getAccessibilityPage().clickAccessibilityNodeProviderOption();
        Assert.assertTrue(pageObjectManager.getAccessibilityPage().checkClickAccessibilityNodeProviderPageTextIsPresent());
    }


}
