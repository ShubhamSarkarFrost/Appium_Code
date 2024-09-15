package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    // Static block to load properties when the class is initialized
    static {
        try {
            // Load the properties file from the specified path
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve values by key
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
