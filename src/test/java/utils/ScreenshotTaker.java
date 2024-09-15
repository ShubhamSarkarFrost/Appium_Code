package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import static config.DriverFactory.getDriver;

public class ScreenshotTaker {
    public static void captureScreenshot(Scenario scenario) {
        try {
            // Create a timestamp for the screenshot filename
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

            // Create the screenshot directory if not present
            Files.createDirectories(Paths.get("target/screenshots/"));

            // Take the screenshot using Appium
            File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

            // Construct screenshot file name
            String screenshotName = scenario.getName().replaceAll(" ", "_") + "_" + timestamp + ".png";
            File destinationFile = new File("target/screenshots/" + screenshotName);

            // Copy the screenshot to the desired location
            Files.copy(screenshot.toPath(), destinationFile.toPath());

            // Attach the screenshot to the Cucumber report (if using a reporting tool like Allure)
            byte[] fileContent = Files.readAllBytes(destinationFile.toPath());
            scenario.attach(fileContent, "image/png", screenshotName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
