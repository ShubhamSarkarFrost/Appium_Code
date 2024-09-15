package config;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.ConfigReader;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static AndroidDriver driver;
    private static AppiumDriverLocalService service;

    // Method to initialize the driver for Android
    public static AndroidDriver getDriver() throws MalformedURLException {
          if(driver == null) {
              //Start the Appium Server
              System.out.println("******************** Start the Appium server ************************");
              // Start the Appium server locally if not already running
              service = AppiumDriverLocalService.buildDefaultService();
              service.start();

              // Get the path to the project directory
              String projectDir = System.getProperty("user.dir");



              DesiredCapabilities cap = new DesiredCapabilities();

              // Get values from config.properties
              String PlatformName = ConfigReader.getProperty("platformName");
              String PlatformVersion = ConfigReader.getProperty("platformVersion");
              String DeviceName = ConfigReader.getProperty("deviceName");
              String AutomationName = ConfigReader.getProperty("automationName");
              String ApkName = ConfigReader.getProperty("apkName");
              String ServerURL = ConfigReader.getProperty("serverURL");

              // Set the relative path to your APK file
              String apkPath = projectDir + File.separator + "apps" + File.separator + ApkName;


              cap.setCapability("platformName", PlatformName);
              cap.setCapability("platformVersion", PlatformVersion);
              cap.setCapability("deviceName", DeviceName);
              cap.setCapability("automationName", AutomationName);
              cap.setCapability("app", apkPath);  // Path to the APK file
              driver = new AndroidDriver(new URL(ServerURL), cap);

          }
        return driver;
    }

    // Method to quit the driver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        //stop appium service
        System.out.println("******************** Stop the Appium server ************************");
        if (service != null) {
            service.stop();
        }
    }

}
