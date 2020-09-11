package ui;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {
    private Properties properties;
    private final String propertyFilePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";

    public ConfigRead() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getUrl() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("No URL Found");
        }
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) {
            return browser;
        } else {
            throw new RuntimeException("No Browser Found");
        }
    }

    public String getUserName(String userName) {
        try {
            return properties.getProperty(userName);
        } catch (Exception e) {
            throw new RuntimeException("No User Name Found");
        }
    }

    public String getPassword(String password) {
        try {
            return properties.getProperty(password);
        } catch (Exception e) {
            throw new RuntimeException("No Password Found");
        }
    }
}