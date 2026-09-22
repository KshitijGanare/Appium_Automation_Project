package utils;

import io.appium.java_client.android.AndroidDriver;
import pages.Accessibility.Accessibility_Page;
import pages.App.AlertDialogs_Page;
import pages.App.App_Page;
import pages.Home_Page;

public class PageObjectManager {

        private AndroidDriver driver;

        private Home_Page homePage;
        private App_Page appPage;
        private AlertDialogs_Page alertDialogsPage;
        private Accessibility_Page accessibilityPage;

        public PageObjectManager(AndroidDriver driver) {
            this.driver = driver;
        }

        public Home_Page getHomePage() {
            if (homePage == null) {
                homePage = new Home_Page(driver);
            }
            return homePage;
        }

        public App_Page getAppPage() {
            if (appPage == null) {
                appPage = new App_Page(driver);
            }
            return appPage;
        }

        public AlertDialogs_Page getAlertDialogsPage() {
            if (alertDialogsPage == null) {
                alertDialogsPage = new AlertDialogs_Page(driver);
            }
            return alertDialogsPage;
        }

        public Accessibility_Page getAccessibilityPage(){
            accessibilityPage = new Accessibility_Page(driver);
            return accessibilityPage;
        }

}
