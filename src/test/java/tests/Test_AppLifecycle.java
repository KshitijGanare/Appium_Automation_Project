package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_AppLifecycle extends BaseTest {

    @Test
    public void appActivateTest(){
        driver.activateApp("io.appium.android.apis");   // If the app is installed but currently in background/not active, bring it to foreground.
    }

    @Test
    public void appTerminateTest(){
        driver.activateApp("io.appium.android.apis");
        driver.terminateApp("io.appium.android.apis");   // Close/terminate the application.
        driver.runAppInBackground(Duration.ofSeconds(5));        // Send the app to background for 5 seconds.
    }

}


/*

// App Lifecycle
activateApp("PACKAGE_NAME");
terminateApp("PACKAGE_NAME");
runAppInBackground("PACKAGE_NAME");

## To get package name run command
adb shell pm list packages




 */