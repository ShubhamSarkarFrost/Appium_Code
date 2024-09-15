package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import config.DriverFactory;

import java.net.MalformedURLException;

public class HomePage {

    protected AndroidDriver driver;

    //locators
    private By App = By.xpath("//android.widget.TextView[@content-desc='App']");
    private By Alarm = By.xpath("//android.widget.TextView[@content-desc='Alarm']");

    // Constructor
    public HomePage() throws MalformedURLException {

        this.driver = DriverFactory.getDriver();
    }

    // Actions
    public void clickDemoAPIApp() {
        driver.findElement(App).click();
    }

    public void clickDemoAPIAlarm() {
        driver.findElement(Alarm).click();
    }
}
