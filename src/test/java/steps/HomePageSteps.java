package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import config.DriverFactory;
import pages.HomePage;

import java.net.MalformedURLException;

public class HomePageSteps {

    private HomePage homePage = new HomePage();


    public HomePageSteps() throws MalformedURLException {
        // Initialize HomePage with the Appium driver from DriverFactory
        this.homePage = new HomePage();
    }
    @Given("I click on App Option")
    public void i_click_on_app_option() {
        homePage.clickDemoAPIApp();
    }

    @When("I click on Alarm Option")
    public void i_click_on_alarm_option() {
        homePage.clickDemoAPIAlarm();
    }
}
