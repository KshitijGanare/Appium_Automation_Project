package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Home_Page {

    private AndroidDriver driver;

    // Constructor
    public Home_Page(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By accessibility = AppiumBy.accessibilityId("Accessibility");
    private final By animation = AppiumBy.accessibilityId("Animation");
    private final By app = AppiumBy.accessibilityId("App");
    private final By content = AppiumBy.accessibilityId("Content");
    private final By graphics = AppiumBy.accessibilityId("Graphics");
    private final By media = AppiumBy.accessibilityId("Media");
    private final By nfc = AppiumBy.accessibilityId("NFC");
    private final By os = AppiumBy.accessibilityId("OS");
    private final By preference = AppiumBy.accessibilityId("Preference");
    private final By text = AppiumBy.accessibilityId("Text");
    private final By views = AppiumBy.accessibilityId("Views");



    // Actions Methods

    public void clickAccessibility() {
        driver.findElement(accessibility).click();
    }

    public void clickAnimation() {
        driver.findElement(animation).click();
    }

    public void clickApp() {
        driver.findElement(app).click();
    }

    public void clickContent() {
        driver.findElement(content).click();
    }

    public void clickGraphics() {
        driver.findElement(graphics).click();
    }

    public void clickMedia() {
        driver.findElement(media).click();
    }

    public void clickNFC() {
        driver.findElement(nfc).click();
    }

    public void clickOS() {
        driver.findElement(os).click();
    }

    public void clickPreference() {
        driver.findElement(preference).click();
    }

    public void clickText() {
        driver.findElement(text).click();
    }

    public void clickViews() {
        driver.findElement(views).click();
    }
}