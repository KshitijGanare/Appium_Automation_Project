package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_AppLifecycle extends BaseTest {

    @Test
    public void appActivateTest(){
        driver.activateApp("io.appium.android.apis");
    }

    @Test
    public void appTerminateTest(){
        driver.activateApp("io.appium.android.apis");
        driver.terminateApp("io.appium.android.apis");
        driver.runAppInBackground(Duration.ofSeconds(5));
    }

}

