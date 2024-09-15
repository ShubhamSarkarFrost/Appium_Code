package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue = {"steps", "hooks"},
        plugin = {"pretty","html:target/cucumber-reports/report", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        monochrome = true,
        publish = true

)

public class TestRunner {
}
