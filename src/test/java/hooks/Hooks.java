package hooks;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import config.DriverFactory;

import java.net.MalformedURLException;

import static utils.ScreenshotTaker.captureScreenshot;

public class Hooks {

    private static AndroidDriver driver;
    @Before
    public void setUp() throws Exception {
        // Initialize the Appium driver
        DriverFactory.getDriver();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        // Take screenshot After Every Step
            captureScreenshot(scenario);
    }

    @After
    public void tearDown() {
        //Quit the Driver
        DriverFactory.quitDriver();
    }

}
